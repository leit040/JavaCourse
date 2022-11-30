package hw1.general;


import hw1.EmployeeInterface;

public class Employee implements EmployeeInterface {

    protected String name = "";
    protected String lastName = "";
    protected String email = "";
    protected String phone = "";
    protected String role = "";
    protected int age = 0;


    public Employee(String name, String lastName, String email, String phone, String role, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.age = age;
    }
    public Employee(String email, String phone, String role) {
        this.email = email;
        this.phone = phone;
        this.role = role;

    }

    public Employee(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
