class Insertion {
    static TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            return new TreeNode(key);
        }

        if (key > root.key) {
            root.right = insert(root.right, key);
        } else if (key < root.key) {
            root.left = insert(root.left, key);
        }

        return root;
    }
}
