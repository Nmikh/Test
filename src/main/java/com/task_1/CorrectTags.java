package com.task_1;

import java.util.*;

public class CorrectTags {
    private Set<Character> openTags;
    private Map<Character, Character> closeTags;

    public CorrectTags() {
        openTags = new HashSet<Character>();
        closeTags = new HashMap<Character, Character>();

        openTags.add('{');
        openTags.add('[');
        openTags.add('(');

        closeTags.put('}', '{');
        closeTags.put(']', '[');
        closeTags.put(')', '(');
    }

    public boolean checkExpression(String expression) {
        Stack stack = new Stack<String>();

        for (int i = 0; i < expression.length(); i++) {
            Character character = expression.charAt(i);

            if (openTags.contains(character)) {
                stack.add(character);
            } else if (closeTags.containsKey(character)) {

                if (stack.empty()) {
                    return false;
                } else {
                    Character expectedOpenTag = closeTags.get(character);

                    if (!stack.pop().equals(expectedOpenTag)) {
                        return false;
                    }
                }
            }
        }

        if (!stack.empty()) {
            return false;
        }

        return true;
    }
}
