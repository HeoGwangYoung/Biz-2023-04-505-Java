package com.callor.books.service;

import java.util.List;

import com.callor.books.models.PublisherDto;

public interface PublisherService {

	public void loadPublisher();
	public void printPublisherList();
	public PublisherDto getPubliser(String code);
	public List<PublisherDto> getPublisherList();
	public List<PublisherDto> getPublisherListByName(String name);
}
