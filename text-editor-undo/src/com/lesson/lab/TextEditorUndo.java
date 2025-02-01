package com.lesson.lab;

import java.sql.Array;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // TODO 1: initialize the stack array
        stack = new String[size];
        // TODO 2: set initial top index to -1
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        // TODO 3: check if the stack is full
        if (top == stack.length -1){
            // TODO 4: print message if the stack is full
            System.out.println("Stack is full. Cannot add more actions.");
            return;
        }
        // TODO 5: increment top and add action to the stack
        stack[++top] = action;
        // TODO 6: print confirmation message
        System.out.println("Action added: " + action);
    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        // TODO 7: Check if the stack is empty
        if (top == -1) {
            // TODO 8: Print message if the stack is empty and return null
            System.out.println("Stack is empty. No actions to undo.");
            return null;
        }
        // TODO 9: Retrieve and remove the top action from the stack
        String action = stack[top--];
        // TODO 10: Print confirmation message, return and replace empty string with the undone action
        System.out.println("Action undone: " + action);
        return action;

    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        // TODO 11: Check if the stack is empty
        if (top == -1) {
            // TODO 12: Print message if the stack is empty and return null
            System.out.println("Stack is empty. No actions to view.");
            return null;
        }
        // TODO 13: Return and replace empty string with the most recent action without removing it
        return stack[top];
    }

    // Method to display all actions in the stack
    public void display() {
        // TODO 14: Check if the stack is empty
        if (top == -1) {
            // TODO 15: Print message if the stack is empty
            System.out.println("Stack is empty. No actions to display.");
            return;
        }

        // TODO 16: Iterate through the stack and print each action
        for (int i = top; i >= 0; i--) {
            System.out.println("Action " + (top - i + 1) + ": \"" + stack[i] + "\"");
        }
        // TODO 17: Print a new line after displaying all actions
        System.out.println();
    }
}