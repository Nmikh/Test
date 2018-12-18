package com.task_3;

import java.util.NoSuchElementException;
import java.util.Stack;

public class CustomQueue {
    private Stack stack1;
    private Stack stack2;

    public CustomQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void add(Object obj) {
        if (stack1.empty()) {
            this.flipStack(this.stack2, this.stack1);
        }
        stack1.add(obj);
    }

    public Object peek() {
        if (stack1.empty() && stack2.empty()) {
            return null;
        }

        if (stack2.empty()) {
            this.flipStack(this.stack1, this.stack2);
        }

        Object objReturn = stack2.peek();
        return objReturn;
    }

    public Object element() {
        if (stack1.empty() && stack2.empty()) {
            throw new NoSuchElementException();
        }

        if (stack2.empty()) {
            this.flipStack(this.stack1, this.stack2);
        }

        Object objReturn = stack2.peek();
        return objReturn;
    }

    public Object remove() {
        if (stack1.empty() && stack2.empty()) {
            throw new NoSuchElementException();
        }

        if (stack2.empty()) {
            this.flipStack(this.stack1, this.stack2);
        }

        Object objReturn = stack2.pop();
        return objReturn;
    }

    public Object poll() {
        if (stack1.empty() && stack2.empty()) {
            return null;
        }

        if (stack2.empty()) {
            this.flipStack(this.stack1, this.stack2);
        }

        Object objReturn = stack2.pop();
        return objReturn;
    }

    private void flipStack(Stack from, Stack to) {
        while (!from.empty()) {
            to.add(from.pop());
        }
    }
}
