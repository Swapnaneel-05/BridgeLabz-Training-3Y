package BridgeLabz.Strings.Level2;

import java.util.Scanner;

public class RockPaper {
    static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return "user";
        else return "computer";
    }

    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User"; 
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0 / games)) + "%";
        stats[1][0] = "Computer"; 
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", (compWins * 100.0 / games)) + "%";
        return stats;
    }

    static void displayResults(int games, String[] userChoices, String[] compChoices, String[] winners, String[][] stats) {
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Game", "User", "Computer", "Winner");
        for (int i = 0; i < games; i++) {
            System.out.printf("%-10d %-10s %-10s %-10s%n", (i+1), userChoices[i], compChoices[i], winners[i]);
        }
        System.out.println("\nStatistics:");
        System.out.printf("%-10s %-10s %-10s%n", "Player", "Wins", "Win %");
        for (String[] row : stats) {
            System.out.printf("%-10s %-10s %-10s%n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        String[] userChoices = new String[games];
        String[] compChoices = new String[games];
        String[] winners = new String[games];
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            System.out.print("Game " + (i+1) + " - Enter rock, paper or scissors: ");
            String user = sc.nextLine().toLowerCase();
            String comp = getComputerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) compWins++;
            userChoices[i] = user;
            compChoices[i] = comp;
            winners[i] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(games, userChoices, compChoices, winners, stats);
        sc.close();
    }
}
