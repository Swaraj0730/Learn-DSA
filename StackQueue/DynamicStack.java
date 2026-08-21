package StackQueue;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super() ;
    }

    public DynamicStack(int size){
        super();
    }

    @Override
    public boolean isFull() {
        return super.isFull();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean push(int item) {
        if(this.isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp ;
        }
       return super.push(item) ;
    }

    @Override
    public int pop() throws Exception {
        return super.pop();
    }

    @Override
    public int peek() throws Exception {
        return super.peek();
    }
}
