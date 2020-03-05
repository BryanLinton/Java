public class BasicLoops{
    public static void main(String[] args){

        //Print to 255
        // for(int i = 1; i <= 255; i++){
        //     System.out.println(i);
        // }

        //Print odd to 255
        // for(int i = 1; i <= 255; i++){
        //     if(i % 2 != 0){
        //         System.out.println(i);
        //     }
        // }

        //Print Sum
        int sum = 0;
        // for(int i = 0; i <= 255; i++){
        //     sum =+ sum + i;
        //     System.out.println("New number: " + i + " Sum: " + sum);
        // }

        //Iterate Through and array
        int[] arr = {1,3,5,-1,9,0,1};
        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        //Find Max
        // int max = arr[0];
        // for( int i = 0; i < arr.length; i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);

        //Find Average
        sum = 0;
        int len = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            len += 1;
        }
        double avg = sum / len;
        System.out.println(avg);
    }
}