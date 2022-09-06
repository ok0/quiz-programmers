package e.example;

import java.util.*;

public class SolutionJV {
    public String solution(String compressed) {
        // OPEN, CLOSE, 숫자 플래그
        char open = '(';
        char close = ')';
        List<Character> numbers = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

        // 반복 횟수, 반복 문자열
        Stack<Integer> repeatedNum = new Stack<>();
        Stack<String> repeatedStr = new Stack<>();
        StringBuilder tmpString = new StringBuilder();
        StringBuilder tmpNum = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (char c: compressed.toCharArray()) {
            if (numbers.contains(c)) {
                tmpNum.append(c);
            } else if (c == open) {
                repeatedNum.push(Integer.parseInt(tmpNum.toString()));
                tmpNum = new StringBuilder();
            } else if (c == close) {
                repeatedStr.push(tmpString.toString());
                tmpString = new StringBuilder();
            } else {
                tmpString.append(c);
            }
        }

        while (!repeatedStr.isEmpty()) {
            String r = repeatedStr.pop();
            for (int i = repeatedNum.pop() ; i > 0 ; i--) {
                result.append(r);
            }
        }

        return result.toString();
    }
}
