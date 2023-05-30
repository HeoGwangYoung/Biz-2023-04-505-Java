package com.callor.shop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.callor.shop.mapper.sql.ShoppingSQL;
import com.callor.shop.models.ProductDto;

public interface ProductDao {
	@Select("SELECT * FROM tbl_product ORDER BY pCode")
	public List<ProductDto> selectAll();

	@Select(" SELECT * FROM tbl_product WHERE pCode = #{code} ")
	public ProductDto findById(String code);

	@Select(" SELECT * FROM tbl_product WHERE pName = LIKE '%' || #{name} || '%' ")
	public List<ProductDto> findByName(String name);

	@Insert(ShoppingSQL.PRODUCT_INSERT)
	public int insert(ProductDto dto);

	@Update(ShoppingSQL.PRODUCT_UPDATE)
	public int update(ProductDto dto);
}
