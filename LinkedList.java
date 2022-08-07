package com.bridelabz;

public class LinkedList<K, V> {
	MapNode<K, V> head;
	MapNode<K, V> tail;

	public void add(K key, V value) {
		MapNode<K, V> newNode = new MapNode<K, V>(key, value);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void replace(K key, V value) {
		MapNode<K, V> temp = head;
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
			}
			temp = temp.next;
		}
	}

	public boolean containsKey(String key) {
		MapNode<K, V> temp = head;
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;

	}

	public int get(String word) {
		MapNode<K, V> temp = head;
		int count = 0;
		while (temp != null) {
			if (temp.key.equals(word)) {
				count++;
			}
			temp = temp.next;
		}
		return count;
	}

	public void print() {
		MapNode<K, V> temp = head;
		while (temp != null) {
			System.out.print("{ " + temp.key + "=" + temp.value + " }" + "\n");
			temp = temp.next;
		}
	}
}