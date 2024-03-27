package constructor.classdiagramlibrary.models;

public class User {
    private String userName;
    private String userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void verify(){
        System.out.println("Verify");
    }
    public void checkAccunt(){
        System.out.println("Check Account");
    }
    public void getBookInfo(){
        System.out.println("Get Book Info");
    }

}
