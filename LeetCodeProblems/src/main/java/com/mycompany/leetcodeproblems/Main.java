/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leetcodeproblems;

/**
 *
 * @author Виктор
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int[] arr = {7,7,7,7,7,7,7};
        int suspect = 0;
        int counter = 0;
        int max = -1;
        int answer = -1;
        for(int i=0; i<arr.length; i++){
            System.out.println("Suspect is:"+arr[i]);
            suspect = arr[i];
            for(int j = 0; j < arr.length; j++){
                if(suspect == arr[j]) {
                    System.out.println("Suspect equal arr[i]");
                    counter++;
                }
            }
            //System.out.println(counter+" "+suspect);
            if (counter == suspect) {
                if (counter >= max) {
                    System.out.println("counter" + counter + ">= max " + max);
                    if (suspect > answer) {
                        System.out.println("suspect >= answer");
                        answer = suspect;
                        max = counter;
                    }
                }
            }
            counter = 0;
        }
        System.out.println(answer);
    }
}
