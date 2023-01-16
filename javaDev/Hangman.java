package javaDev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.w3c.dom.css.Counter;

public class Hangman {
  public static void main(String[] args) throws IOException {
    // read words from a file 
    String filepath = "D:\\Users\\Tom\\Documents\\GitHub\\JavaCourse\\javaDev\\text2.txt";
    BufferedReader reader = null;
    String[] words = new String[100];

    try {
    reader = new BufferedReader(new FileReader(filepath));
    String lines = reader.readLine();
    int numoflines = 0;
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
    String topic;
    String wordToGuess = words[(int) (Math.random() * words.length)];
    String hiddenWord = "";
    for (int i = 0; i < wordToGuess.length(); i++) {
      hiddenWord += "_";
    }
    int maxIncorrectGuesses = 6;
    int incorrectGuesses = 0;
    Scanner scanner = new Scanner(System.in);
    // System.out.println("Topic: " + topic);
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
      } else {
        System.out.println("Incorrect.");
        incorrectGuesses++;
      }
    }
    if (incorrectGuesses == maxIncorrectGuesses) {
      System.out.println("You lose. The word was " + wordToGuess);
    }
  }
}

