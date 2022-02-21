package com.learn.coding.passbyvalue;

class Person {

    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

public class PassbyvalueApp {
    public static void main(String[] args) {
        Person person = new Person(123, "Siddharth", "siddharth@gmail.com");
        System.out.println(person);
        printData(person);
        System.out.println(person);
    }

    public static void printData(Person person){
        person.setId(897);
        person.setName("Ram");
        person.setEmail("ram@gmail.com");
    }
}
