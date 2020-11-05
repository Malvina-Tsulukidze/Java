package Malvina_Tsulukidze;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int y = 20;
        Map<String, String> question = new HashMap<>();
        question.put("მაჩვენე-ფილიალები", "სამწუხაროდ ამ თემაზე ინფორმაციას არ ვფლობ.");
        question.put("მითხარი-ეროვნული-ვალუტის-კურსი", "რომელ ვალუტაში გნებავთ? (დოლარი, ევრო)");
        question.put("დოლარი", "დოლარი = 3.39940 ");
        question.put("ევრო", "ევრო = 4.01310");
        question.put("გამარჯობა", "მოგესალმებით");
        question.put("ნახვამდის", "ნახვამდის");
        String x;
        Scanner scanner = new Scanner(System.in);
        while(y>15) {
            x = scanner.next();
            System.out.println(question.get(x));
            if(x=="ნახვამდის") {
                y=6;
            }
        }
    }
}