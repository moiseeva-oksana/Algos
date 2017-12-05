package chapter2;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oksana_Moiseeva on 12/5/2017.
 */
public class Task1 {
    public <T> void removeDuplicates(LinkList<T> list) {
        List<T> dupls = new ArrayList<>();
        LinkList.Node current = list.getHead();
        Object data = current.getData();
        while (current.getNext() != null) {
            LinkList.Node current2 = current.getNext();
            while (current2.getNext() != null) {
                if (current2.getData() == data) {
                    dupls.add((T) data);
                }
                current2 = current2.getNext();

            }
            data = current.getNext().getData();
            current = current.getNext();
        }

        for (int i = 0; i < dupls.size()/2+1; i++) {
            T dupl = dupls.get(i);
            list.remove(dupl);
        }

    }
}
