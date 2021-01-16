/*
    Min Stack Implementation

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

        push(x) -- Push element x onto stack.
        pop() -- Removes the element on top of the stack.
        top() -- Get the top element.
        getMin() -- Retrieve the minimum element in the stack.
*/

package com.company;

import java.util.ArrayList;

class MinStack {

    ArrayList<Integer> stack = new ArrayList<Integer>();
    int min = 0;

    public MinStack() {

    }

    public void push(int value) {
        stack.add(value);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        min = stack.get(0);
        if (stack.size() == 1) {
            return min;
        }

        for (int i = 0; i < stack.size() - 1; i++) {
            if (min > stack.get(i + 1)) {
                min = stack.get(i + 1);
            }
        }
        return min;
    }
}
