package datastructures.doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        myDLL.append(14);
        myDLL.append(18);
        myDLL.append(59);

        myDLL.removeFirst();
        myDLL.removeFirst();
        myDLL.removeFirst();
        myDLL.removeFirst();
        myDLL.removeFirst();

        myDLL.printList();
    }
}
