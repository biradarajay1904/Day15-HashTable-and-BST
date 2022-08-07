package com.bridelabz;

public class MainClass {

	public static void main(String[] args) {
		String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

		String[] splitArray = paragraph.split(" ");
		HashTable<String, Integer> hashTable = new HashTable<>();
		for (String word : splitArray) {
			Integer value = hashTable.get(word);
			if (value == null) {
				value = 1;
			} else
				value = value + 1;
			hashTable.add(word, value);
		}

		hashTable.print();
		System.out.println();

		hashTable.remove("avoidable");
		hashTable.print();
	}
}
