package com.bus.service.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bus.models.BusDto;
import com.bus.models.TerminalDto;

/*
 * http://apis.data.go.kr/1613000/SuburbsBusInfoService/getStrtpntAlocFndSuberbsBusInfo
 * ?serviceKey=인증키(URL Encode)
 * &depTerminalId=NAI0671801
 * &arrTerminalId=NAI3214401
 * &depPlandTime=20211201
 * &numOfRows=100&pageNo=1
 * &_type=json
 */
public class Test_findDummy_Terminal {

	public List<BusDto> goURL_SearchTerminal(TerminalDto depDto, TerminalDto arrDto, String time) throws IOException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1613000/SuburbsBusInfoService/getStrtpntAlocFndSuberbsBusInfo"); /* URL */
		
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=57j0OF8PJ75oTqWditc%2Be4vaigu%2BJBAlFoFOuq2x6B3LqcQ4Gl6ITC8QumWD%2Fh3nI8g277R9fRMFcN%2BFWnYeSQ%3D%3D"); /* 서비스 키 */
		
		urlBuilder.append("&" + URLEncoder.encode("depTerminalId", "UTF-8") + "=" + URLEncoder.encode(depDto.terminalId, "UTF-8"));/* 출발 정류장 */
		
		urlBuilder.append("&" + URLEncoder.encode("arrTerminalId", "UTF-8") + "=" + URLEncoder.encode(arrDto.terminalId, "UTF-8"));/* 도착 정류장 */
		
		urlBuilder.append("&" + URLEncoder.encode("depPlandTime", "UTF-8") + "=" + URLEncoder.encode(time, "UTF-8"));/* 오늘 날짜*/
		
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="+ URLEncoder.encode("3000", "UTF-8")); /* 한 페이지 결과 수 */
		
		urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		
		urlBuilder.append("&" + URLEncoder.encode("_type", "UTF-8") + "="+ URLEncoder.encode("json", "UTF-8")); /* 데이터 타입(xml, json) */
		
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
//		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();

		String data = sb.toString();
		
		List<BusDto> busList = new ArrayList<>();
		
		try {
			JSONParser parser = new JSONParser();
			JSONObject jsonObject = (JSONObject) parser.parse(data);
			JSONObject response = (JSONObject) jsonObject.get("response");
			JSONObject body = (JSONObject) response.get("body");
			JSONObject items = (JSONObject) body.get("items");
			
			if (items.get("item") instanceof JSONArray) {
			    JSONArray itemArray = (JSONArray) items.get("item");
			    // item이 JSONArray인 경우 처리
			    for (Object obj : itemArray) {
			        JSONObject item = (JSONObject) obj;
			        // item 처리
			        String arrPlaceNm = item.get("arrPlaceNm")+"";
					String routeId = item.get("routeId")+"";
					String depPlaceNm = item.get("depPlaceNm")+"";
					String gradeNm = item.get("gradeNm")+"";
					String arrPlandTime = item.get("arrPlandTime")+"";
					String depPlandTime = item.get("depPlandTime")+"";
					String charge = item.get("charge")+"";
					
					BusDto dto = new BusDto();
					dto.arrPlaceNm = arrPlaceNm;
					dto.arrPlandTime = arrPlandTime;
					dto.charge = charge;
					dto.depPlaceNm = depPlaceNm;
					dto.depPlandTime = depPlandTime;
					dto.gradeNm = gradeNm;
					dto.routeId = routeId;
					
					busList.add(dto);
			    }
			} else if (items.get("item") instanceof JSONObject) {
			    JSONObject item = (JSONObject) items.get("item");
			    // item이 JSONObject인 경우 처리
			    // item 처리
			    String arrPlaceNm = item.get("arrPlaceNm")+"";
				String routeId = item.get("routeId")+"";
				String depPlaceNm = item.get("depPlaceNm")+"";
				String gradeNm = item.get("gradeNm")+"";
				String arrPlandTime = item.get("arrPlandTime")+"";
				String depPlandTime = item.get("depPlandTime")+"";
				String charge = item.get("charge")+"";
				
				BusDto dto = new BusDto();
				dto.arrPlaceNm = arrPlaceNm;
				dto.arrPlandTime = arrPlandTime;
				dto.charge = charge;
				dto.depPlaceNm = depPlaceNm;
				dto.depPlandTime = depPlandTime;
				dto.gradeNm = gradeNm;
				dto.routeId = routeId;
				
				busList.add(dto);
			}
			
			System.err.println(depDto.terminalNm +"	과		"+ arrDto.terminalNm + " 		는 연결되있습니다");
			System.err.println(depDto.terminalNm + " 에 데이터 추가중입니다");
			return busList;
			
		} catch (Exception e) {
			
//			System.out.println(depDto.terminalNm +" 은               더미 데이터 입니다");
			return null;
		}
	}
}
