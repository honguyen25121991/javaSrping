package vn.hoidanit.laptopshop.domain;

public class Admin {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String fullName;
    private String phone;

    public Admin() {
    }

    public Admin(Long id, String name, String email, String password, String fullName, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
    }

    public Long getId() {
        return this.id;
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

    public void setId(Long id) {
        this.id = id;
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

    public Admin name(String name) {
        this.name = name;
        return this;
    }

    public Admin email(String email) {
        this.email = email;
        return this;
    }

    public Admin password(String password) {
        this.password = password;
        return this;
    }

    public Admin fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Admin phone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                " name='" + getName() + "'" +
                ", email='" + getEmail() + "'" +
                ", password='" + getPassword() + "'" +
                ", fullName='" + getFullName() + "'" +
                ", phone='" + getPhone() + "'" +
                "}";
    }
}
