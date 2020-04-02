import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public static void main(String[] args){
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        String[] sArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"}; 
        String[] alphArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        SumAndArray(arr);
        NameArray(sArr);
        AlphaPuzzle(alphArr);
        RandomArr55();
        RandomString();
        StringArray();

    }
        
    public static ArrayList<Integer> SumAndArray(int[] arr){
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                arr2.add(arr[i]);
            }
        }
        System.out.println(sum);
        System.out.println(java.util.Arrays.asList(arr2));
        return(arr2);
    }

    public static ArrayList<String> NameArray(String[] sArr){
        List<String> sArrList = java.util.Arrays.asList(sArr);
        ArrayList<String> sArr2 = new ArrayList<String>();
        Collections.shuffle(sArrList);
        System.out.println(sArrList);
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i].length() > 5){
                sArr2.add(sArr[i]);
            }
        }
        System.out.println(sArr2);
        return(sArr2);
    }

    public static void AlphaPuzzle(String[] alphArr){
        List<String> newAlph = java.util.Arrays.asList(alphArr);
        Collections.shuffle(newAlph);
        System.out.println(newAlph.get(0));
        System.out.println(newAlph.get(25));
        if(newAlph.get(0) == "a" || newAlph.get(0) == "e" || newAlph.get(0) == "i" || newAlph.get(0) == "o" || newAlph.get(0) == "u" || newAlph.get(0) == "y") {
            System.out.println("Yerp the first letter of the new array is a vowel");
        }
    }

    public static ArrayList<Integer> RandomArr55(){
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        Random r = new Random();
        while (
            arr3.size() < 10
        ){
            arr3.add(r.nextInt(45) + 56);
        }
        Collections.sort(arr3);
        System.out.println(arr3);
        System.out.println(arr3.get(0));
        System.out.println(arr3.get(9));
        return(arr3);
    }

    public static String RandomString() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder string = new StringBuilder();
        Random rnd = new Random();
        while (string.length() < 5) {
            int index = (int) (rnd.nextInt(chars.length()));
            string.append(chars.charAt(index));
        }
        String string2 = string.toString();
        // System.out.println(string2);
        return(string2);
    }

    public static ArrayList<String> StringArray(){
        ArrayList<String> stringArray = new ArrayList<String>();
        while(stringArray.size() < 10){
            stringArray.add(RandomString());
        }
        System.out.println(stringArray);
        return(stringArray);
    }
}