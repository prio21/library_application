package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    InputStreamReader isr;
    BufferedReader buff;

    public Main(){
     if(isr == null){
         isr = new InputStreamReader(System.in);
     }
     if(buff == null){
         buff =  new BufferedReader(isr);
     }
    }
    public static void main(String[] args) {


        Main obj = new Main();



        Book bk = new Book(obj.isr,obj.buff);

        String bookName, bookId;
        int price;
        System.out.println("Enter bookname bookid price");
        try{
            bookName = obj.buff.readLine();
            bookId = obj.buff.readLine();
            price = Integer.parseInt(obj.buff.readLine());
            bk.setBookName(bookName);
            bk.setBookId(bookId);
            bk.setPrice(price);

        }catch (IOException e){
            throw  new RuntimeException(e);
        }


        Library lib = new Library(obj.isr,obj.buff);

        lib.addBook(bk);
        lib.findBook(bk);


        System.out.println("Hello world!");
    }
}