package Project1;

public class TreeNode implements TreePrinter.PrintableNode{
    TreeNode left, right;
    int val;
    public TreeNode(int val){
        this.val = val;
    }

    @Override
    public TreePrinter.PrintableNode getLeft() {
        return this.left;
    }

    @Override
    public TreePrinter.PrintableNode getRight() {
        return this.right;
    }

    @Override
    public String getText() {
        return String.valueOf(val);
    }
}
