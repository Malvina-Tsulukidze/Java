package Malvina_Tsulukidze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        int x = 2;
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Pig", "ღორი");
        dictionary.put("Cat", "კატა");
        dictionary.put("Dog", "ძაღლი");
        dictionary.put("Panda", "პანდა");
        dictionary.put("Lion", "ლომი");
        dictionary.put("Giraffe", "ჟირაფი");
        dictionary.put("Monkey", "მაიმუნი");

        Scanner scanner = new Scanner(System.in);
        while (x > 1) {
            System.out.println("შემოიტანე სიტყვა:");
            System.out.println(dictionary.get(scanner.next()));
        }
    }
}
