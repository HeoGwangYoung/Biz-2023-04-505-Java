package com.callor.books.exec;

import com.callor.books.service.BookService;
import com.callor.books.service.impl.BookserviceImplV2;

public class BookExecC {
	public static void main(String[] args) {
		BookService bookService = new BookserviceImplV2();
		bookService.loadBook();
		bookService.printBookList();
	}
}
