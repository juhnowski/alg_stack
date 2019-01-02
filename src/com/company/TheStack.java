package com.company;

import java.util.Arrays;

public class TheStack {

    private  String[] stack;

    private int stackSize;

    private  int topOfStack = -1;

    public TheStack(int size){
        stackSize = size;
        stack = new String[size];
        Arrays.fill(stack,"_");
    }

    public void push(String input){
        if(topOfStack +1 < stackSize){
            topOfStack++;
            stack[topOfStack] = input;
        } else {
            System.out.println("Stack is Full");
        }
    }

    public String pop(){
        if(topOfStack >=0){
            String result = stack[topOfStack];
            stack[topOfStack] = "_";
            topOfStack--;
            return result;
        } else {
            System.out.println("Stack is empty");
            return "-1";
        }
    }

    public String peek(){
        return stack[topOfStack];
    }

    // 13 14 15 16
    public void pushMany(String multipleValues){
        String[] tempString = multipleValues.split(" ");
        for(int i = 0; i< tempString.length; i++){
            push(tempString[i]);
        }
    }

    public void popAll() {
        for (int i = topOfStack; i>=0; i--){
            System.out.println("pop="+pop());
        }
    }

    public void print(){
        for(int i=0; i<stack.length; i++){
            System.out.print(" "+stack[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {

        TheStack theStack = new TheStack(10);
        theStack.print();
        theStack.pushMany("10 11 12 13 14");
        theStack.print();
        System.out.println("peek="+theStack.peek());
        theStack.popAll();
        theStack.print();
    }
}
