package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        String sentenceLowerCase = sentence.toLowerCase();

        ArrayList<String> words = new ArrayList<>();
        int front = 0;
        for (int i = 0; i < sentenceLowerCase.length(); i++) {
            Character characterAt = sentenceLowerCase.charAt(i);
            if (characterAt == ' ') {
                words.add(sentenceLowerCase.substring(front, i));
                front = i + 1;
            }
        }
        words.add(sentenceLowerCase.substring(front, sentenceLowerCase.length()));

        HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            }
            else {
                wordCounts.put(word, 1);
            }
        }
        wordCounts.remove("");
        HashMap<String, Integer> wordCounts2 = new HashMap<String, Integer>();
        for (String key : wordCounts.keySet()) {
            if (wordCounts.get(key) > 1) {
                wordCounts2.put(key, wordCounts.get(key));
            }
        }
        ArrayList<String> wordCounts2List = new ArrayList<>(wordCounts2.keySet());
        wordCounts2List.sort(new Comparator<String>() {
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

        StringBuilder wordsCountsSB = new StringBuilder();
        for (int i = 0; i < wordCounts2List.size() - 1; i++) {
            String word = wordCounts2List.get(i);
            wordsCountsSB.append(word);
            wordsCountsSB.append(": ");
            wordsCountsSB.append(wordCounts2.get(word));
            wordsCountsSB.append("\n");
        }
        String word = wordCounts2List.get(wordCounts2List.size() - 1);
        wordsCountsSB.append(word);
        wordsCountsSB.append(": ");
        wordsCountsSB.append(wordCounts2.get(word));

        return wordsCountsSB.toString();
    }
}
