package JAVA.Searching_Algo;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLenght = scan.nextInt();
        int[] userArray = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            System.out.print("Enter " + i + " value: ");
            userArray[i] = scan.nextInt();
        }

        System.out.print("Enter a value to search: ");
        int searchVal = scan.nextInt();
        int searchValIndex = binarySearch(userArray, searchVal);
        if (searchValIndex >= 0) {
            System.out.println("Your value is in " + searchValIndex + " Position");
        } else {
            System.out.println("Value not found");
        }
        scan.close();
    }

    public static int binarySearch(int[] userArray, int searchVal) {
        System.out.println("Inside BinarySearch Function");
        // Sorting of array
        int arrayLenght = userArray.length;

        int low = 0;
        int high = arrayLenght - 1;
        int mid = low + (high - low) / 2;

        while (low <= high) {
            if (userArray[mid] == searchVal) {
                System.err.println("Value Found");
                System.out.println(mid);
                return mid;
            }
            else if (searchVal > userArray[mid]){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
}