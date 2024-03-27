package constructor.classdiagramlibrary;

public class LibraryManagement {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void login(){
        System.out.println("Login");
    }
    public void signUp(){
        System.out.println("Sign Up");
    }
    public void logout(){
        System.out.println("LogOut");
    }

}
