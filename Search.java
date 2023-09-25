class Search {
    static boolean search(TreeNode root, int key) {
        if (root == null) {
            return false;
        }

        if (key == root.key) {
            return true;
        }

        if (key < root.key) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }
}

