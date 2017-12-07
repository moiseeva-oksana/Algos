package chapter4;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task10Test {

    private Task10 task = new Task10();
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;

    @Before
    public void init() {
        tree1 = new Tree();
        tree1.add(2);
        tree1.add(1);
        tree1.add(3);
        tree1.add(5);

        tree2 = new Tree();
        tree2.add(3);
        tree2.add(5);

        tree3 = new Tree();
        tree3.add(5);
        tree3.add(6);
        tree3.add(3);
        tree3.add(1);
        tree3.add(4);

        tree4 = new Tree();
        tree4.add(3);
        tree4.add(1);
        tree4.add(4);
    }

    @Test
    public void isSubtreeTrue() throws Exception {
        assertThat(task.isSubtree(tree1, tree2), is(true));
        assertThat(task.isSubtree(tree3, tree4), is(true));
    }

    @Test
    public void isSubtreeFalse() throws Exception {
        tree2.add(6);
        assertThat(task.isSubtree(tree1, tree2), is(false));
    }

}