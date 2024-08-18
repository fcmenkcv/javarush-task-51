package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/*
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int number = console.nextInt();
        int i = 1;

        do {
            System.out.println(s);
            i++;
            if (number <= 0 || number >= 5) {
                break;
            }
        } while (i <= number);
    }
}
