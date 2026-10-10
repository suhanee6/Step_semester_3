package day1_live_coding.class_problems;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static String playRound(String playerMove, String computerMove) {
        String player = playerMove.trim().toLowerCase();
        String computer = computerMove.trim().toLowerCase();
        if (player.equals(computer)) return "Draw";
        if ((player.equals("rock") && computer.equals("scissors"))
                || (player.equals("paper") && computer.equals("rock"))
                || (player.equals("scissors") && computer.equals("paper"))) return "Player Wins";
        return "Computer Wins";
    }

    private static String randomMove(Random random) {
        String[] moves = {"Rock", "Paper", "Scissors"};
        return moves[random.nextInt(moves.length)];
    }

    public static void main(String[] args) {
        final int rounds = 5;
        String[] playerMoves = new String[rounds];
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];
        int wins = 0, losses = 0, draws = 0;
        Random random = new Random();

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < rounds; i++) {
                System.out.print("Round " + (i + 1) + " — Enter Rock, Paper, or Scissors: ");
                String move = scanner.nextLine().trim();
                while (!move.equalsIgnoreCase("rock") && !move.equalsIgnoreCase("paper")
                        && !move.equalsIgnoreCase("scissors")) {
                    System.out.print("Invalid move. Enter Rock, Paper, or Scissors: ");
                    move = scanner.nextLine().trim();
                }
                playerMoves[i] = move.substring(0, 1).toUpperCase() + move.substring(1).toLowerCase();
                computerMoves[i] = randomMove(random);
                results[i] = playRound(playerMoves[i], computerMoves[i]);
                if (results[i].equals("Player Wins")) wins++;
                else if (results[i].equals("Computer Wins")) losses++;
                else draws++;
                System.out.println(results[i]);
            }
        }

        System.out.println("\nRound | Player Move | Computer Move | Result");
        for (int i = 0; i < rounds; i++)
            System.out.printf("%5d | %-11s | %-13s | %s%n", i + 1, playerMoves[i], computerMoves[i], results[i]);
        double winPercentage = wins * 100.0 / rounds;
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                wins, losses, draws, winPercentage);
    }
}