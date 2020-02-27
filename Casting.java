public class Casting{
    public static void main(String[] args){

        // Type Casting
        byte b = 127;
        int i = b;

        System.out.println(i);

        // Explicit Casting

        double d = 35.35;
        double dd = 35.99;

        int i = (int) d;

        int ii = (int) dd;
        System.out.println(i);
        System.out.println(ii);

        //Implicit Casting

        int i = 35;
        float f = i;
        System.out.println("The number is: " + f);

        //Primitive vs Object types
        //Run time is high because created Sum variable as an Object instead of an Primitive
        //Change instance variable and it will severely reduce run time. 

        long start = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds");

        //Object types are pointers so they can contain a null value. 
    }
}