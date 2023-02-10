package DSAImplemenation;

import DSAImplemenation.CustomStack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();

    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        //this take care of array is not full
        if(isFull()){
            //double the array size
            int[]temp = new int[data.length * 2];
            //copy the data in the temp array
            for (int i = 0; i <data.length ; i++) {
                temp[i] = data[i];


            }
           data = temp;
        }
        //so we not have to care of array getting full
        return super.push(item);
    }
}
