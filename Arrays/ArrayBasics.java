import java.util.Arrays;

public class ArrayBasics{
    // Method to calculate the average of the numbers in the array, Time Complexity -> O(n), Space Complexity -> constant
//    static void averageOfAnArray(int arr[]) {
//        int sum = 0;
//        for(int i : arr) {
//            sum += i;
//        }
//        int size = arr.length;
//        int average = sum / size;
//        System.out.println("The average of the array is: " + average);
//    }


    // Method to multiply each number of the array by 10, Time Complexity -> O(n), Space Complexity -> O(n)
//    static int[] multiplyEachElementByTen(int arr[]) {
//        int[] mulArray = new int[arr.length];
//        for(int i = 0; i <arr.length; i++){
//            mulArray[i] = arr[i]*10;
//        }
//        System.out.println("The Array after multiplication by 10 is :");
//        return mulArray;
//    }


    // Method to search the element using Linear Search, Time Complexity -> O(n), Space Complexity -> constant
//    static void linearSearch(int[] arr, int target) {
//        for(int i : arr) {
//            if(target == i){
//                System.out.println("Target found at " + (i-1)); // In enhanced for loop I give you the element and starts with the index 1.
//                return;
//            }
//        }
//        System.out.println("Taget not found");
//    }


    // Method to find maximum in the array, Time Complexity -> O(n), Space Complexity -> constant
//    static int maxInArray(int[] arr) {
//        int maxi = arr[0];
//        for(int i : arr) {
//            if(i > maxi) {
//                maxi = i;
//            }
//        }
//        return maxi;
//    }


   // method to find the sun of positive and negative numbers in an array, Time Complexity -> O(n), Space Complexity -> constant
//    static void positiveNegativeSum(int[] arr) {
//        int positiveSum = 0;
//        int negativeSum = 0;
//        for(int i=0; i < arr.length; i++){
//            if (arr[i] >= 0) {
//                positiveSum += arr[i];
//            } else if(arr[i] < 0) {
//                negativeSum += arr[i];
//            }
//        }
//        System.out.println("The sum of positive numbers is: " + positiveSum);
//        System.out.println("The sum of negative numbers is: " + negativeSum);
//    }



    // method to count zeros and ones in the array of binary numbers
//    static int[] countZerosAndOnes(int[] arr) {
//        int zeros = 0;
//        int ones = 0;
//        for(int i : arr) {
//            if(i == 0){
//                zeros++;
//            } else {
//                ones++;
//            }
//        }
//        int[] count = {zeros, ones};
//        return count;
//
//    }


    // method to calculate the first unsorted element in the array
//    static void firstUnsortedElement(int[] arr){
//        int count = arr[0];
//        for(int i=0; i<arr.length; i++) {
//            if(count <= arr[i]) {
//            } else {
//                System.out.println(arr[i]);
//                return;
//            }
//        }
//    }

    //methode to swap alternate elements in an array
//    static int[] swapAlternateElements(int[] arr) {
//        int i = 0;
//        int[] temp = new int[arr.length];
//        while(i < arr.length) {
//            temp[i] = arr[i+1];
//            temp[i+1]=arr[i];
//            i+=2;
//        }
//        return temp;
//    }

    // method to calculate the intersection of two arrays

    static int[] intersectionOfTwoArrays(int[] arr1, int[] arr2) {

        int[] temp = new int[arr1.length];
        boolean[] visited = new boolean[arr2.length];

        int g = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j] && !visited[j]) {

                    temp[g] = arr1[i];
                    g++;

                    visited[j] = true;
                    break;
                }
            }
        }

        return Arrays.copyOf(temp, g);
    }


    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 5, 7, 60};
        int[] arr2 = {10, 60, 5, 8, 9, 20};

        int[] intersection = intersectionOfTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(intersection));


}
}