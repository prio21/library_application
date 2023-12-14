package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Library implements  Stock {

    ArrayList<Book> bookList;


    InputStreamReader isr;
    BufferedReader buff;


    public Library(InputStreamReader isr, BufferedReader buff){
        this.isr = isr;
        this.buff = buff;
        this.bookList = new ArrayList<Book>();
    }


    @Override
    public void addBook(Book v) {
        bookList.add(v);
    }

    @Override
    public void removeBook(Book v) {

        for(int i = 0;i < bookList.size();i++){

            Book bk = bookList.get(i);
            if(bk.equals(v)){
                bookList.remove(i);
            }
        }
    }

    @Override
    public void findBook(Book v) {

        for(int i = 0;i < bookList.size();i++){

            Book bk = bookList.get(i);
            if(bk.equals(v)){
                System.out.println("yes present");
               System.out.println(bk.getBookId()+ "    "+bk.getBookName()+"   "+ bk.getPrice());
            }
        }
        System.out.println("Not present!!");
    }
}
