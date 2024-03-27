package constructor.classdiagramlibrary.models;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int bookISBN;
    private String bookPublication;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(int bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookPublication() {
        return bookPublication;
    }

    public void setBookPublication(String bookPublication) {
        this.bookPublication = bookPublication;
    }

    public void showDebuts(){
        System.out.println("Show Debuts");
    }
    public void reservationStatus(){
        System.out.println("Reservstion");
    }
    public void feedBack(){
        System.out.println("FeedBack");
    }
    public void bookRequest(){
        System.out.println("Request Book");
    }
    public void renwInfo(){
        System.out.println("Renew");
    }

}
