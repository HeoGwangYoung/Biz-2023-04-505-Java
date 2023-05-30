package com.callor.shop.config;

public class DBContract {

	// DB 연결 정보를 변수로 선언
	public static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "shopping";
	public static final String PASSWORD = "12341234";

	public static class TABLE {
		public static final String PRODUCT = " tbl_product ";
		public static final String BUYER = " tbl_buyer ";
		public static final String IOLIST = " tbl_iolist ";
	}

	public static class COLUMN {
		public static class PRODUCT {
			
			public static final String P_CODE = "pCode";
			public static final String P_NAME = "pName";
			public static final String P_ITEM = "pItem";
			public static final String P_IPRICE = "pIPrice";
			public static final String P_OPRICE = "pOPrice";

			
		}
		public static class BUYER {
			
			public static final String BU_ID = "buId";
			public static final String BU_NAME = "buName";
			public static final String BU_TEL = "buTel";
			public static final String BU_ADDR = "buAddr";
			
		}
		public static class IOLIST {
			
			public static final String IO_SEQ = "ioSEQ";
			public static final String IO_DATE = "ioDate";
			public static final String IO_TIME = "ioTime";
			public static final String IO_BUID = "ioBuId";
			public static final String IO_PCODE = "ioPCode";
			public static final String IO_QUAN = "ioQuan";
			public static final String IO_PRICE = "ioPrice";

		}
	}
}
