package com.task_1;

public class CorrectTagsTest {
    public static void main(String[] args) {
        String expression = "g{fsdfg}s";
        boolean b = CorrectTags.checkExpression(expression);
        System.out.println(expression + ": " + b);

        expression = "g{f(sd)fg}s";
        b = CorrectTags.checkExpression(expression);
        System.out.println(expression + ": " + b);

        expression = "{g{fsdfg}s";
        b = CorrectTags.checkExpression(expression);
        System.out.println(expression + ": " + b);

        expression = "{{[cc(c)ggg]}ssss}";
        b = CorrectTags.checkExpression(expression);
        System.out.println(expression + ": " + b);

        expression = "{{[cc(c)ggg]}ssss}{";
        b = CorrectTags.checkExpression(expression);
        System.out.println(expression + ": " + b);
    }
}
