package com.bus.persistance.sql;

public class BusSQL {
	public static final String INSERT = " INSERT INTO tbl_buslist (BSDEPID, BSDEPNM, BSDEPPLANEDTM, BSARRID, BSARRNM, BSARRPLANEDTM, CHARGE, GRADENM) "
			+ " VALUES(#{depTerminalId}, #{depPlaceNm}, #{depPlandTime},"
				   + " #{arrTerminalId}, #{arrPlaceNm}, #{arrPlandTime},"
				   + " #{charge}, #{gradeNm}) ";

}
