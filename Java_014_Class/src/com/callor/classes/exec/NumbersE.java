package com.callor.classes.exec;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersE {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 45; i++) {
			list.add(i + 1);
		}
		
		/*
		 * List type의 데이터를 shuffle 하기 위한 도구
		 */
		Collections.shuffle(list);
		
		List<Integer> lottos = new ArrayList<>();
		

		for (int i = 0; i < 6; i++) {
			lottos.add(list.get(i));
		}
		
		System.out.println(lottos);
		Collections.sort(lottos);
		System.out.println(lottos);
	}
}
