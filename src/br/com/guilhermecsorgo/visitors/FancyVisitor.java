package br.com.guilhermecsorgo.visitors;

import br.com.guilhermecsorgo.abstracts.TreeVis;
import br.com.guilhermecsorgo.data.structures.TreeLeaf;
import br.com.guilhermecsorgo.data.structures.TreeNode;
import br.com.guilhermecsorgo.util.Enum.Color;

public class FancyVisitor extends TreeVis {

	private int depthSum;
	private int leavesSum;
	
	/*
	 * The FancyVisitor implementation must return the absolute difference between the sum of values stored in the tree's non-leaf nodes
	 * at even depth and the sum of values stored in the tree's green leaf nodes. Recall that zero is an even number.
	 * 
	 * */
	
	public int getResult() {
      	return Math.abs(depthSum - leavesSum);
    }

    public void visitNode(TreeNode node) {
    	if(node.getDepth() % 2 == 0)
    		depthSum += node.getValue();		
    }

    public void visitLeaf(TreeLeaf leaf) {
    	if(leaf.getColor() == Color.GREEN)
    		leavesSum += leaf.getValue();
    }
    
}
