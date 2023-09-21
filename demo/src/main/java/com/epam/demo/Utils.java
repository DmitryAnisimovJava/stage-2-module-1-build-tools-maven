package com.epam.demo;

import java.util.Iterator;
import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
     boolean result = args.stream().allMatch(stringList -> Double.parseDouble(stringList) > 0);
     return result;
    }
}