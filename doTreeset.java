package com.gordonchoi.treeset1;

/*
Created by Gordon Choi
Website: http://www.gordonchoi.com/
LinkedIn: http://www.linkedln.com/in/gordonchoi
Twitter: https://twitter.com/gordonchoi
Quora: https://www.quora.com/profile/Gordon-Choi
Github: https://github.com/gordonchoi/
*/
/*
This program demonstrates how to:
1. Iterate the items of a TreeSet.
2. Print screen all the items of a TreeSet.
3. Add items to and remove items from a TreeSet.
4. Print screen the first item & the last item of a TreeSet.
5. Check the Size of a TreeSet i.e. How many items are stored in a TreeSet.
6. Clear (remove) all the items from a TreeSet.
*/

import java.util.Iterator;
import java.util.TreeSet;

public class doTreeset {

    public static void iterateTreeset(TreeSet<Integer> tree){
        Iterator<Integer> iterator = tree.iterator();
        System.out.print("TreeSet Items: ");

        // Display the values of the TreeSet
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void printFirstAndLast(TreeSet<Integer> tree) {
        // Retrieve first data from tree set
        System.out.println("First Item: " + tree.first());

        // Retrieve last data from tree set
        System.out.println("Last Item: " + tree.last());
    }

    public static void checkTreesetSize(TreeSet<Integer> tree) {
        if (tree.isEmpty()) {
            System.out.println("TreeSet size is: " + tree.size());
        }
    }

    public static void addTreesetItem(TreeSet<Integer> tree, int integer) {
        tree.add(integer);
    }

    public static void removeTreesetItem(TreeSet<Integer> tree, int integer) {
        tree.remove(integer);
    }

    public static void clearTreeset(TreeSet<Integer> tree) {
        tree.clear();
        if (tree.isEmpty()) {
            System.out.println("All TreeSet Items have been Cleared!");
        }
    }

}
