package it.Factory.exemplu3.dependencyinjection.model;

public class User {

    private String username;
    private String age;

    public User(String username, String age) {
        this.username = username;
        this.age = age;
    }

    public User(){}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
