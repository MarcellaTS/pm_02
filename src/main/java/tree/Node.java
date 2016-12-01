
package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import distancias.IDistanceCalculator;

/**
 *
 *  Classe que define os nós da BKTree.
 * 
 *  @author marcella e priscila
 */
public class Node implements Comparable<Node>
{
    private final String word;
    private final Map<Integer, Node> children = new HashMap<Integer, Node>();
    private int distance;

    /**
    * Construtor
    */
    public Node(String palavra)
    {
	this.word = palavra;
    }

    /**
    * Get da distância
    */
    public int getDistance()
    {
	return distance;
    }

    /**
    * Pega o filho na posição distance no hashMap
    */
    public Node filhosNumaDistancia(int distancia)
    {
	return children.get(distancia);
    }

    /**
    * Método usado pela árvore para adicionar o nó na posição do hash
    */
    public void addChildNode(int position, Node childNode)
    {
	children.put(position, childNode);
    }

    /**
    *  Faz a busca na BK, a partir do nó, da distância máxima e da calculadora que será utilizada
    */
    public List<String> search(String node, int maxDistance, IDistanceCalculator calculator)
    {
	List<String> compatibleWord = new ArrayList<String>();
	this.distance = (int) calculator.distance(word, node);

        if (distance <= maxDistance)
        {
            compatibleWord.add(word);
	}

	if (children.size() == 0)
        {
            return compatibleWord;
	}

	for (int i = Math.max(1, distance - maxDistance); i <= distance + maxDistance; i++)
        {
            Node child = children.get(i);
            if (child != null)
            {
		compatibleWord.addAll(child.search(node, maxDistance, calculator));
            }
	}
	return compatibleWord;
    }

    /** 
    *   Compara se o nó é igual ao outro pela palavra
    */
    public boolean equals(Node node)
    {
	return word.equals(node.word);
    }

    /** 
    *   Get da palavra
    */
    public String getWord()
    {
	return word;
    }

    /** 
    *   Compara a distância entre os nós
    */
    public int compareTo(Node node)
    {
	if (this.distance < node.getDistance()) {
            return -1;
	}
	if (this.distance > node.getDistance()) {
            return 1;
	}
	return 0;
    }
}