package com.bus.api.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BusAPI {

	public static void main(String[] args) throws IOException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/1613000/SuburbsBusInfoService/getSuberbsBusTrminlList"); /* URL */
		urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
				+ "=mgexvXSt9VjqiKmMfwOazwA5Und8vf3wnSTcXCZ0Vkdl%2BcoP%2BEdOYbLL55ZGHDViw07gNQYFWUIEgVTNQ57QCg%3D%3D"); /*
																														 * Service
																														 * Key
																														 */
		urlBuilder
				.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /* 페이지번호 */
		urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "="
				+ URLEncoder.encode("10", "UTF-8")); /* 한 페이지 결과 수 */
		urlBuilder.append("&" + URLEncoder.encode("_type", "UTF-8") + "="
				+ URLEncoder.encode("json", "UTF-8")); /* 데이터 타입(xml, json) */
		urlBuilder.append(
				"&" + URLEncoder.encode("terminalNm", "UTF-8") + "=" + URLEncoder.encode("서울남부", "UTF-8")); /* 터미널명 */
		urlBuilder.append(
				"&" + URLEncoder.encode("cityCode", "UTF-8") + "=" + URLEncoder.encode("11", "UTF-8")); /* 도시코드 */
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
            // JSONParser를 사용하여 JSON 파싱
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(data);
            JSONObject response = (JSONObject) jsonObject.get("response");
            JSONObject body = (JSONObject) response.get("body");
            JSONObject items = (JSONObject) body.get("items");
            JSONObject item = (JSONObject) items.get("item");

            // "items" 필드 처리
            Object itemsObj = body.get("items");
            if (itemsObj instanceof String && ((String) itemsObj).isEmpty()) {
                itemsObj = null; // 빈 문자열인 경우 null로 처리
            }

            Object itemsObj_item = items.get("item");
            if (itemsObj instanceof String && ((String) itemsObj).isEmpty()) {
                itemsObj = null; // 빈 문자열인 경우 null로 처리
            }
            
            Object item_cityName = item.get("cityName");
            if (itemsObj instanceof String && ((String) itemsObj).isEmpty()) {
                itemsObj = null; // 빈 문자열인 경우 null로 처리
            }
            Object item_terId = item.get("terminalId");
            if (itemsObj instanceof String && ((String) itemsObj).isEmpty()) {
                itemsObj = null; // 빈 문자열인 경우 null로 처리
            }
            Object item_terNm = item.get("terminalNm");
            if (itemsObj instanceof String && ((String) itemsObj).isEmpty()) {
                itemsObj = null; // 빈 문자열인 경우 null로 처리
            }
            
            // "totalCount" 필드 처리
            Object totalCountObj = body.get("totalCount");
            if (totalCountObj instanceof String) {
                try {
                    totalCountObj = Integer.parseInt((String) totalCountObj); // 문자열을 정수로 변환
                } catch (NumberFormatException e) {
                    totalCountObj = null; // 숫자로 변환할 수 없는 경우 null로 처리
                }
            }

            // 추출된 값을 사용하여 원하는 작업 수행
            // ...

            // 결과 출력
            System.out.println("Items: " + itemsObj);
            System.out.println("item : " + itemsObj_item);
            
            System.out.println("도시이름 : " + item_cityName);
            System.out.println("터미널id : " + item_terId);
            System.out.println("터미널이름 : " + item_terNm);
            
            System.out.println("Total Count: " + totalCountObj);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
