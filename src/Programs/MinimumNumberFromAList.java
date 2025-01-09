package Programs;

import java.util.Scanner;

//WAP to find the minimum number from a list of integers

public class MinimumNumberFromAList {

    public static void main(String[] args){

        Scanner scr = new Scanner(System.in);

        int size = scr.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++)
            arr[i] = scr.nextInt();

        int min = 99999;

        for(int i=0; i<size; i++)
            if(min>arr[i])
                min = arr[i];

        System.out.println(min);

    }
}