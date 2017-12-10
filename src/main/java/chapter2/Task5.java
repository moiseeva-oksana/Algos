package chapter2;

//2h
public class Task5 {
    public LinkList<Integer> sum(LinkList<Integer> first, LinkList<Integer> second) {
        LinkList<Integer> result = new LinkList<>();
        LinkList.Node<Integer> currentFirst = first.getHead();
        LinkList.Node<Integer> currentSecond = second.getHead();
        int buffer = 0;
        while (currentFirst.getNext() != null) {
            int sum = currentFirst.getData() + currentSecond.getData() + buffer;
            if(sum > 9) {
                result.addToTail(sum%10);
                buffer = 1;
            }
            else {
                result.addToTail(sum);
                buffer = 0;
            }
            currentFirst = currentFirst.getNext();
            currentSecond = currentSecond.getNext();
        }
        int last = currentFirst.getData() + currentSecond.getData() + buffer;
        if(last < 10) {
            result.addToTail(last);
        }
        else {
            result.addToTail(last%10);
            result.addToTail(last/10);
        }
        return result;

    }
}
