package org.ermain.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ermain.bookstore.domain.Book;

@Controller
public class BookController{
	
	@RequestMapping("/books")
	public String list(Model model) {
		
		// Instantiate the Book class
		Book book = new Book();
		
		// set the Book properties
		book.setTitle("Essential C# 7.0");
		book.setAuthor("Mark Michaelis");
		book.setIsbn(1509303588);
		
		model.addAttribute("book", book);
		
		return "books";
	}
}

