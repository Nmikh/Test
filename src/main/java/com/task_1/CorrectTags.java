package com.task_1;

import java.util.Stack;

public class CorrectTags {
    private final static String[] openTags = {"{", "[", "("};
    private final static String[] closeTags = {"}", "]", ")"};

    public static boolean checkExpression(String expression){
        Stack<String> stack = new Stack<String>();
        String[] symbols = expression.split("");
        boolean result = true;

        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < openTags.length; j++) {
                if (openTags[j].equals(symbols[i])) {
                    stack.push(openTags[j]);
                    break;
                } else if (closeTags[j].equals(symbols[i])) {
                    String pop = stack.pop();
                    if (!pop.equals(openTags[j])) {
                        result = false;
                    }
                    break;
                }
            }
            if (!result)
                break;
        }

        if (!stack.empty())
            result = false;

        return result;
    }
}
