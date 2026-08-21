package StackQueue;

public class QueueMain {

    public static void main() throws Exception {

        CircularQueue cq = new CircularQueue(8);

        cq.insert(23);
        cq.insert(24);
        cq.insert(25);
        cq.insert(26);
        cq.insert(27);
        cq.display();

        cq.insert(27);
        cq.display();

    }
}
