package com.callor.classes;

import java.util.ArrayList;
import java.util.List;

import com.callor.classes.models.AnimalDto;

public class ExecE {

	public static void main(String[] args) {
		List<AnimalDto> animalList = new ArrayList<>();
		
		AnimalDto animalDto = new AnimalDto("럭키", "허스키", 5);
		animalList.add(animalDto);
		
		animalDto = new AnimalDto("나비", "버밀라", 3);
		animalList.add(animalDto);
		
		animalDto = new AnimalDto("몽", "스피츠", 7);
		animalList.add(animalDto);
		
		System.out.println(animalList.toString());
	}
}
