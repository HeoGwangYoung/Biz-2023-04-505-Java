package com.callor.classes.exec;

import java.util.ArrayList;
import java.util.List;

public class ClassH {

	public static void main(String[] args) {
		// java 1.7 이후 버전에서 생성자에는 Generic을 생략해도 된다
		List<Integer> numList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			numList.add(rndNum);
		}

		for (int i = 0; i < numList.size() - 1; i++) {
			for (int j = i + 1; j < numList.size(); j++) {
				if (numList.get(i) > numList.get(j)) {
					
					numList.add(i, numList.get(j));
					numList.add(j + 1, numList.get(i + 1));
					
					numList.remove(i + 1);
					numList.remove(j + 1);
					
					// numList.set 쓰면 더 간결하게 가능
					// int num = nummList.get(i)
				}
			}
		}
		
		// List type의 객체변수에는 toString() method가 포함되고 단순히 List의 값들을 출력 해 볼 수 있다
		System.out.println(numList.toString());
	}
}
