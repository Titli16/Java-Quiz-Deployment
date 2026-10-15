import java.util.Scanner;

public class QuizApplication {
    static Scanner sc = new Scanner(System.in);

    static String[] questions = {
        "Which language is known as the language of the web?",
        "Which keyword is used to create a class in Java?",
        "Which method is the entry point of a Java application?",
        "Which data type stores true or false?",
        "Which symbol ends most Java statements?",
        "Which loop checks its condition before running?",
        "Which class is commonly used to take keyboard input?",
        "Which keyword is used to make a decision?",
        "Which array index does Java use first?",
        "Which keyword exits a loop immediately?"
    };

    static String[][] options = {
        {"1. JavaScript", "2. HTML", "3. SQL", "4. CSS"},
        {"1. define", "2. class", "3. object", "4. create"},
        {"1. start()", "2. run()", "3. main()", "4. begin()"},
        {"1. int", "2. char", "3. boolean", "4. float"},
        {"1. :", "2. ;", "3. ,", "4. #"},
        {"1. while", "2. do-while", "3. Both A and B", "4. None"},
        {"1. Printer", "2. Scanner", "3. ReaderOnly", "4. Keyboard"},
        {"1. loop", "2. if", "3. repeat", "4. choose"},
        {"1. 1", "2. -1", "3. 0", "4. 2"},
        {"1. stop", "2. exitloop", "3. break", "4. skip"}
    };

    static int[] answers = {1, 2, 3, 3, 2, 1, 2, 2, 3, 3};

    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("       JAVA QUIZ APPLICATION");
        System.out.println("==================================");

        String playAgain;
        do {
            runQuiz();
            System.out.print("\\nWould you like to play again? (yes/no): ");
            playAgain = sc.nextLine().trim();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\\nThank you for using Java Quiz Application!");
        sc.close();
    }

    static void runQuiz() {
        int score = 0;
        System.out.println("\\nInstructions:");
        System.out.println("- There are " + questions.length + " multiple-choice questions.");
        System.out.println("- Enter an option number from 1 to 4.");
        System.out.println("- Each correct answer earns 1 mark.");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\\nQuestion " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) System.out.println(option);

            int choice = readChoice();
            if (choice == answers[i]) {
                System.out.println("Correct answer!");
                score++;
            } else {
                System.out.println("Incorrect. Correct answer: " + options[i][answers[i] - 1]);
            }
        }

        double percentage = (score * 100.0) / questions.length;
        System.out.println("\\n========== QUIZ RESULT ==========");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (questions.length - score));
        System.out.printf("Percentage      : %.2f%%%n", percentage);

        if (percentage >= 80) System.out.println("Result          : Excellent!");
        else if (percentage >= 50) System.out.println("Result          : Good effort!");
        else System.out.println("Result          : Keep practising!");
        System.out.println("=================================");
    }

    static int readChoice() {
        while (true) {
            System.out.print("Enter your choice (1-4): ");
            String input = sc.nextLine().trim();
            try {
                int choice = Integer.parseInt(input);
                if (choice >= 1 && choice <= 4) return choice;
                System.out.println("Invalid option. Please enter a number from 1 to 4.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1, 2, 3, or 4.");
            }
        }
    }
}
