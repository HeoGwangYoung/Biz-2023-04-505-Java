package com.bus.persistance.sql;

public class TerLinkSQL {
	public static final String INSERT = " INSERT INTO tbl_terlink (TERDEPID, TERDEPNM, ARRDEPID, ARRDEPNM) "
			+ " VALUES(#{depTerID}, #{depTerNM}, #{arrTerID}, #{arrTerNM}) ";
}
