package datastructures.queue;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
        System.out.println("New Queue-> "+value);
    }

    public void printQueue() {
        Node temp = first;

        if (temp==null){
            System.out.println("null");
        }
        
        while (temp != null) {
            System.out.println("Queue-> " + temp.value);
            temp = temp.next;
        }
        
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void enqueue ( int value ) {
        System.out.println("Entered value-> " +value);
        Node newNode = new Node ( value ) ;
         if ( length == 0 ) {
             first = newNode ;
             last = newNode ;}
      else {
             last.next = newNode ;
             last = newNode ;
            }
            length++;
    }

    
    public Node dequeue() {
        System.out.print("Removed value-> ");
        if(length == 0) return null;
        Node temp = first;
        if(length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public static void main(String[] args){
        Queue myQueue = new Queue ( 7 ) ;
        myQueue.enqueue(2);
        System.out.println(myQueue.dequeue().value);
        
        myQueue.printQueue();
    }
}
