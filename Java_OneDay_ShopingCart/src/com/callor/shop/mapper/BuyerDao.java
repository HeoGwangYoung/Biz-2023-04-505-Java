package com.callor.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.callor.shop.mapper.sql.ShoppingSQL;
import com.callor.shop.models.BuyerDto;

public interface BuyerDao {
	@Select(" SELECT * FROM tbl_buyer ")
	public List<BuyerDto> selectAll();

	@Select(" SELECT * FROM tbl_buyer WHERE buId = #{id} ")
	public BuyerDto findById(String id);

	@Select("SELECT * FROM tbl_buyer WHERE buName LIKE '%' || #{name} || '%'")
	public List<BuyerDto> findByName(String name);

	@Insert(ShoppingSQL.BUYER_INSERT)
	public int insert(BuyerDto dto);

	@Update(ShoppingSQL.BUYER_UPDATE)
	public int update(BuyerDto dto);
}
