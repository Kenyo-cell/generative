package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static List<Integer> generateList(int capacity, int maxValue) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < capacity; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }

    public static void main(String[] args) {
        Logger logger = Logger.newInstance();
        logger.log("Starting program");

        logger.log("Asking user to enter numbers");
        System.out.println("Hello, enter list capacity and maximal value");
        int N, M, f;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        logger.log("Generating random list");

        List<Integer> randomList = generateList(N, M);
        System.out.println("Random list " + randomList);

        logger.log("Asking user to enter filter number");
        System.out.println("Enter filter number");
        f = in.nextInt();

        logger.log("Creating filter");
        Filter filter = new Filter(f);
        List<Integer> filteredList = filter.filterOut(randomList);
        System.out.println("Filtered list" + filteredList);
        logger.log("Program ends");
    }
}
