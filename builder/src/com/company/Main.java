package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setAge(18)
                .setAddress("Moscow")
                .build();

        System.out.println(person);

        Person son = person.newChildBuilder()
                .setFirstName("Petr").build();
        System.out.println(son);
    }
}
