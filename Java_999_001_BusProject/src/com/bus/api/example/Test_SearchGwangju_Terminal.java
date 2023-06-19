package com.bus.api.example;

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

public class Test_SearchGwangju_Terminal {

	public List<TerminalDto> goURL_SearchTerminal() throws IOException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1613000/SuburbsBusInfoService/getSuberbsBusTrminlList"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=57j0OF8PJ75oTqWditc%2Be4vaigu%2BJBAlFoFOuq2x6B3LqcQ4Gl6ITC8QumWD%2Fh3nI8g277R9fRMFcN%2BFWnYeSQ%3D%3D");
		urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("3000", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append("&" + URLEncoder.encode("_type", "UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /* 데이터 타입(xml, json) */
		urlBuilder.append("&" + URLEncoder.encode("cityCode", "UTF-8") + "="+ URLEncoder.encode("24", "UTF-8"));
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

			return terList;

		} catch (Exception e) {
			return null;
		}
	}
}
