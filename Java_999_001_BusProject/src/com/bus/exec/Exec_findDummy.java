package com.bus.exec;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bus.config.DBConnection;
import com.bus.models.BusDto;
import com.bus.models.TerminalDto;
import com.bus.persistance.BusDao;
import com.bus.service.api.Test_SearchAll_Terminal;
import com.bus.service.api.Test_SearchGwangju_Terminal;
import com.bus.service.api.Test_findDummy_Terminal;

public class Exec_findDummy {

	public static void main(String[] args) {
		
		SqlSession session = DBConnection.getSessionFactory().openSession(true);
		BusDao busDao = session.getMapper(BusDao.class);
		
		
		Test_SearchGwangju_Terminal gwangju_loadserv = new Test_SearchGwangju_Terminal();
		Test_SearchAll_Terminal all_loadserv = new Test_SearchAll_Terminal();
		
		Test_findDummy_Terminal findserv = new Test_findDummy_Terminal();
		
		List<TerminalDto> gwangju_TerList = null;
		List<TerminalDto> all_TerList = null;
		List<BusDto> busList = null;
		try {
			gwangju_TerList = gwangju_loadserv.goURL_SearchTerminal();
			all_TerList = all_loadserv.goURL_SearchTerminal();
			for (TerminalDto depTerdto : gwangju_TerList) {
				int count = 0;
				int findIndex = 0;
				System.out.println(depTerdto.terminalNm + " 에 연결된 정류장 찾는중 ");
				for (TerminalDto arrTerdto : gwangju_TerList) {
					findIndex ++;
					busList = findserv.goURL_SearchTerminal(depTerdto, arrTerdto, "20230620");
					System.out.println("찾는 중" + findIndex);
					if(busList != null) {
						count ++;
						for (BusDto busDto : busList) {
							busDao.insert(busDto);
						}
					} 
				}
				
				System.out.println(depTerdto.terminalNm + " 에 연결된 정류소" + count);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
