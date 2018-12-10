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
        stack1.add(obj);
    }

    public Object peek() {
        if(stack1.empty())
            return null;
        this.flipStack(this.stack1, this.stack2);
        Object objReturn = stack2.peek();
        this.flipStack(this.stack2, this.stack1);
        return objReturn;
    }

    public Object element() {
        if(stack1.empty())
            throw new NoSuchElementException();
        this.flipStack(this.stack1, this.stack2);
        Object objReturn = stack2.peek();
        this.flipStack(this.stack2, this.stack1);
        return objReturn;
    }

    public Object remove() {
        if(stack1.empty())
            throw new NoSuchElementException();
        this.flipStack(this.stack1, this.stack2);
        Object objReturn = stack2.pop();
        this.flipStack(this.stack2, this.stack1);
        return objReturn;
    }

    public Object poll() {
        if(stack1.empty())
            return null;
        this.flipStack(this.stack1, this.stack2);
        Object objReturn = stack2.pop();
        this.flipStack(this.stack2, this.stack1);
        return objReturn;
    }

    private void flipStack(Stack from, Stack to) {
        while (!from.empty()) {
            to.add(from.pop());
        }
    }
}
