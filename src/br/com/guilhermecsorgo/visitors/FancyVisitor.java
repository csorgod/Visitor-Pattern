package br.com.guilhermecsorgo.visitors;

import br.com.guilhermecsorgo.abstracts.TreeVis;
import br.com.guilhermecsorgo.data.structures.TreeLeaf;
import br.com.guilhermecsorgo.data.structures.TreeNode;

public class FancyVisitor extends TreeVis {

	public int getResult() {
      	//implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
    	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
    	//implement this
    }
    
}
