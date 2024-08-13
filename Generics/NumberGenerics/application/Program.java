package Generics.NumberGenerics.application;


import java.util.Scanner;

import Generics.NumberGenerics.services.PrintService;

public class Program {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    PrintService<Integer> ps = new PrintService<>();

    System.out.println("How many values? ");
    int n = sc.nextInt();

    for(int i = 1; i <= n; i++) {
        int value = sc.nextInt();
        ps.addValue(value);
    }

    ps.print();
    System.out.println("First: " + ps.first());

    sc.close();
 }   
}
