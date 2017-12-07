package chapter4;

import java.util.LinkedList;
import java.util.Queue;

//2h
public class Task3 {
    public LinkedList<LinkedList<Integer>> getLevelsLists(Tree tree) {
        LinkedList<LinkedList<Integer>> result = new LinkedList<>();
        Queue<Tree.Node> queue = new LinkedList<>();
        queue.add(tree.getRoot());
        int nodes;
        LinkedList<Integer> buffer;
        while (!queue.isEmpty()) {
            buffer = new LinkedList<>();
            nodes = queue.size();
            while (nodes > 0) {
                Tree.Node n = queue.remove();
                buffer.add(n.getEntity());
                if (n.getLeft() != null) {
                    queue.add(n.getLeft());
                }
                if (n.getRight() != null) {
                    queue.add(n.getRight());
                }
                nodes--;
            }
            result.add(buffer);
        }
        return result;
    }
}
