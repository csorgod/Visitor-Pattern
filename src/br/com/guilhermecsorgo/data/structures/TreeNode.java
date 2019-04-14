package br.com.guilhermecsorgo.data.structures;

import java.util.ArrayList;

import br.com.guilhermecsorgo.abstracts.Tree;
import br.com.guilhermecsorgo.abstracts.TreeVis;
import br.com.guilhermecsorgo.util.Enum.Color;

public class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}
	