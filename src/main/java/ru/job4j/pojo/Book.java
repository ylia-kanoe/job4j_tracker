package ru.job4j.pojo;

public class Book {
    public static void main(String[] args) {
        Library bookOne = new Library("The Complete Coding Interview Guide in Java", 788);
        Library bookTwo = new Library("Структуры данных и алгоритмы в Java", 704);
        Library bookThree = new Library("Spring Boot по-быстрому", 352);
        Library bookFour = new Library("Clean code", 464);
        Library[] librarys = new Library[4];
        librarys[0] = bookOne;
        librarys[1] = bookTwo;
        librarys[2] = bookThree;
        librarys[3] = bookFour;
        for (int index = 0; index < librarys.length; index++) {
            Library library = librarys[index];
            System.out.println(library.getName() + " - " + library.getCount());
        }
        librarys[0] = bookFour;
        librarys[3] = bookOne;
        for (int index = 0; index < librarys.length; index++) {
            Library library = librarys[index];
            System.out.println(library.getName() + " - " + library.getCount());
        }
        for (int index = 0; index < librarys.length; index++) {
            Library library = librarys[index];
            if (library.getName() == "Clean code") {
                System.out.println(library.getName() + " - " + library.getCount());
            }
        }
    }
}
