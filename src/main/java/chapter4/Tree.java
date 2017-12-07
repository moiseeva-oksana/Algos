package chapter4;

//1h
public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public boolean add(int element) {
        boolean result;
        if (root == null) {
            root = new Node(element);
            result = true;
        } else {
            result = root.addChild(element);
        }
        return result;
    }

    static class Node {
        private int entity;
        private Node left;
        private Node right;
        private Node parent;

        public int getEntity() {
            return entity;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        private Node(int entity) {
            this.entity = entity;
        }


        private boolean addChild(int element) {
            if (element == entity)
                return false;
            if (element < entity) {
                if (left == null) {
                    left = new Node(element);
                    left.parent = this;
                    return true;
                } else
                    return left.addChild(element);
            }
            if (element > entity) {
                if (right == null) {
                    right = new Node(element);
                    right.parent = this;
                    return true;
                } else
                    return right.addChild(element);
            }
            return false;
        }
    }
}
