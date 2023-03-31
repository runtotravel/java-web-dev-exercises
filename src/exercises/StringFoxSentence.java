package exercises;

import java.util.Arrays;

public class StringFoxSentence {
    public static void main(String[] args) {
        String phrase2 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentences = phrase2.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
