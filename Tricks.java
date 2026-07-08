import java.util.*;

public class Tricks {
    Scanner gn = new Scanner(System.in);
    static String name;
    static int wrongn = 0;
    static char ttt[][] = new char[3][3];
    final String xax = "255NG";

    static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("An error has occurred.");
        }
    }

    public boolean Check(int a) {
        if (a > 0 || a == 0)
            return false;
        else
            return true;
    }

    public void Firstpage() {
        System.out.println("WElCOME...");
        pause(2000);
        System.out.println("A statement will be shown. You must read it and answer accordingly.");
        pause(1000);
        System.out.println("The statement is: ");
        pause(500);
        System.out.println(
                "It is a quantity that represents how much of something is currently missing from nothing.(Hint: It is a number.)");
        pause(500);
        System.out.println("You may enter you answer...");
        int s1 = gn.nextInt();
        boolean ch = true;
        while (ch == true) {
            if (Check(s1) == true) {
                System.out.print("Correct! Proceed to the next page.");
                System.out.println("2");
                ch = false;
            } else {
                System.out.println("Wrong, try again..");
                s1 = gn.nextInt();
                wrongn++;
            }
        }
    }

    public void Secondpage() {
        pause(1000);
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("SECOND PAGE:");
        System.out.println("Here you have to perform some basic arthemtics.");
        pause(1000);
        boolean s2 = true;
        System.out.println("The problem is given below..");
        pause(2000);
        while (s2 == true) {
            int f = (int) (Math.random() * 5) + 2;
            int g = (int) (Math.random() * 100) + 8;
            int gh = (int) (Math.random() * 9999) + 50;
            int sum = g + f + gh;
            System.out.println("Find the sum of: " + g + ", " + f + " and " + gh);
            pause(1000);
            System.out.println("Enter your answer.");
            int ans = gn.nextInt();
            if (ans == sum) {
                System.out.print("Correct indeed. Proceed to next page.");
                System.out.println("5");
                s2 = false;
            } else {
                System.out.println("Wrong answer... try again");
                wrongn++;
            }
        }
    }

    public void Thirdpage() {
        pause(1000);
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("THIRD PAGE:");
        System.out.println("On this page you will have to solve a riddle.");
        pause(1000);
        System.out.println("The riddle is: ");
        System.out.println("Which word in the dictionary is spelled incorrectly?");
        pause(1000);
        System.out.println("You may enter the answer. (HINT: It is a word.)");
        String t3 = gn.next();
        boolean s3 = true;
        while (s3 == true) {
            if (t3.equalsIgnoreCase("Incorrectly")) {
                System.out.print("Correct again! Proceed to the next page.");
                System.out.println("5");
                s3 = false;
            } else {
                System.out.println("Incorrect. Try again.. Don't search it up. Be honest.");
                wrongn++;
                t3 = gn.next();
            }
        }

    }

    public static boolean Win() {
        for (int i = 0; i < 3; i++) {
            if (ttt[i][0] != '-' && ttt[i][0] == ttt[i][1] && ttt[i][1] == ttt[i][2]) {
                return true;
            }
            if (ttt[0][i] != '-' && ttt[0][i] == ttt[1][i] && ttt[1][i] == ttt[2][i]) {
                return true;
            }
        }
        if (ttt[0][0] == ttt[1][1] && ttt[1][1] == ttt[2][2] && ttt[1][1] != '-')
            return true;
        if (ttt[2][0] == ttt[1][1] && ttt[1][1] == ttt[0][2] && ttt[1][1] != '-')
            return true;
        return false;
    }

    public static char WhoWon() {
        for (int i = 0; i < 3; i++) {
            if (ttt[i][0] != '-' && ttt[i][0] == ttt[i][1] && ttt[i][1] == ttt[i][2] && ttt[i][0] == 'X') {
                return 'X';
            }
            if (ttt[0][i] != '-' && ttt[0][i] == ttt[1][i] && ttt[1][i] == ttt[2][i] && ttt[0][i] == 'X') {
                return 'X';
            }
        }
        if (ttt[0][0] == ttt[1][1] && ttt[1][1] == ttt[2][2] && ttt[1][1] != '-' && ttt[1][1] == 'X')
            return 'X';
        if (ttt[2][0] == ttt[1][1] && ttt[1][1] == ttt[0][2] && ttt[1][1] != '-' && ttt[1][1] == 'X')
            return 'X';
        for (int i = 0; i < 3; i++) {
            if (ttt[i][0] != '-' && ttt[i][0] == ttt[i][1] && ttt[i][1] == ttt[i][2] && ttt[i][0] == 'O') {
                return 'O';
            }
            if (ttt[0][i] != '-' && ttt[0][i] == ttt[1][i] && ttt[1][i] == ttt[2][i] && ttt[0][i] == 'O') {
                return 'O';
            }
        }
        if (ttt[0][0] == ttt[1][1] && ttt[1][1] == ttt[2][2] && ttt[1][1] != '-' && ttt[1][1] == 'O')
            return 'O';
        if (ttt[2][0] == ttt[1][1] && ttt[1][1] == ttt[0][2] && ttt[1][1] != '-' && ttt[1][1] == 'O')
            return 'O';
        return '\u0000';
    }

    public static boolean Check(int c1, int c2) {
        if (ttt[c1][c2] == '-')
            return false;
        else
            return true;
    }

    public void Fourthpage() {
        gn.nextLine();
        pause(1000);
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("FOURTH PAGE:");
        System.out.println("MISSION: Defeat the system at Tic-Tac-Toe");
        pause(1000);
        int temp, temp2;
        int jk = 1;
        char ch;
        int jj, ii, turn = 1;
        String move = null;
        boolean s4 = true;
        int row, col;
        for (ii = 0; ii < 3; ii++) {
            for (jj = 0; jj < 3; jj++) {
                ttt[ii][jj] = '-';
            }
        }
        pause(1000);
        System.out.println("Some things to keep in mind.");
        pause(1000);
        System.out.println("-->" + name + " makes the first move.");
        pause(1500);
        System.out.println(
                "-->You can enter the position of your mark by entering row number and column number in the following format:");
        pause(1000);
        System.out.println("FORMAT:      row number <space> column number.");
        pause(1000);
        System.out.println("Here we go.");
        while (s4 && turn <= 9) {
            for (ii = 0; ii < 3; ii++) {
                for (jj = 0; jj < 3; jj++) {
                    System.out.print(ttt[ii][jj]);
                    if (jj < 2)
                        System.out.print(" | ");
                }
                System.out.println("\n-----------");
            }
            if (turn == 10) {
                pause(2000);
                System.out.println("It is a draw. You have failed to beat the system at Tic-Tac-Toe.");
                pause(2000);
                System.out.println("Try again later but you must start from the start.");
                pause(1000);
                System.out.println("The system will terminate.");
                pause(20000);
                System.exit(0);
            }
            if (Win()) {
                System.out.println("GAME OVER.");
                ch = WhoWon();
                if (ch == 'X') {
                    pause(2000);
                    System.out.print(
                            "Congrats, you successfully beat the system at Tic-Tac-Toe. Proceed to the next page.");
                    System.out.println("N");
                }
                if (ch == 'O') {
                    System.out.println("You have failed. Try again later but you must start from the start.");
                    pause(1000);
                    System.out.println("The system will terminate.");
                    pause(20000);
                    System.exit(0);
                }
                break;
            }
            if (turn % 2 == 1) {
                System.out.println("Make your move.");
                move = gn.nextLine();
                row = Character.getNumericValue(move.charAt(0));
                col = Character.getNumericValue(move.charAt(2));
                row = row - 1;
                col = col - 1;
                if (Check(row, col)) {
                    System.out.println("Wrong input.");
                    pause(1000);
                    continue;
                }
                ttt[row][col] = 'X';
            } else {
                System.out.println("System thinking...");
                pause(2000);
                boolean moveMade = false;
                while (!moveMade) {

                    temp = (int) (Math.random() * 3);
                    temp2 = (int) (Math.random() * 3);

                    if (ttt[temp][temp2] == '-') {
                        ttt[temp][temp2] = 'O';
                        moveMade = true;
                    }
                }
            }
            turn++;
        }
    }

    public void Fifthpage() {
        pause(1000);
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("FIFTH PAGE:");
        System.out.println("In this page you will have to correctly answer a question. ");
        pause(2000);
        System.out.println("The question is: ");
        pause(1000);
        System.out.println("What is the name of the developer of Java?");
        String s5 = gn.nextLine();
        pause(3000);
        if (s5.equalsIgnoreCase("James Gosling") || s5.equalsIgnoreCase("James") || s5.equalsIgnoreCase("Gosling")) {
            System.out.print("Correct! You may proceed to the next page.");
            System.out.println("G");
        } else {
            System.out.println("Wrong answer. Quite disappointing. Start from the beginning and try again.");
            pause(2000);
            System.out.println("The system will terminate.");
            pause(1000);
            System.out.println("G.N.");
            pause(20000);
            System.exit(0);
        }
    }

    public void Sixthpage() {
        pause(1000);
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("SIXTH PAGE:");
        pause(2000);
        System.out.println("In this page, you have to enter the next letter in a sequence.");
        pause(2000);
        System.out.println("The Sequence is: \'O',\'T',\'T',\'F',\'F',\'S',\'S',\'E'...");
        pause(1000);
        System.out.println("Remember it is a character i.e. a single letter.");
        char a6 = gn.next().charAt(0);
        pause(2000);
        if (a6 == 'N' || a6 == 'n') {
            System.out.println("Correct indeed. Proceed to the next page.");
        } else {
            System.out.println("Incorrect. Quite disheartening. Start from the beginning and try again.");
            pause(2000);
            System.out.println("The system will terminate.");
            pause(1000);
            System.out.println("G.N.");
            pause(20000);
            System.exit(0);
        }

    }

    public void SeventhPage() {
        pause(1000);
        System.out.println(
                "-----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("SEVENTH PAGE:");
        pause(2000);
        System.out.println(
                "In this page, you will have to enter a code that has been disclosed somewhere in this program.");
        pause(2000);
        System.out.println("HINT: It is alphanumeric.");
        pause(200);
        System.out.println("You may enter the code now... if you have found it");
        String ans7 = gn.next();
        if (ans7.equals(xax)) {
            pause(2000);
            System.out.println("Correct. You have proven to be quite observant.");
            pause(2000);
            System.out.println("Congrats... you have successfully solved all the puzzles.");
            pause(2000);
            System.out.println("This is the end. Thank you. - G.N.");
        } else {
            pause(2000);
            System.out.println("Wrong... quite pathetic.");
            pause(2000);
            System.out.println("The system will terminate.");
            pause(1000);
            System.out.println("G.N.");
            pause(20000);
            System.exit(0);
        }

    }

    public static void main(String args[]) {
        Scanner nn = new Scanner(System.in);
        System.out.println("\"\\u001B[1mWelcome to the Seven Gates.\\u001B[0m");
        pause(3000);
        System.out.println("Enter your name to proceed:");
        name = nn.nextLine();
        pause(1000);
        Tricks obj_tricks = new Tricks();
        obj_tricks.Firstpage();
        obj_tricks.Secondpage();
        obj_tricks.Thirdpage();
        obj_tricks.Fourthpage();
        obj_tricks.Fifthpage();
        obj_tricks.Sixthpage();
        obj_tricks.SeventhPage();
        nn.close();
    }
}
