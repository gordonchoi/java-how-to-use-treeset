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

import java.util.TreeSet;

public class Main {

        public static void main(String[] args) {
            TreeSet<Integer> tree = new TreeSet<Integer>();

            //Initialize the TreeSet with integer values
            initializeTreeset.initialize(tree);

            //Iterate & display the values of the TreeSet
            doTreeset.iterateTreeset(tree);

            //Print the first & last items of the TreeSet
            doTreeset.printFirstAndLast(tree);

            //Check Size of the TreeSet
            doTreeset.checkTreesetSize(tree);

            //Add an Item to the TreeSet
            doTreeset.addTreesetItem(tree, 0);

            //Iterate & display the values of the TreeSet
            doTreeset.iterateTreeset(tree);

            //Print the first & last items of the TreeSet
            doTreeset.printFirstAndLast(tree);

            //Check Size of the TreeSet
            doTreeset.checkTreesetSize(tree);

            //Add an Item to the TreeSet
            doTreeset.addTreesetItem(tree, 15);

            //Iterate & display the values of the TreeSet
            doTreeset.iterateTreeset(tree);

            //Print the first & last items of the TreeSet
            doTreeset.printFirstAndLast(tree);

            //Check Size of the TreeSet
            doTreeset.checkTreesetSize(tree);

            //Remove an Item from the TreeSet
            doTreeset.removeTreesetItem(tree, 15);

            //Iterate & display the values of the TreeSet
            doTreeset.iterateTreeset(tree);

            //Print the first & last items of the TreeSet
            doTreeset.printFirstAndLast(tree);

            //Check Size of the TreeSet
            doTreeset.checkTreesetSize(tree);

            //Remove all Items from the TreeSet
            doTreeset.clearTreeset(tree);

            //Check Size of the TreeSet
            doTreeset.checkTreesetSize(tree);

        }
    }