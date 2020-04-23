import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    char[] vowels = {"a,e,i,o,u,y,A,E,I,O,U,Y"};
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      for(int i = 0; i < line.length; i++){
        for(int charI = 0; i < vowels.length; charI++){
          if(line(i) == vowels(charI)){
            line(i) = 0;
          }
        }
      }
      System.out.println(line);
    }
  }
}