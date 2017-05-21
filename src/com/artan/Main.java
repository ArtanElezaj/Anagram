package com.artan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }

    //anagram first method
    public static boolean numberNeeded(String first, String second) {

       ArrayList<Character> arr1 = new ArrayList<>();

        if(first.length() != second.length()){
            return false;
        }

        for(int i=0; i<first.length(); i++){
            arr1.add(first.charAt(i));
        }

        for(int i=0; i<second.length(); i++){
            for(int j=arr1.size() - 1; j>=0; j--){
                if(second.charAt(i) == arr1.get(j)){
                    arr1.remove(j);
                    break;
                }
            }
        }

        if (arr1.size()>0){
            return false;
        }
        return true;
    }

    //anagram second method
//    public static int numberNeeded(String first, String second) {
//
//        int deletedCount = 0;
//        int[] aArr = new int[26];
//        int[] bArr = new int[26];
//        for (int i = 0; i < first.length(); i++) {
//            int index = first.charAt(i) - 'a';
//            aArr[index]++;
//        }
//        for (int i = 0; i < second.length(); i++) {
//            int index = second.charAt(i) - 'a';
//            bArr[index]++;
//        }
//        for (int i = 0; i < 26; i++) {
//            if(aArr[i]>bArr[i])
//            {
//                deletedCount = deletedCount+ aArr[i]-bArr[i];
//            }
//            if(aArr[i]<bArr[i])
//            {
//                deletedCount = deletedCount+ bArr[i]-aArr[i];
//            }
//        }
//        return deletedCount;
//    }


}
