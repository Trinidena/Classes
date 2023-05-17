import java.util.Scanner;
import java.util.Random;

public class HangmanGame 
{
    public static void main(String[] args) 
    {
        String[] words = {"apple", "banana", "cherry", "orange", "grape", "mango", "kiwi", "pineapple"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        int wordLength = word.length();
        char[] maskedWord = new char[wordLength];
        for (int i = 0; i < wordLength; i++) 
        {
            maskedWord[i] = '_';
        }
        Scanner scanner = new Scanner(System.in);
        int remainingGuesses = 10;
        boolean isGameOver = false;
        while (!isGameOver) 
        {
            System.out.println("Guess a letter:");
            char guess = scanner.next().charAt(0);
            boolean isGuessCorrect = false;
            for (int i = 0; i < wordLength; i++) 
            {
                if (word.charAt(i) == guess) 
                {
                    maskedWord[i] = guess;
                    isGuessCorrect = true;
                }
            }
            if (!isGuessCorrect) 
            {
                remainingGuesses--;
                System.out.println("Incorrect guess. Remaining guesses: " + remainingGuesses);
            }
            if (remainingGuesses == 0) 
            {
                isGameOver = true;
                System.out.println("Game over. You have no more guesses. The word was: " + word);
            }
            if (String.valueOf(maskedWord).equals(word)) 
            {
                isGameOver = true;
                System.out.println("Congratulations! You have guessed the word: " + word);
            }
            System.out.println(maskedWord);
        }
    }
}