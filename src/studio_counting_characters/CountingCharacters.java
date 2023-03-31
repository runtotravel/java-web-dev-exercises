package studio_counting_characters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String firstString = "peanut butter";
        char[] charactersInString = firstString.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();

        for(int i = 0; i < charactersInString.length; i++) {
            char individualLetter = charactersInString[i];
            if (characterCount.containsKey(individualLetter) == false) {
                characterCount.put(individualLetter, 1);
            } else {
                Integer theValue = characterCount.get(individualLetter);
                theValue = theValue + 1;
                characterCount.put(individualLetter, theValue);
            }
        }
        System.out.println(characterCount);
    }
}
