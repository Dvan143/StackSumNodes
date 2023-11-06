package com.mycompany.stacksumnodes;

public class StackSumNodes {
    public static void main(String[] args) {
        Tree root = new Tree(7, new Tree(5, new Tree(3, null, null), new Tree(6, null, null)), new Tree(9, new Tree(8, null, null), new Tree(10, null, null)));
        System.out.println(root.StackSumTree(root));
    }
}
