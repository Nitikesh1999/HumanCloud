package DSAImplemenation;

import java.util.Arrays;

public class CustomArrayL<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;// size also working as index of the data

    public CustomArrayL() {
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num) {

        try {
            data[size++] = num;
        } catch (Exception e) {
            resize();
        }
    }
    private boolean isfull(){

        return size == data.length;
    }



    public T remove(){
        try {
            T removed = (T) data[--size];
            data[size]= null;
            return removed;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arraylist is empty");
        }
        return null;

    }
    public T get(int index){

        return (T)data[index];
    }
    public int size(){

        return size;
    }
    public void set(int index, T value){

        data[index]= value;
    }
    private void resize(){
        Object[]temp = new Object[data.length *2];
        //copy the current data in the new array
        for (int i =0 ; i<data.length ; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString() {
        return "CustomArrayL{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayL list = new CustomArrayL();
        list.remove();


    }
}
