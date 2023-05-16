package com.callor.student.exec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class StudentExecE {

	public static void main(String[] args) {
		String studentFile = "src/com/callor/student/Student.txt";
		/*
		 * Java 에서 구현한 기본 OutputStream 에는 System.out 이 있다 이는 Console으로 기준으로 사용하는 출력장치이다
		 */
		OutputStream os = System.out;
		try {
			os = new FileOutputStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = new PrintWriter(os);
		/*
		 * OutputStream에 연결하여 print*() method를 사용하여 파일 기록을 하는 도구
		 * 이 도구에 연결하는 OutputStream 도구를 선택적으로 사용하면 똑같은 print*() method를 사용하여 console, file, 또는
		 * 네트워크 등을 통하여 데이터를 보낼수 있다
		 */
		for (int i = 0; i < 10; i++) {
			out.println("안녕하세요. 반갑습니다");
		}
		/*
		 * 코드가 끝나기 전에 반드시 PrintWriter 객체를 사용종료 해주어야한다
		 * PrintQWriter.close() method 가 실행되기 전까지는 임시 보관소에 데이터가 보관되어있다가
		 * 비로소 출력장치로 데이터가 전달된다
		 */
		out.close();
	}
}
