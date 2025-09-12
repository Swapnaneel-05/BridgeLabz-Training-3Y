package BridgeLabz.OOPSJava.ObjectModeling;

import java.util.ArrayList;

class LibraryBook {
    String title;
    String author;

    public LibraryBook(String title,String author){
        this.author=author;
        this.title=title;
    }

    public void displayDetails(){
        System.out.println("Title: "+title+" Author: "+author);
    }
}

class InnerLibraryBook {
    String name;
    ArrayList<LibraryBook> books;


    public InnerLibraryBook(String name){
        this.name=name;
        this.books=new ArrayList<>();
    }
    public void addBooks(LibraryBook book){
        books.add(book);
    }

    public void display(){
        for(LibraryBook b:books){
            b.displayDetails();
        }
    }
}