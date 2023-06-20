package com.bus.persistance.sql;

public class BusSQL {
	public static final String INSERT = " INSERT INTO tbl_buslist (bsdepid, bsdepnm, bsdepplanedtm, bsarrid, bsarrnm, bsarrplanedtm, charge) "
			+ " VALUES(#{bsdepid}, #{bsdepnm}, #{bsdepplanedtm}, #{bsarrid}, #{bsarrnm}, #{bsarrplanedtm}, {charge}) ";
//	bsdepid, bsdepnm, bsdepplanedtm, bsarrid, bsarrnm, bsarrplanedtm, charge
}
