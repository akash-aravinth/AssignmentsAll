package constructor.classdiagramlibrary.models;

public class Librariyan {
    private String librarianName;
    private String librarianId;
    private String librarianPassword;
    private String searchString;

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianPassword() {
        return librarianPassword;
    }

    public void setLibrarianPassword(String librarianPassword) {
        this.librarianPassword = librarianPassword;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public void verifyLibrarian(){
        System.out.println("Verify Librarian");
    }
    public void search(){
        System.out.println("search");
    }

}
