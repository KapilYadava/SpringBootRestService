package com.example.welcome.myspringbootdemo;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return Arrays.asList(new Book(1l, "Half Girlfriend", "Chetan Bagath"), 
				new Book(2l, "Kai Po Che", "Chetan Bagath"),
				new Book(3l, "Raat Rumani", "Amit Nayal"));
	}
}
