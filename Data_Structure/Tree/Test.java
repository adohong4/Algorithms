package Data_Structure.Tree;

public class Test {

    public static void main(String[] args) {
        // MyBinaryTree myTree = new MyBinaryTree();
        // myTree.init();
        // System.out.println("done");

        // MyBST myBst = new MyBST();
        // myBst.mRoot = myBst.insert(myBst.mRoot, 5);
        // myBst.mRoot = myBst.insert(myBst.mRoot, 1);
        // myBst.mRoot = myBst.insert(myBst.mRoot, 6);
        // myBst.mRoot = myBst.insert(myBst.mRoot, 0);
        // myBst.mRoot = myBst.insert(myBst.mRoot, 3);
        // myBst.mRoot = myBst.insert(myBst.mRoot, 7);
        // myBst.mRoot = myBst.insert(myBst.mRoot, 2);
        // myBst.mRoot = myBst.insert(myBst.mRoot, 4);

        // MyBST myBst = new MyBST();
        // myBst.mRoot = myBst.insertIntoBST(myBst.mRoot, 5);
        // myBst.mRoot = myBst.insertIntoBST(myBst.mRoot, 1);
        // myBst.mRoot = myBst.insertIntoBST(myBst.mRoot, 6);
        // myBst.mRoot = myBst.insertIntoBST(myBst.mRoot, 0);
        // myBst.mRoot = myBst.insertIntoBST(myBst.mRoot, 3);
        // myBst.mRoot = myBst.insertIntoBST(myBst.mRoot, 7);
        // myBst.mRoot = myBst.insertIntoBST(myBst.mRoot, 2);
        // myBst.mRoot = myBst.insertIntoBST(myBst.mRoot, 4);

        // myBst.deleteNode(myBst.mRoot, 1);

        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        n0.left = n1;
        n0.right = n2;
        n1.left = n3;
        n1.right = n4;
        n2.right = n5;

        MyBST.PreOder(n0);

        System.out.println("done");
    }
}
