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

    public static void main(String[] args) {
        User greg = new User("Greg", 43);
        User ann = new User("Ann", 35);
        User john = new User("John", 27);
        User cate = new User("Cate", 40);

        User[] users = {greg, ann, john, cate};

        int sum = 0;
        int average = 0;

        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].getUserAge();
        }
        System.out.println("Sum of the years is: " + sum);

        average = sum / users.length;
        for (int i = 0; i < users.length; i++) {
            if (average > users[i].userAge) {
                System.out.println("User name is: " + users[i].getUserName() + " is younger than age average.");
            }
        }
        System.out.println("The average age is: " + average + " years.");
    }
}
