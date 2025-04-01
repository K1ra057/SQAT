package edu.hridasov;

/*
@autrhor Дима
@project Default (Template) Project
@class ${NAME}
@version 1.0.0
@sinc 01.04.2025 - 22 - 33
*///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Number " + number + " in Roman numerals: " + RomanConverter.intToRoman(number));
    }
}
