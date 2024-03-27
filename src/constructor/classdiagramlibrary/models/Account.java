package constructor.classdiagramlibrary.models;

public class Account {
    private int noOfBorrwedBook;
    private int noOfReservedBook;
    private int noOfReturnBook;
    private int noOfLostBook;
    private int fineAmmount;

    public int getNoOfBorrwedBook() {
        return noOfBorrwedBook;
    }

    public void setNoOfBorrwedBook(int noOfBorrwedBook) {
        this.noOfBorrwedBook = noOfBorrwedBook;
    }

    public int getNoOfReservedBook() {
        return noOfReservedBook;
    }

    public void setNoOfReservedBook(int noOfReservedBook) {
        this.noOfReservedBook = noOfReservedBook;
    }

    public int getNoOfReturnBook() {
        return noOfReturnBook;
    }

    public void setNoOfReturnBook(int noOfReturnBook) {
        this.noOfReturnBook = noOfReturnBook;
    }

    public int getNoOfLostBook() {
        return noOfLostBook;
    }

    public void setNoOfLostBook(int noOfLostBook) {
        this.noOfLostBook = noOfLostBook;
    }

    public int getFineAmmount() {
        return fineAmmount;
    }

    public void setFineAmmount(int fineAmmount) {
        this.fineAmmount = fineAmmount;
    }

    public void calculateFine(){
        System.out.println("Calculate Fine");
    }
}
