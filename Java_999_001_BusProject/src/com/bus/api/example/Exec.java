package com.bus.api.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bus.api.search.Terminal.TerminalDto;

public class Exec {
	public static void main(String[] args) {
		Test_SearchAll_Terminal serv = new Test_SearchAll_Terminal();
		
		try {
			List<TerminalDto> terList = new ArrayList<>();
			terList = serv.goURL_SearchTerminal();
			int index = 0;
			for (TerminalDto terminalDto : terList) {
				System.out.println("-------------------");
				System.out.println(index +" 번 데이터");
				System.out.println(terminalDto.cityName);
				System.out.println(terminalDto.terminalId);
				System.out.println(terminalDto.terminalNm);
				System.out.println("-------------------");
				System.out.println();
				index ++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
