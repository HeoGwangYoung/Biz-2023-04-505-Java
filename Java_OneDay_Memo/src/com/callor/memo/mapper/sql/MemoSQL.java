package com.callor.memo.mapper.sql;

public class MemoSQL {

	/*
	m_seq
	m_writer
	m_date
	m_subject
	m_content
*/
	
	public static final String MEMO_INSERT 
	= " INSERT INTO tbl_memo( " 
	+ " m_seq, m_writer, m_date, m_subject, m_content) "
	+ " VALUES( "
	+ " seq_memo.nextval, #{m_writer}, " 
	+ " #{m_date}, #{m_subject}, #{m_content} ) ";

public static final String MEMO_UPDATE
	= " UPDATE tbl_memo "
	+ " SET m_writer = #{m_writer}, "
	+ " 	st_dept = #{m_date}, "
	+ " 	st_grade = #{m_subject}, "
	+ " 	st_tel = #{m_content} "
	+ " WHERE m_seq = #{m_seq} ";
}
