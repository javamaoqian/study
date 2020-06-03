package com.mao.algorithm;

/**
 * @Author: mq
 * @Date: 2020/6/3 17:46
 */
public class RedBlackTree<K extends Comparable, V> {
    /** root Node */
    private TreeNode<K, V> root;

    public void insert(K k, V v) {
        if (root == null) {
            root = new TreeNode<>(k, v, null, null, null);
            root.setRed(false);
            return;
        }

    }


    public V get(K k) {
        return null;
    }


    class TreeNode<K extends Comparable, V> {
        private K k;
        private V v;
        private TreeNode left;
        private TreeNode right;
        private TreeNode parent;
        private boolean isRed = true;

        public TreeNode(K k, V v, TreeNode left, TreeNode right, TreeNode parent) {
            this.k = k;
            this.v = v;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

        public K getK() {
            return k;
        }

        public void setK(K k) {
            this.k = k;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public TreeNode getParent() {
            return parent;
        }

        public void setParent(TreeNode parent) {
            this.parent = parent;
        }

        public boolean isRed() {
            return isRed;
        }

        public void setRed(boolean red) {
            isRed = red;
        }
    }

}
