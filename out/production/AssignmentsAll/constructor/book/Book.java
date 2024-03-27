package constructor.book;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String bookPublication;
    private float bookPrice;

    public Book(String bookName, String bookAuthor, String bookPublication, float bookPrice) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublication = bookPublication;
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublication() {
        return bookPublication;
    }

    public void setBookPublication(String bookPublication) {
        this.bookPublication = bookPublication;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }
}
