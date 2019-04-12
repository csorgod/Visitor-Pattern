package br.com.guilhermecsorgo.data.structures;

import br.com.guilhermecsorgo.abstracts.Tree;
import br.com.guilhermecsorgo.abstracts.TreeVis;
import br.com.guilhermecsorgo.util.Enum.Color;

public class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}
