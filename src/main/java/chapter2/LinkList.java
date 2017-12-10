package chapter2;


/**
 * Created by Oksana_Moiseeva on 12/5/2017.
 */
public class LinkList<T> {
    private Node<T> head;

    public LinkList() {
    }

    public LinkList(T data) {
        this.head = new Node<>(data);
    }

    public Node<T> getHead() {
        return head;
    }

    public void addToTail(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            this.head = newNode;
            return;
        }
        Node current = head;
        while (current.next!= null) {
            current = current.next;
        }
        current.next = newNode;

    }


    public void remove(T data) {
        Node current = head;
        while (current.next!= null) {
            if(current.next.data==data) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current.next!= null) {
            result.append(current.data);
            current = current.next;
        }
        result.append(current.data);
        return result.toString();
    }

    static class Node<T> {
        private Node<T>  next;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }
    }
}
