package classes.bookdto;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookName("One Piece");
        book.setBookPrice(200.80);
        book.setISBN("12098764");
        Book.bookPublication = "Google";
        System.out.println("Book Name : "+book.getBookName()+"\n"+"Book Price : "+book.getBookPrice()+"\n"+
                "Book Isbn No : "+book.getISBN()+"\n"+"Book Publication : "+Book.bookPublication);
    }
}
