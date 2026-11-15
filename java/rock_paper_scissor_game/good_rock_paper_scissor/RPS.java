package rock_paper_scissor_game.good_rock_paper_scissor;

import java.util.Scanner;

public class RPS {

    private static final String WELCOME = "Welcome to the game of ROCK PAPER SCISSOR";
    private static final String GUIDE = "This is how it works the computer picks a material then you pick yours then we see who wins";
    private static final String USER_CHOICE_PROMPT = "For Rock, enter R\nPaper, enter P\nThen for Scissor, enter S ";
    private static final String INVALID_CHOICE_MESSAGE = "You did not pick a valid item";
    private static final String PLAYER_CHOICE_MESSAGE = "You picked ";
    private static final String COMPUTER_CHOICE_MESSAGE = "Computer picked ";
    private static final String WIN_MESSAGE = "You win....CONGRATULATIONS";
    private static final String LOSE_MESSAGE = "I am sorry, you lost";
    private static final String TIE_MESSAGE = "Your pick is the same with that of the computer...ITS A TIE";
    private static final String PLAY_AGAIN_PROMPT = "To play again, Enter Y, else enter N";
    private static final String THANK_YOU_MESSAGE = "Thank you for playing";
    private static final Scanner INPUT = new Scanner(System.in);

    private enum Choice {
        ROCK, PAPER, SCISSOR
    }

    public static void main(String[] args) {
        welcome();
        String play;
        do {
            playGame();
            System.out.println(PLAY_AGAIN_PROMPT);
            play = INPUT.nextLine().toLowerCase();
        } while (play.startsWith("y"));
        System.out.println(THANK_YOU_MESSAGE);
    }

    private static void welcome() {
        System.out.println(WELCOME);
        System.out.println(GUIDE);
    }

    public static void playGame() {
        Choice playerChoice = getPlayerChoice();
        Choice computerChoice = getComputerChoice();
        System.out.println(COMPUTER_CHOICE_MESSAGE + computerChoice);
        System.out.println(PLAYER_CHOICE_MESSAGE + playerChoice);
        determineAndDisplayResult(playerChoice, computerChoice);
    }

    private static Choice getPlayerChoice() {
        System.out.println(USER_CHOICE_PROMPT);
        String playerInput = INPUT.nextLine().toLowerCase();
        Choice playerChoice = convertPlayerInputToChoice(playerInput);
        if (playerChoice == null) {
            System.out.println(INVALID_CHOICE_MESSAGE);
            return getPlayerChoice();
        }
        return playerChoice;
    }

    private static Choice convertPlayerInputToChoice(String userInput) {
        Choice choice = null;
        if (userInput.startsWith("r")) {
            choice = Choice.ROCK;
        } else if (userInput.startsWith("p")) {
            choice = Choice.PAPER;
        } else if (userInput.startsWith("s")) {
            choice = Choice.SCISSOR;
        }
        return choice;
    }

    private static Choice getComputerChoice() {
        Choice[] computerChoices = {Choice.ROCK, Choice.PAPER, Choice.SCISSOR};
        int computerChoiceInteger = (int) (Math.random() * 3);
        return computerChoices[computerChoiceInteger];
    }

    private static void determineAndDisplayResult(Choice playerChoice, Choice computerChoice) {
        if (isPlayerTie(playerChoice, computerChoice)) {
            System.out.println(TIE_MESSAGE);
        } else if (isPlayerLost(playerChoice, computerChoice)) {
            System.out.println(LOSE_MESSAGE);
        } else {
            System.out.println(WIN_MESSAGE);
        }
    }

    private static boolean isPlayerLost(Choice playerChoice, Choice computerChoice) {
        return (playerChoice == Choice.ROCK && computerChoice == Choice.PAPER) ||
                (playerChoice == Choice.PAPER && computerChoice == Choice.SCISSOR) ||
                (playerChoice == Choice.SCISSOR && computerChoice == Choice.ROCK);
    }

    private static boolean isPlayerTie(Choice playerChoice, Choice computerChoice) {
        return playerChoice == computerChoice;
    }
}