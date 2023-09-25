import java.util.Scanner;

class TreeNode {
    int key;
    TreeNode left, right;

    public TreeNode(int item) {
        key = item;
        left = right = null;
    }
}

public class main {
    public static void main(String[] args) {
        TreeNode root = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os valores na árvore (digite -1 para parar):");
        int inputValue;
        while ((inputValue = scanner.nextInt()) != -1) {
            root = Insertion.insert(root, inputValue);
        }

        System.out.println("Impressão da Árvore:");
        printTreeRecursive(root, 0);

        System.out.println("\nInsira um valor para buscar:");
        int searchKey = scanner.nextInt();
        if (Search.search(root, searchKey)) {
            System.out.println("\nO valor " + searchKey + " foi encontrado na árvore.");
        } else {
            System.out.println("\nO valor " + searchKey + " não foi encontrado na árvore.");
        }

        System.out.println("\nInsira um valor para remover:");
        int deleteKey = scanner.nextInt();
        root = Deletion.delete(root, deleteKey);
        System.out.println("Impressão da Árvore após a remoção de " + deleteKey + ":");
        printTreeRecursive(root, 0);
    }

    static void printTreeRecursive(TreeNode root, int level) {
        final int COUNT = 5;
        if (root == null) return;

        printTreeRecursive(root.right, level + 1);

        for (int i = 0; i < level * COUNT; i++) {
            System.out.print(" ");
        }

        System.out.println(root.key);

        printTreeRecursive(root.left, level + 1);
    }
}
