package com.bus.exec;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bus.models.BusDto;
import com.bus.models.TerminalDto;
import com.bus.service.api.Test_findDummy_Bus;

public class Exec_test {

	public static void main(String[] args) {
		Test_findDummy_Bus findserv = new Test_findDummy_Bus();
		
		TerminalDto depDto = new TerminalDto();
		depDto.cityName = null;
		depDto.terminalId = "NAI0671801";
		depDto.terminalNm = "유스퀘어";
		
		TerminalDto arrDto = new TerminalDto();
		arrDto.cityName = null;
		arrDto.terminalId = "NAI3214401";
		arrDto.terminalNm = "문화동";

		List<BusDto> busList = new ArrayList<>();
		try {
			busList = findserv.goURL_SearchTerminal(depDto, arrDto, "20230627");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(busList.size());
	}
}
