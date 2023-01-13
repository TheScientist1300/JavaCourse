package javaDev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
public class One {
  public static void main(String[] args) {
    // Open the file
    BufferedReader reader = null;
    String filepath = "D:\\Users\\Tom\\Documents\\GitHub\\JavaCourse\\javaDev\\text.txt";
    Set<String> uniqueLines = new HashSet<>();
    Set<String> uniquewords = new HashSet<>();
    try {
      reader = new BufferedReader(new FileReader(filepath));
      BufferedReader reader2 = new BufferedReader(reader.nullReader());
      // Read the first line
      String line = reader.readLine();
      String[] words = line.split(" ");
      for (String word : words) {
        uniqueLines.add(word);
      }
      while (line != null) {
        System.out.println(line);
        uniqueLines.add(line);       
        line = reader.readLine();
      }
    } catch (IOException e) {
       e.printStackTrace();
        
    } finally {
      //Close the file
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  
  for (String uniqueLine : uniqueLines) {
    System.out.println(uniqueLine);
  }
  System.out.println("                                                         ");
  for (String uniqueword : uniquewords) {
    System.out.println(uniqueword);
  }
}
}


