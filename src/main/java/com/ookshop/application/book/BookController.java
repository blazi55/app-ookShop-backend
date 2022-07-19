package com.ookshop.application.book;

import com.ookshop.application.tables.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("book")
public class BookController {

    private BookService bookService;

    @GetMapping()
    public BookDto getBook(@PathVariable long bookId) {
        return bookService.getBook(bookId);
    }

    @GetMapping("/books")
    public List<BookDto> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping()
    public BookDto createBook(@RequestBody BookDto bookDto) {
        return bookService.createBook(bookDto);
    }
}