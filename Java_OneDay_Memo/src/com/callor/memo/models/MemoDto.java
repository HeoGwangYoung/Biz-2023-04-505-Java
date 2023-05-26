package com.callor.memo.models;

public class MemoDto {

	public int m_seq;
	public String m_writer;
	public String m_date;
	public String m_subject;
	public String m_content;
	
	
	public MemoDto() {
		super();
	}
	public MemoDto(int m_seq, String m_writer, String m_date, String m_subject, String m_content) {
		super();
		this.m_seq = m_seq;
		this.m_writer = m_writer;
		this.m_date = m_date;
		this.m_subject = m_subject;
		this.m_content = m_content;
	}
	
	@Override
	public String toString() {
		return "MemoDto [m_seq=" + m_seq + ", m_writer=" + m_writer + ", m_date=" + m_date + ", m_subject=" + m_subject
				+ ", m_content=" + m_content + "]";
	}

}
