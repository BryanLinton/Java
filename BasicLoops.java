import java.util.ArrayList;
public class BasicLoops{
    public static void main(String[] args){
        int[] arr = {1, 3, 7, -1, 16, 244};
        double[] arr2 = {1, 3, 7, -1, 16, 244};
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        OneTo255();
        OddTo255();
        PrintSum();
        IterateArray(arr);
        FindMax(arr);
        FindAverage(arr2);
        OddArray(arr3);
        GreaterThanY(arr);
        SquareValues(arr);
        EliminateNegatives(arr);
        MaxMinAvg(arr, arr2);
        ShiftValues(arr);
    }

     public static void OneTo255() {
        for(int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    public static void OddTo255() {
        for(int i = 1; i <= 255; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void PrintSum() {
        int sum = 0;
        for(int i = 0; i <= 255; i++){
            sum =+ sum + i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public static void IterateArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println("Itterated at index " + i + " is: " + arr[i]);
        }
    }

    public static int FindMax(int[] arr) {
        int max = arr[0];
        for( int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The max value in the array is: " + max);
        return(max);
    }

    public static double FindAverage(double[] arr2) {
        double sum = 0;
        for(int i = 0; i < arr2.length; i++){
            sum += arr2[i];
        }
        double avg = sum/arr2.length;
        System.out.println(String.format("The average value of the array is: %f", avg));
        return(avg);
    }

    public static void OddArray(ArrayList<Integer> arr3) {
        for(Integer i = 1; i <= 255; i++){
            if(i % 2 != 0){
                arr3.add(i);
            }
        }
        System.out.println(arr3);
    }

    public static void GreaterThanY(int[] arr) {
        int y = 5;
        int greater = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                greater++;
            }
        }
        System.out.println("The number of values in the array greater than y is: " + greater);
    }

    public static void SquareValues(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void EliminateNegatives(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void MaxMinAvg(int[] arr, double[] arr2){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(FindMax(arr));
        System.out.println("Min: " + min);
        System.out.println(FindAverage(arr2));
    }

    public static void ShiftValues(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];  
        }
        arr[arr.length - 1] = 0;
        System.out.println(java.util.Arrays.toString(arr));
    }
}