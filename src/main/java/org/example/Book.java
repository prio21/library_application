
package org.example;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Book {


    InputStreamReader isr;
    BufferedReader buff;


    public Book(InputStreamReader isr, BufferedReader buff){
        this.isr = isr;
        this.buff = buff;
    }


    String bookName;
    String bookId;
    int price;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    String authorName;


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
