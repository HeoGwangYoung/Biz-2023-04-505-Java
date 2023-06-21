package com.bus.persistance;

import org.apache.ibatis.annotations.Insert;

import com.bus.models.TerLinkDto;
import com.bus.persistance.sql.TerLinkSQL;



public interface TerLinkDao {

	@Insert(TerLinkSQL.INSERT)
	public int insert(TerLinkDto dto);

}
