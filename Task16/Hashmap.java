import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class Hashmap
{
    public static void main(String args[])
    {
        String n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the string :");
        n=s.nextLine();
        System.out.println(n);
        String[] words = n.split(" ");
        HashMap<String, Integer> wordOccurrences = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isBlank()) {
                if (wordOccurrences.containsKey(word)) {
                    wordOccurrences.put(word, wordOccurrences.get(word) + 1);
                } else {
                    wordOccurrences.put(word, 1);
                }
            } 

    }
     System.out.println(wordOccurrences);
}
}