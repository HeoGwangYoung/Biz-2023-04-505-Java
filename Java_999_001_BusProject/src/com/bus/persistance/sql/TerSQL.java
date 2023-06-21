package com.bus.persistance.sql;

public class TerSQL {
	public static final String INSERT = " INSERT INTO tbl_buslist (TERDEPID, TERDEPNM, ARRDEPID, ARRDEPNM) "
			+ " VALUES(#{terDepId}, #{terDepNm}, #{arrDepId}, #{arrDepNm}) ";
}
