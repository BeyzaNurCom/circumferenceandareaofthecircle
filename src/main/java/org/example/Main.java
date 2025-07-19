package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Double pi = 3.14;
        Double r, area, circumference;
        System.out.println("Enter the radius of the circle: ");
        System.out.println("(If it's a decimal number, use a comma (,).)");
        Scanner scan = new Scanner(System.in);
        r = scan.nextDouble();
        area = pi * (r * r);
        circumference = 2 * pi * r;

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

    }
}