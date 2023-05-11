package com.callor.books.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.books.models.BookDto;
import com.callor.books.service.BookService;

public class BookServiceImplV1 implements BookService {

	List<BookDto> bookList;

	public BookServiceImplV1() {
		bookList = new ArrayList<>();
	}

	@Override
	public void loadBook() {
		String bookFile = "src/com/callor/books/data/도서정보(2023-05-11).txt";
		InputStream is = null;
		Scanner scan = null;

		try {
			is = new FileInputStream(bookFile);
		} catch (FileNotFoundException e) {
			System.out.println(bookFile + " 의 정보가 없습니다");
			return;
		}
		scan = new Scanner(is);
		int rows = 0;
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] book = line.split(",");
//			ISBN,도서명,출판사,저자,발행일,페이지,가격

			BookDto bookDto = new BookDto();
			rows++;
			if (book.length < 7) {
				System.out.printf("%d 번째 데이터 문제", rows);
				System.out.println(line);
				break;
			}
			bookDto.setbIsbn(book[0]);
			bookDto.setbTitle(book[1]);
			bookDto.setbPublisher(book[2]);
			bookDto.setbAuthor(book[3]);
			bookDto.setbPublishDate(book[4]);
			bookDto.setbPages(Integer.parseInt((book[5]).trim()));
			bookDto.setbPrice(Integer.parseInt((book[6]).trim()));

			bookList.add(bookDto);

		}
		scan.close();
	}

	@Override
	public void printBookList() {
		System.out.println("=".repeat(140));
		System.out.println("ISBN\t\t도서명\t\t\t\t\t\t출판사\t저자\t발행일\t\t페이지\t가격");
		System.out.println("-".repeat(140));
		for (BookDto bookDto : bookList) {
			System.out.printf("%s\t", bookDto.getbIsbn());
			if (bookDto.getbTitle().length() >= 26) {
				System.out.printf("%s\t", bookDto.getbTitle());
			} else if (bookDto.getbTitle().length() >= 18) {
				System.out.printf("%s\t\t", bookDto.getbTitle());
			} else if(bookDto.getbTitle().length() >= 14) {
				System.out.printf("%s\t\t\t", bookDto.getbTitle());
			} else if(bookDto.getbTitle().length() >= 9) {
//				Character[] digit = bookDto.getbTitle().toCharArray();
				
				System.out.printf("%s\t\t\t\t", bookDto.getbTitle());
			} else if(bookDto.getbTitle().length() >= 4) {
				System.out.printf("%s\t\t\t\t\t", bookDto.getbTitle());
			}
//			System.out.printf("%s\t\t", bookDto.getbTitle());
			System.out.printf("%s\t", bookDto.getbPublisher());
			System.out.printf("%s\t", bookDto.getbAuthor());
			System.out.printf("%s\t", bookDto.getbPublishDate());
			System.out.printf("%6d\t", bookDto.getbPages());
			System.out.printf("%d\n", bookDto.getbPrice());
		}
		System.out.println("=".repeat(140));
	}

	@Override
	public BookDto getBook(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> getBookList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub

	}

}
