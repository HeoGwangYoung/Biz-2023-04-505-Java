package com.bus.config;

/*
 * DBMS 접속정보,
 * 테이블 정보
 * 칼럼 정보를 static 변수로 선언하는 클래스
 */
public class DBContract {
	// oracle DBMS 접속 정보 설정
	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "buslist";
	public static final String PASSWORD = "12341234";

	// table 정보 설정
	public static class TABLE {
		public static final String BUSLIST = "tbl_buslist";
	}

	// 칼럼 index 정보 설정
	public static class INDEX {
		public static class BUYER {
			public static final int BSDEPID = 2;
			public static final int BSDEPNM = 3;
			public static final int BSDEPPLANEDTM = 4;
			public static final int BSARRID = 5;
			public static final int BSARRNM = 6;
			public static final int BSARRPLANEDTM = 7;
			public static final int CHARGE = 8;
		}
	}
}
