package com.bus.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.bus.config.DBContract;
import com.bus.models.BusDto;
import com.bus.persistance.sql.BusSQL;



public interface BusDao {

	@Select("SELECT * FROM " + DBContract.TABLE.BUSLIST)
	public List<BusDto> selectAll();
	
	// depId를 기준으로 SELECT(조회)
	@Select("SELECT * FROM " + DBContract.TABLE.BUSLIST + " WHERE bsDepId = #{depId} ")
	public List<BusDto> findById(String Depid);
	
	@Insert(BusSQL.INSERT)
	public int insert(BusDto dto);
	
	/*
	 * 고객정보를 관리하기 위해서 추가할 기능
	 * 1. 고객 이름으로 조회하기
	 * 2. 고객 전화번호로 조회하기
	 */
	@Select("SELECT * FROM " + DBContract.TABLE.BUSLIST + " WHERE bsDepNm LIKE '%' || #{name} || '%' ")
	public List<BusDto> findByName(String name);
	
	/*
	 * select(조회) method를 만들때 주의사항
	 * 조회대상(where 절에서 사용)이 PK 일때는
	 * 		조회되는 데이터가 없거나(null), 1개 뿐이다
	 * 		이때 method 의 return type 은 Dto 로 설정
	 * 		SELECT * FROM tbl_buyer WHERE buid = '000001'
	 * 
	 * 조회대상이 PK가 아닌경우
	 * 		조회되는 데이터는 없거나 (empty), 1개 이상이다
	 * 		이때는 method의 return type은 List<Dto> 로 설정
	 */
}
