package com.LRU;

import java.util.LinkedHashMap;
import java.util.Map;

class Node {
	int value;
	Node prev;
	Node next;

	public Node(int value, Node prev, Node next) {
		super();
		this.value = value;
		this.prev = prev;
		this.next = next;
	}

}

public class LRUCache {

	public static void lRUCache(Node node) {
		Map<Node, Integer> mp = new LinkedHashMap<>();
		
		mp.put(node, null)

	}

	static void deleteNode(Node head, Node newNode) {
		Node curr = head;
		while (curr.next.next != null) {
			curr = curr.next;
		}
		if (curr.next.next == null) {
			curr.next = null;
		}
	}

	static void addNode(Node head, Node newNode) {
		if (head == null)
			head = newNode;
		newNode.next = head;
		newNode.prev = null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
