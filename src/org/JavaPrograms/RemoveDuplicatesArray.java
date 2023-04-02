package org.JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesArray
{
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        
        HashSet<T> set = new HashSet<>();

       
        ArrayList<T> result = new ArrayList<>();

       
        for (T element : list) {
           
            if (set.add(element)) {
               
                result.add(element);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);

        ArrayList<Integer> uniqueList = removeDuplicates(list);
        System.out.println(uniqueList);
    }
}