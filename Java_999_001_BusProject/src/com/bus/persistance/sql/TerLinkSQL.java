package com.bus.persistance.sql;

public class TerLinkSQL {
	public static final String INSERT = " INSERT INTO tbl_terlink (DEPTERID, DEPTERNM, ARRTERID, ARRTERNM) "
			+ " VALUES(#{depTerID}, #{depTerNM}, #{arrTerID}, #{arrTerNM}) ";
}
