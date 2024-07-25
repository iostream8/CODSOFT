package Quiz;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApp {
    private static final int TIME_LIMIT = 30; 
    private static int timeLeft = TIME_LIMIT;
    private static boolean timeUp = false;

    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "What is 5 + 7?",
            "Who wrote 'To Kill a Mockingbird'?"
        };

        String[][] options = {
            {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
            {"1. 10", "2. 11", "3. 12", "4. 13"},
            {"1. Harper Lee", "2. Mark Twain", "3. J.K. Rowling", "4. Jane Austen"}
        };

        int[] correctAnswers = {3, 3, 1}; 

        int score = 0;

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (timeLeft > 0) {
                    timeLeft--;
                    System.out.println("Time left: " + timeLeft + " seconds");
                } else {
                    timeUp = true;
                    timer.cancel();
                }
            }
        }, 0, 1000);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            if (timeUp) {
                System.out.println("\nTime's up! Quiz over.");
                break;
            }
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();
            if (answer == correctAnswers[i]) {
                score++;
            }
        }

        scanner.close();
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
