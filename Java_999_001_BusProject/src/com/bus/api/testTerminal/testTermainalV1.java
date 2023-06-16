package com.bus.api.testTerminal;

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

import com.bus.api.search.Terminal.TerminalDto;

public class testTermainalV1 {

	public static void main(String[] args) throws IOException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1613000/SuburbsBusInfoService/getSuberbsBusTrminlList"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
				+ "");/* 서비스 키 */
		urlBuilder
				.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("30", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append("&" + URLEncoder.encode("_type", "UTF-8") + "="
				+ URLEncoder.encode("json", "UTF-8")); /* 데이터 타입(xml, json) */
//		urlBuilder.append(
//				"&" + URLEncoder.encode("terminalNm", "UTF-8") + "=" + URLEncoder.encode("서울남부", "UTF-8")); /* 터미널명 */
		urlBuilder.append("&" + URLEncoder.encode("cityCode", "UTF-8") + "="
				+ URLEncoder.encode("24", "UTF-8")); /* 도시코드 24 = 광주 광역시 */
		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
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
		System.out.println(data);

		try {
			JSONParser parser = new JSONParser();
			JSONObject jsonObject = (JSONObject) parser.parse(data);
			JSONObject response = (JSONObject) jsonObject.get("response");
			JSONObject body = (JSONObject) response.get("body");
			JSONObject items = (JSONObject) body.get("items");

			JSONArray item = (JSONArray) items.get("item");

			List<TerminalDto> terList = new ArrayList<>();

			for (int i = 0; i < item.size(); i++) {
				JSONObject obj = (JSONObject) item.get(i);
				String cityName = (String) (obj.get("cityName"));
				String terId = (String) (obj.get("terminalId"));
				String terNm = (String) (obj.get("terminalNm"));

				TerminalDto dto = new TerminalDto();
				dto.cityName = cityName;
				dto.terminalId = terId;
				dto.terminalNm = terNm;

				terList.add(dto);
			}

			for (TerminalDto terminalDto : terList) {
				System.out.println("도시이름 : " + terminalDto.cityName);
				System.out.println("터미널id : " + terminalDto.terminalId);
				System.out.println("터미널이름 : " + terminalDto.terminalNm);
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
