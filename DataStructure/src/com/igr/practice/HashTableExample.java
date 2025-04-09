package com.igr.practice;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        
        // Adding key-value pairs
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
        hashtable.put(4, "Date");
        
        // Displaying the Hashtable
        System.out.println("Hashtable: " + hashtable);
        
        // Accessing values using keys
        System.out.println("Value for key 2: " + hashtable.get(2));
        
        // Removing an entry
        hashtable.remove(3);
        System.out.println("After removing key 3: " + hashtable);
        
        // Checking if a key exists
        System.out.println("Contains key 1? " + hashtable.containsKey(1));
        
        // Checking if a value exists
        System.out.println("Contains value 'Date'? " + hashtable.containsValue("Date"));
        
        // Iterating through Hashtable
        System.out.println("Iterating over Hashtable:");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


	
