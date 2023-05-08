package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class NumbersD {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 45; i++) {
			list.add(i + 1);
		}
		
		for (int i = 0; i < 1000; i++) {
				int rndNum1 = (int)(Math.random() * list.size());
				int rndNum2 = (int)(Math.random() * list.size());
				int temp = list.get(rndNum1);
				list.set(rndNum1, list.get(rndNum2));
				list.set(rndNum2, temp);
		}
		
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
	}
}
