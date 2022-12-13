import java.util.Random;
import java.util.Scanner;

public class RandomSsentecesGenerator {
    public static String getRandomWord (String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
    public static void main(String[] args)
    {

       String[] names = {"Peter", "Michell", "Jane", "Steve"};
       String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas" };
       String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
       String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
       String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
       String[] details = {"near the river", "at home", "in the park"};

       Scanner scanner  = new Scanner(System.in);
        System.out.println("Hello, this is your first random-generated sentence: ");
    while (true) {
        String randomName = getRandomWord(names);
        String randomPlaces = getRandomWord(places);
        String randomVerbs = getRandomWord(verbs);
        String randomNouns = getRandomWord(nouns);
        String randomAdverbs = getRandomWord(adverbs);
        String randomDetails = getRandomWord(details);
        String enter = scanner.nextLine();
        if(enter.equals(" ")) break;
        System.out.printf("%s from %s %s %s %s %s%n", randomName, randomPlaces, randomAdverbs, randomVerbs, randomNouns, randomDetails);
        System.out.println("Click [Enter] to generate a new one.");

    }
    }

}