package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class TvShowProgram {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name of the show: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("How many episodes? ");
            int episodes = Integer.parseInt(scanner.nextLine());

            System.out.print("What is the genre? ");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(name, episodes, genre));
        }

        for (TvShow show : tvShows) {
            System.out.println(show);
        }

        scanner.close();
    }
}
