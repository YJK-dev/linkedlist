import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();

        integerMyLinkedList.add(1);
        integerMyLinkedList.add(2);
        integerMyLinkedList.add(3);

        System.out.println(integerMyLinkedList.get(2));

        integerMyLinkedList.delete(0);

        MyLinkedList<Integer>.MyIterator myIterator = integerMyLinkedList.iterator();

        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        System.out.println();

        // STACK

        MyStack<String> stringMyStack = new MyStack<>();

        stringMyStack.push("one");
        stringMyStack.push("two");

        System.out.println(stringMyStack.pop());
        System.out.println(stringMyStack.pop());
        System.out.println(stringMyStack.isEmpty());

        System.out.println();

        // QUEUE

        MyQueue<String> stringMyQueue = new MyQueue<>();

        stringMyQueue.enqueue("one");
        stringMyQueue.enqueue("two");

        System.out.println(stringMyQueue.dequeue());
        System.out.println(stringMyQueue.dequeue());
        System.out.println(stringMyQueue.isEmpty());
    }
}