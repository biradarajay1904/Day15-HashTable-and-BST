package com.bridelabz;

public class MapNode<K, V> {

	K key;
	V value;
	MapNode<K, V> next;

	public MapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "MyMapNode{" + "key=" + key + ", value=" + value + '}';
	}
}
