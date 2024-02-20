public class wordle {
        public static void main(String[] args) {
            String secretWord = "coder";
            String userGuess = "coder"; // In a real application, you'd get this from user input

            checkGuess(secretWord, userGuess);
        }

        public static void checkGuess(String secretWord, String guess) {
            if (guess.equals(secretWord)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect");
            }
        }
    }
