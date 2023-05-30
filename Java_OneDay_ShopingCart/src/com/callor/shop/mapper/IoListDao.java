package com.callor.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.callor.shop.mapper.sql.ShoppingSQL;
import com.callor.shop.models.IolistDto;

public interface IoListDao {
	@Select(" SELECT * FROM tbl_iolist ")
	public List<IolistDto> selectAll();

	@Select("SELECT * FROM tbl_iolist WHERE ioDate BETWEEN #{arg0} AND #{arg1}")
	public List<IolistDto> findByDate(String arg0, String arg1);

	@Select(" SELECT * FROM tbl_iolist WHERE ioBuId = #{id} ")
	public List<IolistDto> findById(String id);
	
	@Select(" SELECT * FROM tbl_iolist WHERE ioPCode = #{code} ")
	public List<IolistDto> findByCode(String code);
	
	@Select("SELECT * FROM tbl_iolist WHERE ioDate BETWEEN #{arg0} AND #{arg1} AND ioBuId = #{arg2}")
	public List<IolistDto> findByDateAndId(String arg0, String arg1, String arg2);
	
	@Insert(ShoppingSQL.IOLIST_INSERT)
	public int insert(IolistDto dto);

}
