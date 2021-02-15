package com.company;

public class PersonBuilder {
    private static final int hasNoAge = -1;

    private String firstName = null;
    private String lastName = null;
    private int age = hasNoAge;
    private String address = null;

    public Person build() throws IllegalStateException {
        if (firstName == null || lastName == null) {
            throw new IllegalStateException("Person has no first or last name");
        }
        return new Person(firstName, lastName,
                age, address);
    }

    public PersonBuilder setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName == null) {
            throw new IllegalArgumentException("Invalid name " + firstName);
        }
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName(String lastName) throws IllegalArgumentException {
        if (lastName == null) {
            throw new IllegalArgumentException("Invalid name " + lastName);
        }
        this.lastName = lastName;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException{
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age " + age);
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
}
