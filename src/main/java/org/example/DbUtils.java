package org.example;

import javax.swing.plaf.nimbus.State;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DbUtils {





        public  static  void main(String[] args){

            try{

                // in new version of java we do not need to register driver
                // driver helps to connect java to the database we are using

                System.out.println("hello");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_1","root","1234@Publicis");

                Statement st = con.createStatement();

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader buff = new BufferedReader(isr);

                System.out.println("Enter your book ID");
                String id = (buff.readLine());
                System.out.println("Enter your book Name");
                String name = buff.readLine();
                System.out.println("Enter your book price");
                int price = Integer.parseInt(buff.readLine());
                Book book = new Book(isr,buff);

                book.setBookId(id);
                book.setBookName(name);
                book.setPrice(price);

                PreparedStatement pStmt = con.prepareStatement("insert into library values(?,?,?)");
                pStmt.setString(1, book.getBookName());
                pStmt.setString(2, book.getBookId() );
                pStmt.setInt(3, book.getPrice());
                // METHOD FOR EXECUTING THE SQL QUERY
                pStmt.executeUpdate();

                ResultSet res = st.executeQuery("select * from library  ");


                System.out.println(res);
                while(res.next()){

                   System.out.println(res.getString("bookName") + "   " + res.getString("bookId") +"   "+res.getInt("price"));

                    System.out.println();
                }


                con.close();
            }catch (Exception e){
               System.out.println(e);
                // throw  new Exception(e);
            }

        }
}
