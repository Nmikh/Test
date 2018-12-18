package com.task_1;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class CorrectTags {
    private Set<Character> openTags;
    private Set<Character> closeTags;

    public CorrectTags() {
        openTags = new HashSet<Character>();
        closeTags = new HashSet<Character>();

        openTags.add('{');
        openTags.add('[');
        openTags.add('(');

        closeTags.add('}');
        closeTags.add(']');
        closeTags.add(')');
    }

    public boolean checkExpression(String expression) {
        Stack stack = new Stack<String>();
        char[] symbols = expression.toCharArray();
        boolean result = true;

        for (char symbol : symbols) {
            if (openTags.contains(symbol)) {
                stack.add(symbol);
            } else if (closeTags.contains(symbol)) {

                if (stack.empty()) {
                    result = false;
                    break;
                } else {
                    int ascii = (int) symbol;

                    if (symbol != ')') {
                        ascii = ascii - 2;
                    } else {
                        ascii = ascii - 1;
                    }

                    Character expectedOpenTag = (char) ascii;

                    if (!stack.pop().equals(expectedOpenTag)) {
                        result = false;
                        break;
                    }
                }
            }
        }

        if (!stack.empty()) {
            result = false;
        }

        return result;
    }
}
