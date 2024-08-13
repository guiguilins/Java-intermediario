package Set.SetCourse.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import Set.SetCourse.entities.UserCode;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<UserCode> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            int id = sc.nextInt();
            set.add(new UserCode(id));
        }

        System.out.print("How many students for course B? ");
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            int id = sc.nextInt();
            set.add(new UserCode(id));
        }

        System.out.print("How many students for course C? ");
        int c = sc.nextInt();
        for (int i = 1; i <= c; i++) {
            int id = sc.nextInt();
            set.add(new UserCode(id));
        }

        System.out.println("Total students: " + set.size());

        sc.close();
    }
}
