package com.revature.problem2;

import java.sql.Array;
import java.util.*;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        List<String> autoCompleted = new ArrayList<>();
        String s = list.get(0);
        int sLength = s.length();
        for (int i = 1; i < list.size(); i++) {
            String element = list.get(i);
            if (element.length() < sLength) {
                continue;
            }
            if (element.substring(0,sLength).equals(s)) {
                autoCompleted.add(element);
            }
        }
        autoCompleted.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) < 0) {
                    return -1;
                }
                else if (o1.compareTo(o2) == 0) {
                    return 0;
                }
                else if (o1.compareTo(o2) > 0) {
                    return 1;
                }
                return 0;
            }
        });
        return autoCompleted;
    }
}
