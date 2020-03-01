import java.util.Scanner;  //import scanner

public class Diamond
{
   public static void main(String[] args)
   {

      int i, j, space = 1;
      System.out.println("Welcome to the Diamond printing program!");
 
      Scanner scanner = new Scanner(System.in); 

      System.out.println("With what character do you want to draw: ");
      char diamondChar = scanner.next().charAt(0);


      System.out.println("What will be the length of the middle line: ");
      int length = scanner.nextInt();

      while (length < 0 || length % 2 == 0)
      {
         System.out.println("INVALID INPUT: Integer must be odd and positive");
         length = scanner.nextInt();
      }

      for (j = 0; j <= length; j++) 
      {
         for (i = length; i >= space; i--) 
         {
            System.out.print(" ");
         }
         space++;
         for (i = 1; i <= 2 * j - 1; i++) 
         {
            System.out.print(diamondChar);
         }
            System.out.println("");
      }
        space = 1;
        for (j = 1; j <= length - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (length - j) - 1; i++) 
            {
                System.out.print(diamondChar);
            }
            System.out.println("");
       }
   }
}