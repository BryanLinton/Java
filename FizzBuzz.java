public class FizzBuzz {
    public String fizzCondition(int number){
        String word = "empty";
        if(number % 3 == 0 && number % 5 == 0){
            word = "FizzBuzz";
        }
        else if(number % 5 == 0){
            word = "Buzz";
        }
        else if(number % 3 == 0){
            word = "Fizz";
        }
        else{
            return(Integer.toString(number));
        }
        return(word);
    }
}