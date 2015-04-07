package clasesInternas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leonardo on 07/04/2015.
 */
public class Stack {

    private Node first;
    private int quarlity;

    public void push(String value) {
        final Node newNode = new Node(value);
        if(isEmpty()) {
            newNode.next = null;
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        this.quarlity++;
    }

    public String pop() {
        if(isEmpty()) {
            return null;
        } else {
            final Node node = this.first;
            this.first = node.next;
            this.quarlity--;
            return node.value;
        }
    }

    public String peek() {
        if(!isEmpty()) {
            return first.value;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void show() {
        List<String> nodeList = new ArrayList<>();
        Node node = first;
        while(node != null) {
            nodeList.add(node.value);
            node = node.next;
        }
        System.out.println("\t" + nodeList);
    }

    public class Node{

        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
