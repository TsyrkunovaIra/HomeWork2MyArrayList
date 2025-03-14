package com.home.project;


import com.home.project.homeWork2.Book;
import com.home.project.homeWork2.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Java. Полное руководство", 2018, 1488);
        Book b2 = new Book("Java. Библиотека профессионала", 2020, 684);
        Book b3 = new Book("Java. Эффективное программирование", 2019, 464);
        Book b4 = new Book("Spring в действии", 2022, 544);
        Book b5 = new Book("Java Concurrency на практике", 2020, 464);
        Book b6 = new Book("Алгоритмы на Java", 2019, 848);
        Book b7 = new Book("Чистый код", 2018, 466);
        Book b8 = new Book("Высоконагруженные приложения. Программирование, масштабирование, поддержка", 2018, 640);
        Book b9 = new Book("Изучаем Java", 2012, 571);
        Book b10 = new Book("Java для чайников", 2015, 418);
        Book b11 = new Book("Язык программирования Java и среда NetBeans (+ CD-ROM)", 2012, 920);
        Book b12 = new Book("Самоучитель Java", 2014, 340);
        Book b13 = new Book("Философия Java", 2020, 960);

        Student s1 = new Student("Толя", List.of(b11, b3, b5, b4, b10));
        Student s2 = new Student("Федя", List.of(b1, b3, b6, b7, b8));
        Student s3 = new Student("Витя", List.of(b10, b12, b13, b1, b5));
        Student s4 = new Student("Маша", List.of(b2, b6, b8, b10, b4));
        Student s5 = new Student("Тома", List.of(b11, b1, b7, b9, b5));

        List<Book> bookList = new ArrayList<>(List.of(b1, b2, b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13));
        new ArrayList<>(List.of(s1, s2, s3, s4, s5))
                .stream()
                .peek(student -> System.out.println(student.getStudentName()))
                .map(Student::getBooks)
                .flatMap(Collection::stream)
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYearOfRelease() > 2000)
                .limit(3)
                .map(Book::getYearOfRelease)
                .findAny()
                        .ifPresentOrElse(System.out::println,()-> System.out.println("null"));


        System.out.println();


    }}