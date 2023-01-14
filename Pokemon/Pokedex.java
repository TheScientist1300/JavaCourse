package Pokemon;
import java.util.Scanner;
import java.time.*;
public class Pokedex extends Pokemons {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        Pokemons chue = new Pikachu();
        Pokemons mew2 = new Mewtwo();
        System.out.println("Hi! I am the pokedex! I can provide information about various pokemons. Today I have information about 2 pokemons: Pikachu and Mewtwo. Which will you like to hear about?");
        String choise1 = s.nextLine();
        if (choise1.equals("Pikachu")) {
            chue.gender();
            Thread.sleep(1000);
            chue.type();
            Thread.sleep(1000);
            chue.sound();
            Thread.sleep(1000);
            chue.tail();
            Thread.sleep(1000);
            chue.colors();
            Thread.sleep(1000);
            System.out.println("Would you like to learn about the second pokemon? Type yes or no");
            String choise2 = s.nextLine();
            if (choise2.equals("yes")) {
                mew2.gender();
                Thread.sleep(1000);
                mew2.type();
                Thread.sleep(1000);
                mew2.sound();
                Thread.sleep(1000);
                mew2.tail();
                Thread.sleep(1000);
                mew2.colors();
            }
        }
        else if (choise1.equals("Mewtwo")) {
            mew2.gender();
            Thread.sleep(1000);
            mew2.type();
            Thread.sleep(1000);
            mew2.sound();
            Thread.sleep(1000);
            mew2.tail();
            Thread.sleep(1000);
            mew2.colors();
            Thread.sleep(1000);
            System.out.println("Would you like to learn about the second pokemon? Type yes or no");
            String choise2 = s.nextLine();
            if (choise2.equals("yes")) {
                chue.gender();
                Thread.sleep(1000);
                chue.type();
                Thread.sleep(1000);
                chue.sound();
                Thread.sleep(1000);
                chue.tail();
                Thread.sleep(1000);
                chue.colors();
            } 
        }
    }
}
