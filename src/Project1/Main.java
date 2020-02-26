package Project1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        BinarySearchTree bst = new BinarySearchTree(15);

        bst.insertRec(11);
        bst.insertRec(3);
        bst.insertRec(13);
        bst.insertRec(21);
        bst.insertRec(14);

        bst.printTree();
        System.out.println("Insert 17 to the tree: ");
        bst.insertIter(17);
        bst.printTree();
        System.out.println("Delete 11 from the tree: ");
        bst.deleteIter(11);
        bst.printTree();
        TreeNode prev = bst.findPrevIter(15);
        System.out.println("Prev node of 15 is " + prev.val);
        TreeNode next = bst.findNextIter(15);
        System.out.println("Next node of 15 is " + next.val);
        System.out.println("The max one from the tree is " + bst.findMax());
        System.out.println("The min one from the tree is " + bst.findMin());


        List<Integer> bstList = new ArrayList<>();
        bstList.add(19);
        bstList.add(22);
        bstList.add(39);
        bstList.add(11);
        bstList.add(12);
        bstList.add(13);
        System.out.println();
        System.out.println("The list before sorted: ");
        for(int i : bstList){
            System.out.print(i + " ");
        }
        System.out.println();
        bstList = BSTSort.Sort(bstList);
        System.out.println("After BST sort: ");
        for(int i : bstList){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int[] sortedArray, randomArray;
        System.out.println("Random Array with size 10: ");
        randomArray = getArray.getRandomArray(10);
        for(int i : randomArray){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        sortedArray = getArray.getSortedArray(10);
        System.out.println("Sorted Array with size 10: ");
        for(int i : sortedArray){
            System.out.print(i + " ");
        }

    }
}
