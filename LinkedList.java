package com.bridelabz;

public class LinkedList<K, V> {
	MapNode<K, V> head;
	MapNode<K, V> tail;

	public MapNode<K, V> search(K searchData) {
		MapNode<K, V> temp = head;
		while (temp != null) {
			if (temp.key.equals(searchData))
				return temp;
			temp = temp.next;
		}
		return null;
	}

	public void delete(K key) {
		MapNode<K, V> temp = head;
		MapNode<K, V> searchedElement = search(key);
		while (temp.next != searchedElement) {
			temp = temp.next;
		}
		temp.next = searchedElement.next;
	}

	public void append(MapNode<K, V> node) {

		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}

	public void print() {
		MapNode<K, V> temp = head;
		while (temp != null) {
			System.out.println(temp);
			temp = temp.next;
		}
	}

	@Override
	public String toString() {
		return "LinkedList{" + "head=" + head + ", tail=" + tail + '}';
	}
}