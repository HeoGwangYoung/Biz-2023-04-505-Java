package com.bus.exec;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bus.config.DBConnection;
import com.bus.models.BusDto;
import com.bus.models.TerLinkDto;
import com.bus.models.TerminalDto;
import com.bus.persistance.BusDao;
import com.bus.persistance.TerLinkDao;
import com.bus.service.api.Test_SearchAll_Terminal;
import com.bus.service.api.Test_SearchGwangju_Terminal;
import com.bus.service.api.Test_findDummy_Bus;
import com.bus.service.api.Test_findDummy_Terminal;

public class Exec_FindLinkTer {

	public static void main(String[] args) {

		SqlSession session = DBConnection.getSessionFactory().openSession(true);
		TerLinkDao terDao = session.getMapper(TerLinkDao.class);

		Test_SearchGwangju_Terminal gwangju_loadserv = new Test_SearchGwangju_Terminal();
		Test_SearchAll_Terminal all_loadserv = new Test_SearchAll_Terminal();

		Test_findDummy_Terminal findserv = new Test_findDummy_Terminal();

		List<TerminalDto> gwangju_TerList = null;
		List<TerminalDto> all_TerList = null;
		List<TerLinkDto> linkTerList = null;
		try {
			gwangju_TerList = gwangju_loadserv.goURL_SearchTerminal();
			all_TerList = all_loadserv.goURL_SearchTerminal();

			System.out.println(gwangju_TerList.size());
			TerminalDto depTerdto = gwangju_TerList.get(7);

			int count = 0;
			int findIndex = 0;
			System.out.println(depTerdto.terminalNm + " 에 연결된 정류장 찾는중 ");
			for (TerminalDto arrTerdto : all_TerList) {
				findIndex++;
				linkTerList = findserv.goURL_SearchTerminal(depTerdto, arrTerdto, "20230626");
				System.out.println("찾는 중" + findIndex);
				if (linkTerList != null) {
					count++;
					TerLinkDto linkDto = linkTerList.get(0);
					terDao.insert(linkDto);
				}

			}
			System.out.println(depTerdto.terminalNm + " 에 연결된 정류소" + count);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
