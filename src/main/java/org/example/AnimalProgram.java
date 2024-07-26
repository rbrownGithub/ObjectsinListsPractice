package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalProgram {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");

        while (true) {
            System.out.print("Please enter a name:");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? Yes or no:");
            boolean isDog = scanner.nextLine().equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        scanner.close();
    }
}
