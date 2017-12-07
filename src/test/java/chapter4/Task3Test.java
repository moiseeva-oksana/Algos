package chapter4;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Task3Test {

    private Task3 task = new Task3();
    private static Tree tree = new Tree();
    private static LinkedList<LinkedList<Integer>> expected = new LinkedList<>();

    @BeforeClass
    public static void init() {
        tree.add(10);
        tree.add(18);
        tree.add(5);
        tree.add(20);
        tree.add(11);
        tree.add(6);
        tree.add(4);

        LinkedList<Integer> first = new LinkedList<>();
        first.add(10);

        LinkedList<Integer> second = new LinkedList<>();
        second.add(5);
        second.add(18);

        LinkedList<Integer> third = new LinkedList<>();
        third.add(4);
        third.add(6);
        third.add(11);
        third.add(20);

        expected.add(first);
        expected.add(second);
        expected.add(third);
    }

    @Test
    public void traverseBreadthFirst() throws Exception {
        assertEquals(expected, task.getLevelsLists(tree));
    }

}