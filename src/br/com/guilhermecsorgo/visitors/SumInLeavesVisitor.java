package br.com.guilhermecsorgo.visitors;

import br.com.guilhermecsorgo.abstracts.TreeVis;
import br.com.guilhermecsorgo.data.structures.TreeLeaf;
import br.com.guilhermecsorgo.data.structures.TreeNode;

public class SumInLeavesVisitor extends TreeVis {
	
	private int result;
	
	/*
	 * The SumInLeavesVisitor implementation must return the sum of the values in the tree's leaves only.
	 * 
	 * */
	
	public int getResult() {
      	return this.result;
    }

    public void visitNode(TreeNode node) {
      	//Esse método não deve ser implementado aqui, pois se trata de um "SumInLeaves".
    }

    public void visitLeaf(TreeLeaf leaf) {
      	result += leaf.getValue();
    }
}
