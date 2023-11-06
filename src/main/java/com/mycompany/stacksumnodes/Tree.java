package com.mycompany.stacksumnodes;
import java.util.Deque;
import java.util.LinkedList;

public class Tree {
public int value;
public Tree left;
public Tree right;

public Tree(int value, Tree left, Tree right){
    this.value = value;
    this.left = left;
    this.right = right;
}
public int StackSumTree(Tree root){
    Deque<Tree> dec = new LinkedList<>();
    int sum = 0;
    dec.push(root);
    while(!dec.isEmpty()){
        Tree node = dec.pop();
        sum += node.value;
        if(node.left != null) dec.push(node.left);
        if(node.right != null) dec.push(node.right);
    }
    return sum;
    }
}
