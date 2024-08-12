package Data_Structure.Tree;

import java.util.ArrayList;
import java.util.List;

public class MyBST { // Binary Search Tree
    public TreeNode mRoot;

    public MyBST() {

    }

    // insert node to tree
    public TreeNode insert(TreeNode root, int value) {

        TreeNode newNode = new TreeNode(value);
        // TH1: root = null
        if (root == null) {
            root = new TreeNode(value);
            return root;
        } else {
            TreeNode temp = root;
            while (true) {
                if (value > temp.val) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }

                } else { // value <temp.val
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }

    // Recursive
    public TreeNode insertIntoBST(TreeNode rootNode, int value) {
        if (rootNode == null) {
            return new TreeNode(value);
        }

        if (value < rootNode.val) {
            if (rootNode.left == null) {
                rootNode.left = new TreeNode(value);
            } else {
                insertIntoBST(rootNode.left, value);
            }
        } else {
            if (rootNode.right == null) {
                rootNode.right = new TreeNode(value);
            } else {
                insertIntoBST(rootNode.right, value);
            }
        }
        return rootNode;
    }

    // finde the leftmost node of the left subtree
    public TreeNode findLeftModeNode(TreeNode root) {
        if (root == null)
            return null;
        TreeNode leftMostNode = root;
        while (leftMostNode.left != null)
            leftMostNode = leftMostNode.left;
        return leftMostNode;
    }

    // delete node key in root tree
    // return: new tree is deleted key node
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        // step 1: find node to delete
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else { // root.val = key => delete root
            // step 2: delete node root

            // case 1: root is leaf node
            if (root.left == null && root.right == null)
                return null;

            // case 2: just has 1 in left;
            if (root.left != null && root.right == null)
                return root.left;
            // case 2: just has 1 in right;
            if (root.left == null && root.right != null)
                return root.right;

            // case 3: exist 2
            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.val = leftModeNode.val;
            root.right = deleteNode(root.right, leftModeNode.val);

        }

        return root;
    }

    // Search any node in tree
    public TreeNode searchBST(TreeNode root, int key) {
        if (root == null)
            return null;
        if (key < root.val) {
            return searchBST(root.left, key);
        } else if (key > root.val) {
            return searchBST(root.right, key);
        } else {
            return root;
        }
    }

    // Node -L -R
    public static void PreOder(TreeNode currentNode) {
        if (currentNode == null)
            return;
        // Duyet currentNode truoc
        System.out.print(currentNode.val + " ");

        // Duyet ben trai | Duyet ben phai
        PreOder(currentNode.left);
        PreOder(currentNode.right);
    }

    // leetcode
    List<Integer> duyetOder = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return duyetOder;
        // Duyet currentNode truoc
        System.out.print(root.val + " ");
        duyetOder.add(root.val);

        // Duyet ben trai | Duyet ben phai
        preorderTraversal(root.left);
        preorderTraversal(root.right);

        return duyetOder;
    }

    // L - Node -R
    public static void InOder(TreeNode currentNode) {
        if (currentNode == null)
            return;

        // Duyet ben trai | Duyet ben phai
        InOder(currentNode.left);

        System.out.print(currentNode.val + " ");

        InOder(currentNode.right);
    }

    // L - R - Node
    public static void PostOrder(TreeNode currentNode) {
        if (currentNode == null)
            return;

        // Duyet ben trai | Duyet ben phai
        PostOrder(currentNode.left);
        PostOrder(currentNode.right);

        System.out.print(currentNode.val + " ");
    }

}
