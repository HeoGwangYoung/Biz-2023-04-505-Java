package com.callor.books.exec;

import java.util.List;

import com.callor.books.models.PublisherDto;
import com.callor.books.service.PublisherService;
import com.callor.books.service.impl.PublisherServiceImplV1;

public class PublisherExecA {

	public static void main(String[] args) {
		PublisherService pbService = new PublisherServiceImplV1();
		pbService.loadPublisher();
		pbService.printPublisherList();
		
		List<PublisherDto> pbList = pbService.getPublisherListByName("나무");
		
		if(pbList.isEmpty()) {
			System.out.println("리스트 비어있음");
		}
		
		for (PublisherDto publisherDto : pbList) {
			System.out.println(publisherDto);
		}
	}
}
