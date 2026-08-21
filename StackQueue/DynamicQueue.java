package StackQueue;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super();
    }

    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean isFull() {
        return super.isFull();
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public int front() throws Exception {
        return super.front();
    }

    @Override
    public int remove() throws Exception {
        return super.remove();
    }

    @Override
    public boolean insert(int val) {

        if(this.isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0 ;
            end = data.length ;
            data = temp ;
        }
        return super.insert(val);

    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }
}
