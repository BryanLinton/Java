public class DiamondPrinter{

     public static void main(String []args){
        int j,i,z=0;
        int length = 9;
        
        for (i = 0; i <= length/2; i++)
        {
            for (j = 1; j <= length/2-i; j++)
            {
                System.out.print(" ");
            }
            for (j = i*2; j >= 0; j--)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
        for (i = length/2-1; i >= 0; i--)
        {
            for (j = 1; j <= length/2 - i; j++)
            {
                System.out.print(" ");
            }
            for (j = i*2; j >=0; j--)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
     }
}