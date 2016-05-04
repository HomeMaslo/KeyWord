/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keyword;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author pavel
 */
public class Main {
 
    public static void main(String[] args) {

        System.out.println("Enter keywords: ");
        Map<String, Integer> mapKeywords = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (true) {
            i++;
            String value = scanner.next();
            if (value.equals("exit")) {
                break;
            }
            System.out.println("You Enter : " + value);
            if (mapKeywords.get(value) == null) {
                System.out.println("of shet");
                mapKeywords.put(value, 1);
            } else {
                mapKeywords.put(value, mapKeywords.get(value) + 1);
            }
            if (i > 10) {
                break;
            }

        }
        Set<String> keySet = mapKeywords.keySet();

        // for (String key : keySet) {
        keySet.stream().forEach((key) -> {
            System.out.printf("%s %s\n", key, mapKeywords.get(key));
        });

    }
}
