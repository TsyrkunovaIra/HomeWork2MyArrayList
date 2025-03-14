package com.home.project.homeWork2;

import java.util.List;


public class Student {
        private Book book;
        private String studentName;
        private final List<Student> students;
        private List<Book> books;

        public Student(String studentName, List<Book> books) {
            this.studentName = studentName;
            this.books = books;
            students = List.of();
        }

        public void setBook(Book book) {
            this.book = book;}

        public Book getBook() {
            return book;
        }
        public List<Student> getStudents() {
            return students;
        }
        public String getStudentName() {
            return studentName;
        }
        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }
        public List<Book> getBooks() {
            return books;
        }
        public void setBooks(List<Book> books) {
            this.books = books;
        }
        public String toString (){
            return "Студент: " + studentName + ", литература: " + books;

    }}
