package br.com.guilhermecsorgo.abstracts;

import br.com.guilhermecsorgo.data.structures.TreeLeaf;
import br.com.guilhermecsorgo.data.structures.TreeNode;

public abstract class TreeVis {
	
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}