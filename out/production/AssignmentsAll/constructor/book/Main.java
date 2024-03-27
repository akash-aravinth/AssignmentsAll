package constructor.book;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("One Piece","Oda","Toei Animation",600.07f);
        Book book2 = new Book("Naruto","KishiMoto","Toei Animation",800.76f);
        Book book3 = new Book("DemonSlayer","Renkogu","Mand",1200.45f);
       List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        for(Book b : bookList){
            System.out.println("BookName : "+b.getBookName()+"\nBook Author : "+b.getBookAuthor()+"\n" +
                    "Book Publication : "+b.getBookPublication()+"\nBook Price "+b.getBookPrice()+"\n");
        }
    }
}
