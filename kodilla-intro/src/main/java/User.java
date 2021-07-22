public class User {
    int userAge;
    String userName;

    public User(String userName, int userAge) {
        this.userAge = userAge;
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public Integer getUserAge() {
        return this.userAge;
    }
}