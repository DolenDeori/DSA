package JAVA.Searching_Algo;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner scanVal = new Scanner(System.in); 
        System.out.print("Enter the no. of element to store: ");
        int arrayLenght = scanVal.nextInt();
        int[] inputArray = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++){
            System.out.print("Enter " + (i + 1) +" value: ");
            inputArray[i] = scanVal.nextInt();
        }
        
        System.out.print("Enter the number you want to search: ");
        int searchVal = scanVal.nextInt();

        int searchValIndex = linearSearch(inputArray, searchVal);
        if (searchValIndex != 0){
            System.out.println("The value is in: " + (searchValIndex+1) + " position");
        }
        else{
            System.out.println("Value not found.");
        }
        scanVal.close();
    }

    public static int linearSearch(int[] searchingArray, int searchVal){
        int searchArrayLength = searchingArray.length;
        for(int i = 0; i < searchArrayLength; i++){
            if (searchVal == searchingArray[i]){
                return i;
            }
        }
        return 0;
    }
}
