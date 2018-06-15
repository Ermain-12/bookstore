package com.ermain.bookstore.domain;


public class Book{
	
	// Create the data fields
	private String title;
	private String author;
	private String publisher;
	private long isbn;
	private int yearPublished;
	
	public Book() {
		super();
	}
	
	public Book(String title, String author, long isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	
	
}
