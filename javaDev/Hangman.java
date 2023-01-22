package javaDev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
public class Hangman {
  public static void main(String[] args) throws IOException {


    // read words from a file 
    String filepath = "D:\\Users\\Tom\\Documents\\GitHub\\JavaCourse\\javaDev\\text2.txt";
    BufferedReader reader = null;
    String[] words = new String[100];
    int numoflines = 0;
    try {
    reader = new BufferedReader(new FileReader(filepath));
    String topic = reader.readLine();
 System.out.println("The topic is: " + topic);
    String lines = reader.readLine();
    while ((lines =reader.readLine()) !=null) {
        if (numoflines ==0) {
     numoflines++;
     continue;
        }
        words[numoflines-1] = lines;
        numoflines++;
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
if(words.length == 0) {
    System.out.println("File is Empty");
    return;
}
Random random = new Random();
int randomIndex = random.nextInt(numoflines -1);
String wordToGuess = words[randomIndex];
    String hiddenWord = "";
    for (int i = 0; i < wordToGuess.length(); i++) {
      hiddenWord += "_";
    }
    int maxIncorrectGuesses = 6;
    int incorrectGuesses = 0;
    HashSet<String> keywords = new HashSet();
    Scanner scanner = new Scanner(System.in);
    while (incorrectGuesses < maxIncorrectGuesses) {
      System.out.println("Guess a letter in the word: " + hiddenWord); // 
      String guess = scanner.nextLine();
      if (wordToGuess.contains(guess)) {
        System.out.println("Correct!");
        for (int i = 0; i < wordToGuess.length(); i++) {
          if (wordToGuess.charAt(i) == guess.charAt(0)) {
            hiddenWord = hiddenWord.substring(0, i) + guess + hiddenWord.substring(i + 1);
          }
        }
        if (!hiddenWord.contains("_")) {
          System.out.println("You win! The word was " + wordToGuess);
          break;
        }
      } else if(!keywords.contains(guess)){
        System.out.println("Incorrect.");
        keywords.add(guess);
        incorrectGuesses++;
    }else{
        System.out.println("You already used this letter, try again.");
    }
     
        

      if (incorrectGuesses == 0) {
        System.out.println("  _____");
        System.out.println(" |     |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
      }
      if (incorrectGuesses == 1) {
        System.out.println("  _____");
        System.out.println(" |     |");
        System.out.println(" |     O");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
        System.out.println(" |");
      }
      if (incorrectGuesses == 2) {
        System.out.println("  _____");
            System.out.println(" |     |");
            System.out.println(" |     O");
            System.out.println(" |     |");
            System.out.println(" |     |");
            System.out.println(" |");
            System.out.println(" |");
      }
      if (incorrectGuesses == 3) {
        System.out.println("  _____");
        System.out.println(" |     |");
        System.out.println(" |     O");
        System.out.println(" |    \\|");
        System.out.println(" |     |");
        System.out.println(" |");
        System.out.println(" |");
      }
      if (incorrectGuesses == 4) {
        System.out.println("  _____");
        System.out.println(" |     |");
        System.out.println(" |     O");
        System.out.println(" |    \\|/");
        System.out.println(" |     |");
        System.out.println(" |");
        System.out.println(" |");
      }
      if (incorrectGuesses == 5) {
        System.out.println("  _____");
        System.out.println(" |     |");
        System.out.println(" |     O");
        System.out.println(" |    \\|/");
        System.out.println(" |     |");
        System.out.println(" |    /");
        System.out.println(" |");
      }
    
    if (incorrectGuesses == maxIncorrectGuesses) {
      System.out.println("  _____");
      System.out.println(" |     |");
      System.out.println(" |     O");
      System.out.println(" |    \\|/");
      System.out.println(" |     |");
      System.out.println(" |    / \\");
      System.out.println(" |");
      System.out.println("You lose. The word was " + wordToGuess);
    }
  }
}
}
  


// goal - if a guess was made twice don't include the second one (use an array or a set)


