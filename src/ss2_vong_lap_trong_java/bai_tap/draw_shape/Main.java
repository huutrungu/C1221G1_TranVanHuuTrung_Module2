package ss2_vong_lap_trong_java.bai_tap.draw_shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 15; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print(" * ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.println("Draw the rectangle1");
                    for (int i = 1; i < 10; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Draw the rectangle 2");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 10; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Draw the rectangle 3");
                    for (int i = 0; i < 10; i++) {
                        for (int j = 9; j > i; j--) {
                            System.out.print("  ");
                        }
                        for (int k = 1; k <= i * 2 - 1 ; k++) {
                            System.out.print(" *");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(2);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
