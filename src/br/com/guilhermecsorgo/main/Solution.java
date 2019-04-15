package br.com.guilhermecsorgo.main;

import java.awt.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import br.com.guilhermecsorgo.abstracts.Tree;
import br.com.guilhermecsorgo.data.structures.TreeLeaf;
import br.com.guilhermecsorgo.data.structures.TreeNode;
import br.com.guilhermecsorgo.util.Enum.Color;
import br.com.guilhermecsorgo.visitors.FancyVisitor;
import br.com.guilhermecsorgo.visitors.ProductOfRedNodesVisitor;
import br.com.guilhermecsorgo.visitors.SumInLeavesVisitor;

public class Solution {

	/*
	 * Resolu��o do projeto > https://www.hackerrank.com/challenges/java-vistor-pattern/problem
	 * 
	 * */
	
	public static Tree solve() {
		
		Tree tree = null;
		int treeDepth = 10;
		int nodeValues[];
		Color nodeColors[];
			
		System.out.println("Por favor, digite a profundidade da �rvore: "
				+ "\nPS: Se nenhum valor num�rico for escolhido, ser� assumido o valor '10'");
		treeDepth = new Scanner(System.in).nextInt();
		
		nodeValues = new int[treeDepth];
		nodeColors = new Color[treeDepth];
		
		System.out.println("Usaremos o valor " + treeDepth + ".");
		
		System.out.println("Agora, teremos que setar valores e cores para cada n�. "
				+ "\nSe quiser que fa�amos isso 'pseudo-randomicamente', digite 0. Caso contr�rio, digite 1.");
		
		int randomOrNot = new Scanner(System.in).nextInt();
		
		if(randomOrNot == 0) {
			for(int index = 0; index < nodeValues.length; index ++) {
				nodeValues[index] = (int) (Math.random() * 100);
			}
			for(int index = 0; index < nodeColors.length; index ++) {
				nodeColors[index] = (Math.random() < 0.5) ? Color.GREEN : Color.RED;
			}
		} else {
			for(int index = 0; index < nodeValues.length; index ++) {
				System.out.println("Digite o valor do n� N� " + index);
				nodeValues[index] = new Scanner(System.in).nextInt();
			}
			
			System.out.println("Agora vamos escolher as cores. Digite 0 para VERDE ou qualquer outro n�mero para VERMELHO");
			
			for(int index = 0; index < nodeColors.length; index ++) {
				System.out.println("Digite a cor do n� N� " + index);
				nodeColors[index] = (new Scanner(System.in).nextInt() == 0) ? Color.GREEN : Color.RED ;
			}
		}
		
		System.out.println("Agora precisamos definir arestas entre os n�s. Cada aresta significa a liga��o entre o n� 'U' e o n� 'V'");
		
		System.out.println("Ser� necess�rio definir " + treeDepth + " arestas. Utilize o padr�o 'U V' Ao final, pressione "
				+ "enter para prosseguir");
		System.out.println("Exemplo: 1 3 [ENTER]");
		
		System.out.println("Tudo certo, vamos montar sua �rvore! Aguarde...");
		
		if(treeDepth == 1)
			tree = new TreeLeaf(nodeValues[0], nodeColors[0], 0);
		else {
			Map<Integer, Set<Integer>> edges = new HashMap();
			
			Set<Integer> uEdges;
			Set<Integer> vEdges;
			
			for(int index = 0; index < treeDepth; index++)
			{
				int uEdge = new Scanner(System.in).nextInt();
	            int vEdge = new Scanner(System.in).nextInt();
	            
	            uEdges = edges.get(uEdge);
	            if(uEdges.equals(null))
	            	uEdges = new HashSet<>();
	            
	            vEdges = edges.get(vEdge);
	            if(vEdges.equals(null))
	            	vEdges = new HashSet<>();
	            
	            uEdges.add(uEdge);
	            vEdges.add(vEdge);
	            
	            edges.put(uEdge, uEdges);
	            edges.put(vEdge, uEdges);
	                       
	            uEdges = null;
	            vEdges = null;
			}
			
			tree = new TreeNode(nodeValues[0], nodeColors[0], 0);
			Iterator iterator = edges.entrySet().iterator();
			
			while(iterator.hasNext()) {
				if(iterator.)
			}
			
		}
		
		return tree;
    }


    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
    
}
