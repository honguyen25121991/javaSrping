package vn.hoidanit.laptopshop.domain;

public class User {
    private String name;
    private String email;
    private String password;
    private String fullName;
    private String phone;

    public User() {
    }

    public User(String name, String email, String password, String fullName, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User email(String email) {
        this.email = email;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public User phone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                ", password='" + getPassword() + "'" +
                ", fullName='" + getFullName() + "'" +
                ", phone='" + getPhone() + "'" +
                "}";
    }
}
