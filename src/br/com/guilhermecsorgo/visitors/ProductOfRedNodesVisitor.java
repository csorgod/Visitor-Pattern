package br.com.guilhermecsorgo.visitors;

import br.com.guilhermecsorgo.abstracts.TreeVis;
import br.com.guilhermecsorgo.data.structures.TreeLeaf;
import br.com.guilhermecsorgo.data.structures.TreeNode;
import br.com.guilhermecsorgo.util.Enum.Color;

public class ProductOfRedNodesVisitor extends TreeVis {

	private int result;
	private final double MODULE = Math.pow(10, 9) + 7; 
	
	/*
	 * The ProductRedNodesVisitor implementation must return the product of values stored in all red nodes, 
	 * including leaves, computed modulo (10^9) + 7. Note that the product of zero values is equal to 1.
	 * 
	 * */
	
	public int getResult() {
      	return this.result;
    }

    public void visitNode(TreeNode node) {
      	if(node.getColor() == Color.RED)
      		result = (int)((result * node.getValue()) % MODULE); 
    }

    public void visitLeaf(TreeLeaf leaf) {
    	if(leaf.getColor() == Color.RED)
    		result = (int)((result * leaf.getValue()) % MODULE);
    }
    
}
