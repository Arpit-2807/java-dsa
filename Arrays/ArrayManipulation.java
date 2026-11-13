//import java.util.HashMap;
//import java.util.Map;
//
//public class ArrayManipulation{
//
//    static int[] reverseArray(int[] arr, int start, int end) {
//
//        int i= start;
//        int j = end;
//        while(i <= j) {
//            int x = arr[i];
//            arr[i] = arr[j];
//            arr[j] = x;
//            i++;
//            j--;
//        }
//        return arr;
//    }
//
//
//     method to shift all the elements of an array by 1, Time Complexity -> O(n), Space Complexity -> constant
//    static int[] shiftByOne(int[] arr) {
//        int temp = arr[arr.length-1];
//        int i = arr.length-1;
//        while(i >=1 ) {
//            arr[i] = arr[i-1];
//            i --;
//        }
//        arr[0] = temp;
//        return arr;
//
//
//    }
//
//     method to shift an Array by k, Time Complexity -> O(n), Space Complexity -> constant
//     To run this method first we have to uncomment the reverseArray method.
//    static int[] shiftByK(int[] arr, int k) {
//       int n = arr.length;
//       k = k % n;
//       reverseArray(arr,0,n-1);
//       reverseArray(arr,0, k-1);
//       reverseArray(arr,k,n-1);
//       return arr;
//}
//
//
//     method to print the extreme alternate elements of an array, Time Complexity -> O(n), Space Complexity -> constant
//    static void printAlternateExtreme(int[] arr) {
//        int i = 0;
//        int j = arr.length-1;
//        while(i<=j) {
//            if(i == j) {
//                System.out.println(arr[i]);
//                return;
//            } else {
//                System.out.println(arr[i]);
//                System.out.println(arr[j]);
//                i++;
//                j--;
//                }
//        }
//    }
//
//     method to calculate the frequency of an array using HashMap, Time Complexity -> O(n), Space Complexity -> constant
//    static void countFrequency(int[] arr) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for(int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1 ); // calculate the values of each key by this line
//
//        }
//        for(Map.Entry<Integer,Integer> entry : map.entrySet() ) {
//            System.out.println(entry.getKey() + " : " + entry.getValue()); // this is the iteration technique using entrySet()
//        }
//        for(Integer key : map.keySet()){
//            System.out.println(key + " : " + map.get(key)); // this is the another iteration technique through keySet()
//        }
//        int currentMaxKey = -1;
//        int currentMaxValue = -1;
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()) { // loop to calculate the maximum frequency key in the HashMap
//            if(entry.getValue() > currentMaxValue) {
//                currentMaxKey = entry.getKey();
//                currentMaxValue = entry.getValue();
//            }
//        }
//        System.out.println("currentMaxKey: " + currentMaxKey);
//        System.out.println("currentMaxValue: " + currentMaxValue);
//
//
//    }
//
//
//    // method to calculate the minimum and maximum frequency in an array using HashMap Time Complexity -> O(n), Space complexity -> constant
//    static int[] countMinMaxFreq(int[] arr) {
//        HashMap<Integer, Integer> freq = new HashMap<>();
//
//        for(int num : arr) {
//            freq.put(num, freq.getOrDefault(num, 0) +1);
//        }
//
//        int currentMaxValue = Integer.MIN_VALUE;
//        int currentMaxKey=-1;
//        int currentMinValue = Integer.MAX_VALUE;
//        int currentMinKey = -1;
//
//        for(int key : freq.keySet()) {
//            if(freq.get(key) > currentMaxValue){
//                currentMaxValue = freq.get(key);
//                currentMaxKey = key;
//
//            }
//            if(freq.get(key) < currentMinValue) {
//                currentMinValue = freq.get(key);
//                currentMinKey = key;
//
//            }
//        }
//        int arr1[]  = {currentMaxValue, currentMaxKey, currentMinValue, currentMinKey};
//        return arr1;
//    }
//
//
// public static void main(String[] args) {
//     int[] arr = {1,1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 5, 7, 8, 9, 9};
//
// }
//}
