package chapter4;

public class Task10 {
    private boolean result;

    private boolean isSubTree(Tree.Node node, Tree.Node sub) {
        if (result) return true;
        result = compareNodes(node, sub);
        if (node.getLeft() != null) {
            isSubTree(node.getLeft(), sub);
        }
        if (node.getRight() != null) {
            isSubTree(node.getRight(), sub);
        }
        return result;
    }

    public boolean isSubtree(Tree tree1, Tree tree2) {
        return isSubTree(tree1.getRoot(), tree2.getRoot());
    }


    public boolean compareNodes(Tree.Node node1, Tree.Node node2) {
        boolean result = true;
        if (node1.getEntity() != node2.getEntity()) {
            return false;
        } else if ((node1.getLeft() == null && node2.getLeft() != null) || (node1.getLeft() != null && node2.getLeft() == null)) {
            return false;
        } else if ((node1.getRight() == null && node2.getRight() != null) || (node1.getRight() != null && node2.getRight() == null)) {
            return false;
        }
        if (node1.getLeft() != null && node2.getLeft() != null) {
            result = compareNodes(node1.getLeft(), node2.getLeft());
        }
        if (node1.getRight() != null && node2.getRight() != null) {
            result = compareNodes(node1.getRight(), node2.getRight());
        }
        return result;
    }
}
