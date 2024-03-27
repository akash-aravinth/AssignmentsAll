package constructor.classdiagramlibrary.models;

public class LibraryDatabase {
    private int listOfBooks;

    public int getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(int listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public void add(){
        System.out.println("add");
    }
    public void delete(){
        System.out.println("delete");
    }
    public void display(){
        System.out.println("display");
    }
    public void update(){
        System.out.println("update");
    }
    public void search(){
        System.out.println("search");
    }

}
