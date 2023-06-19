package com.bus.api.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bus.api.search.Terminal.BusDto;
import com.bus.api.search.Terminal.TerminalDto;

public class Exec_findDummy {

	public static void main(String[] args) {
		Test_SearchGwangju_Terminal loadserv = new Test_SearchGwangju_Terminal();
		Test_findDummy_Terminal findserv = new Test_findDummy_Terminal();
		
		List<TerminalDto> terList = null;
		List<BusDto> busList = null;
		List<List<BusDto>> busListAll = new ArrayList<>();
		try {
			terList = loadserv.goURL_SearchTerminal();
			for (TerminalDto terdto : terList) {
				int count = 0;
				for (TerminalDto terdtoarr : terList) {
					busList = findserv.goURL_SearchTerminal(terdto, terdtoarr, "20230616");
					
					if(busList != null) {
						busListAll.add(busList);
						count ++;
					} 
				}
				
				System.out.println(terdto.terminalNm + " 에 연결된 정류소" + count);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
