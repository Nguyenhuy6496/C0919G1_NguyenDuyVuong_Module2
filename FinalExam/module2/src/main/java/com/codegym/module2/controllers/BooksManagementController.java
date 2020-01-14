package com.codegym.module2.controllers;

import com.codegym.module2.entitys.BooksEntity;
import com.codegym.module2.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class BooksManagementController {

    @Autowired
    BooksService booksService;

    //    Hiển thị trang chủ
    @GetMapping("/")
    public ModelAndView homePage(@PageableDefault(size = 5) Pageable pageable) {
        Page<BooksEntity> booksEntities = booksService.findAll(pageable);
        return new ModelAndView("homePage", "listBooks", booksEntities);
    }

    @GetMapping("/create/book")
    public ModelAndView addNewBook() {
        return new ModelAndView("createNewBook", "books", new BooksEntity());
    }

    @PostMapping("/create/book")
    public ModelAndView saveNewBook(@Valid @ModelAttribute("books") BooksEntity booksEntity, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("createNewBook");
        } else {
            booksService.saveBook(booksEntity);
            return new ModelAndView("createNewBookSuccess");
        }
    }

    @GetMapping("/show/lists")
    public ModelAndView showAllBooks() {
        return new ModelAndView("listBooks", "listAllBooks", booksService.getAllBooks());
    }

    @GetMapping("/edit-book/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        BooksEntity booksEntity = booksService.getBook(id);
        if(booksEntity != null) {
            return new ModelAndView("editBook", "booksEntity", booksEntity);
        }else {
            return new ModelAndView("/error.404");
        }
    }

    @PostMapping("/edit-book")
    public ModelAndView updateBook(@ModelAttribute("booksEntity") BooksEntity booksEntity){
        booksService.saveBook(booksEntity);;
        return new ModelAndView("editBookSuccess");
    }

    @GetMapping("/delete-book/{id}")
    public ModelAndView deleteForm(@PathVariable Long id) {
        BooksEntity booksEntity = booksService.getBook(id);
        if(booksEntity != null) {
            return new ModelAndView("deleteBook", "booksEntity", booksEntity);
        }else {
            return new ModelAndView("/error.404");
        }
    }

    @PostMapping("/delete-book")
    public ModelAndView deleteBook(@ModelAttribute("booksEntity") BooksEntity booksEntity){
        booksService.deleteBook(booksEntity.getIdBook());
        return new ModelAndView("deleteBookSuccess");
    }
}
