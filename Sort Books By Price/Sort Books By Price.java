import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Book[] book = new Book[4];
        for(int i=0;i<4;i++){
            book[i] = new Book(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
        }
        Book[] sortedBooks = sortBooksByPrice(book);
        for(Book b: sortedBooks){
            System.out.println(b.getId()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPrice());
        }
    }
    public static Book[] sortBooksByPrice(Book book[]){
        List<Book> list = new ArrayList<>();
        for(Book b : book){
            list.add(b);
        }
        list.sort((a,b)->Double.compare(a.getPrice(),b.getPrice()));
        return list.toArray(new Book[0]);
    }
}

class Book{
    private int id;
    private String title;
    private String author;
    private double price;
    Book(int id, String title, String author, double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
}
