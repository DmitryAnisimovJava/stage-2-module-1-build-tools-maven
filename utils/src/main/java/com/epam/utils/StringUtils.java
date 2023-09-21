package com.epam.utils;

import java.util.function.Function;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
    	Function<String, Boolean> result = stringFrom -> {
    		boolean res = Double.parseDouble(stringFrom) > 0 ? 
    				true : false;
    		return res;
    	};
    	return result.apply(str);
    }
}
