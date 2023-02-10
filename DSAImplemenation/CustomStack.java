package DSAImplemenation;

import java.util.Arrays;

public class CustomStack {
    public int[]data;
    private static final int DEFAULT_SIZE =10;
    int ptr =-1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full::");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public String pop(){
        try{
            return String.valueOf(data[ptr--]);
        }catch (Exception e){
            System.out.println("Stack is empty");
        }
        return null;
    }
    public int peek(){
       try{
           return data[ptr];
       }catch(Exception e){
           System.out.println("Stack is empty");
       }
        return 0;
    }

    public boolean isFull() {
        return ptr== data.length-1;  //// pointer is at last index
    }
    public boolean isEmpty() {
        return ptr== -1;  //// pointer is at first index
    }

    @Override
    public String toString() {
        return "CustomStack{" +
                "data=" + Arrays.toString(data) +
                ", ptr=" + ptr +
                '}';
    }
}
