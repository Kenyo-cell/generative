package com.company;

public class Person {
    private static final int hasNoAge = -1;

    private String firstName;
    private String lastName;
    private int age = hasNoAge;
    private String address = null;

    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setLastName(lastName)
                .setAge(0)
                .setAddress(address);
    }
    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }


    public boolean hasAge() {
        return age != hasNoAge;
    }

    public boolean hasAddress() {
        return true;
    }

    public void birthday() {
        age++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
