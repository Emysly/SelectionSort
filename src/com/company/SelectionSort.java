package com.company;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String a[]){


        selectionSort(new int[]{9,14,3,2,43,11,58,22});//sorting array using selection sort


    }
}