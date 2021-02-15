package com.company;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int f;
    private Logger logger;

    public Filter(int f) {
        this.f = f;
        logger = Logger.newInstance();
        logger.log("Filter created");
    }

    public List<Integer> filterOut(List<Integer> origin) {
        List<Integer> list = new ArrayList<>();
        logger.log("Starting filtering");
        for (int num : origin) {
            if (num >= f) {
                logger.log(String.format("%d is not less then %d", num, f));
                list.add(num);
            }
        }
        logger.log("End filtering");
        return list;
    }
}
