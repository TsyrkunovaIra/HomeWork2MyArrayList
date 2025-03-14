package com.home.project.homeWork2;


import java.util.List;

    public class Book{
        private String nameBook;
        private int yearOfRelease;
        private List<Book> books;
        private int pages;

        public Book (String nameBook, int yearOfRelease, int pages){
            this.nameBook = nameBook;
            this.yearOfRelease = yearOfRelease;
            this.pages = pages;
        }
        public void setNameBook(String nameBook) {
            this.nameBook = nameBook;
        }
        public void setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
        }
        public String getNameBook() {
            return nameBook;
        }
        public int getYearOfRelease() {
            return yearOfRelease;
        }
        public List<Book> getBooks() {
            return books;
        }
        public void setBooks(List<Book> books) {
            this.books = books;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public String toString(){
            return  nameBook + " год выпуска: " +  yearOfRelease + " г. ; ";
        }
    }

