package chapter2;

import java.util.Deque;
import java.util.LinkedList;

//30 minutes
public class Task6 {
    public <T> boolean isPalindrome(LinkList<T> list) {
        Deque<T> stack = new LinkedList<>();
        LinkList.Node current = list.getHead();
        while (current.getNext() != null) {
            stack.push((T) current.getData());
            current = current.getNext();
        }

        stack.push((T) current.getData());

        LinkList.Node current2 = list.getHead();
        while (current2.getNext() != null) {
            final T data = (T) current2.getData();
            final T pop = stack.pop();
            if(data != pop) {
                return false;
            }
            current2 = current2.getNext();
        }
        return true;
    }
}
