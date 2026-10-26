import java.util.Random;
import java.util.Scanner;

public class Main {
    //Random Class
    Random random = new Random();
    //Scanner Class
    static Scanner scanner = new Scanner(System.in);

    //Main Start
    public static void main(String[] args) {
        titleScreen();
        start();
        introMainEntryRoom();
        mainEntryRoomChoice();
    }

    //Title
    public static void titleScreen() {
        System.out.print(Colors.YELLOW + "✦⋆⭒˚.⋆✧✦⋆⭒˚.⋆✧✦⋆⭒˚.⋆✧✦⋆⭒˚.⋆✧✦⋆⭒˚.⋆✧\n" + Colors.RESET);
        System.out.print("Welcome to DJ Khatled!!!\n");
        System.out.print(Colors.YELLOW + "✦⋆⭒˚.⋆✧✦⋆⭒˚.⋆✧✦⋆⭒˚.⋆✧✦⋆⭒˚.⋆✧✦⋆⭒˚.⋆✧\n" + Colors.RESET);
        String screen =
                "";

        //ScreenPrint
        System.out.println(screen);

        //Start Game
        System.out.println(Colors.GREEN + "Would you like to start the game?" + Colors.RESET);
    }

    //Start
    public static void start() {
        //Answer Choice
        System.out.println("(1) Yes (2) No ");
        int answer = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + answer + "\n" + Colors.RESET);

        //Game Start or End
        if (answer == 1) {
            System.out.println(Colors.GREEN + "Game starting!" + Colors.RESET);
            introMainEntryRoom();


        } else if (answer == 2) {
            System.out.println("\nGame ending!");
            System.out.println("You have decided to quit the game!\n");
            System.out.println(Colors.BRIGHT_PINK + "Goodbye Kitty! Thank you for playing =^ ^=. \n" + Colors.RESET);
            System.exit(0);

        } else {
            System.out.println(Colors.RED + "Invalid choice.\n" + Colors.RESET);
            start();
        }
    }

    //IntroMainEntryRoom
    public static void introMainEntryRoom() {
        System.out.println(Colors.YELLOW + "Main Entry Room:" + Colors.RESET);
        System.out.println("\nYou have entered the " + Colors.YELLOW + "____" + Colors.RESET + "club.");
        System.out.println(Colors.YELLOW + "\nTime to get to WORK! =^ ^=" + Colors.RESET);
        System.out.println("This area is huge and full of people dancing!");
        System.out.println("Theres a bar, bathroom, booth, jukebox and a dancing area.");
        System.out.println(Colors.GREEN + "Where would you like to go?" + Colors.RESET);
        mainEntryRoomChoice();

    }

    //PlayedMainEntryRoom
    public static void mainEntryRoom() {
        System.out.println(Colors.YELLOW + "Main Entry Room:" + Colors.RESET);
        System.out.println("\nYou have entered the " + Colors.YELLOW + "____" + Colors.RESET + "main room.\n");
        System.out.println("This area is huge and full of people dancing!");
        System.out.println("Theres a bar, bathroom, booth, jukebox and a dancing area.");
        System.out.println(Colors.GREEN + "\nWhat would you like to do now?" + Colors.RESET);
        mainEntryRoomChoice();
    }

    //MainEntryRoomChoice
    public static void mainEntryRoomChoice() {
        System.out.println("(1) Bar (2) Bathroom (3) Booth (4) JukeBox (5) Dance! (6) Exit");
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1) {
            bar();

        } else if (choice == 2) {
            bathroom();

        } else if (choice == 3) {
            booth();

        } else if (choice == 4) {
            jukeBox();

        } else if (choice == 5) {
            floorDance();

        } else if (choice == 6) {
            System.exit(0);

        }
    }
    //Bar
    public static void bar() {
        System.out.println(Colors.YELLOW + "Bar:" + Colors.RESET);
        System.out.println("You have sat down at the " + Colors.YELLOW + "bar" + Colors.RESET + ".");
        System.out.println("You see a giant cow looking at you.");
        System.out.println(Colors.GREEN + "What would you like to do?" + Colors.RESET);
        barChoices();
    }

    //Bar Choices
    public static void barChoices() {
        System.out.println("(1) Talk to the cow (2) Ask for a drink (3) Exit");
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1 ) {
            cowTalk();

        } else if (choice == 2 ) {
            drink();

        } else if (choice == 3 ) {
            System.out.println(Colors.GREEN + "You have exited bar." + Colors.RESET);
            mainEntryRoomChoice();
        }

    }

    //CowTalk
    public static void cowTalk() {
        System.out.println(Colors.BLUE + "Howdy partner would you like to play a game of" + Colors.YELLOW + " Rock, Paper, Scissors" + Colors.RESET + "?" + Colors.RESET);
        cowTalkOptions();
    }

    //CowTalkOptions
    public static void cowTalkOptions() {
        System.out.println("(1) Yes (2) No ");
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1) {
            game();

        } else if (choice == 2) {
            barChoices();

        }
    }

    //RockPaperScissors Game
    //Equals/Hashcode
    public static void game() {
        System.out.println(Colors.YELLOW + "Rock, Paper, Scissors Game:" + Colors.RESET);

    }

    //Drink
    public static void drink() {
        System.out.println(Colors.BLUE + "Coming right up partner!" + Colors.RESET);
        System.out.println("The cow pulls out the finest jug in the world and pours you a glass.");
        drinkOptions();

    }

    //DrinkOptions
    public static void drinkOptions() {
        System.out.println("(1) Drink (2) Exit");
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1) {
            System.out.println("You take one big gulp!");
            System.out.println(Colors.BRIGHT_PINK + "Ahhh~" + Colors.YELLOW + "Thats some good stuff!" + Colors.RESET);
            drinkOptions();

        } else if (choice == 2) {
            System.out.println(Colors.GREEN + "You get up and leave the bar." + Colors.RESET);
            mainEntryRoom();
        }

    }

    //Bathroom
    public static void bathroom() {
        System.out.println(Colors.YELLOW + "Bathroom:" + Colors.RESET);
        System.out.println("You have entered the bathroom...");
        System.out.println("Its a little dim in here but you can still see sinks and stalls.");
        System.out.println(Colors.GREEN + "What would you like to do?" + Colors.RESET);
        bathroomChoices();
    }

    //Bathroom Choices
    public static void bathroomChoices() {
        System.out.println("(1) Wash hands (2) Use bathroom (3) Exit");
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1) {
            washHands();

        } else if (choice == 2) {
            toilet();

        } else if (choice == 3) {
            mainEntryRoom();

        }
    }

    //Wash Hands
    public static void washHands() {
        System.out.println(Colors.GREEN + "You wash your hands." + Colors.RESET);
        System.out.println(Colors.BRIGHT_PINK + "You are now a clean kitty =^ ^=!" + Colors.RESET);
        System.out.println(Colors.GREEN + "What would you like to do now?" + Colors.RESET);
        washHandsChoices();
    }

    //Wash Hands Choices
    public static void washHandsChoices() {
        System.out.println("(1) Again! (2) Exit");
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1) {
            washHands();

        } else if (choice == 2) {
            bathroom();

        }
    }

    //Toilet
    public static void toilet() {
        System.out.println("You stare at the big marble throne.");
        System.out.println(Colors.GREEN + "What would you like to do?" + Colors.RESET);
        toiletChoices();
    }

    //Toilet Choices
    public static void toiletChoices() {
        System.out.println("(1) Use toilet (2) Flush toilet (3) Exit");
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1) {
            useToilet();

        } else if (choice == 2) {
            flushToilet();

        } else if (choice == 3) {
            System.out.println( Colors.GREEN + "You have exited stall." + Colors.RESET);
            bathroom();
        }
    }

    //Use Toilet
    public static void useToilet() {
        System.out.println(Colors.GREEN + "You climb onto the toilet seat..." + Colors.RESET);
        System.out.println(Colors.BRIGHT_PINK + "Oh no..." + Colors.GREEN + "You start to wobble around!" + Colors.RESET);
        System.out.println(Colors.RED + "YOU FALL IN!!!" + Colors.RESET);
        System.out.println(Colors.RED + "You hear the toilet make a woosh..." + Colors.RESET);
        System.out.println(Colors.BLACK + "GAME OVER" + Colors.RESET);
        System.out.println(Colors.RED + "You have been flushed away..." + Colors.RESET);
        String flushedAway =

                "       .__   .--_"  +
                "       (ol l|    |" +
                "         l l|    |" +
                "          _.---:_ " +
                "         ( -__-  /" +
                "           '-.-'/ " +
                "           |     |" +
                "            ----- "
                ;

        System.out.println(flushedAway);
        System.exit(1);

    }

    //Flush Toilet
    public static void flushToilet() {
        System.out.println(Colors.GREEN + "You look at the big " + Colors.YELLOW + "shiny button..." + Colors.RESET);
        System.out.println(Colors.GREEN + "You place your paw on it and it makes a big " + Colors.YELLOW + "WOOOOOSH!!!" + Colors.RESET );
        System.out.println(Colors.BRIGHT_PINK + "You feel joy in doing this..." + Colors.RESET);
        System.out.println(Colors.GREEN + "Would you like to flush again?" + Colors.RESET);
        flushToiletChoices();

    }

    //Flush Toilet Choices
    public static void flushToiletChoices() {
        System.out.println("(1) Yes (2) No");
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1) {
            flushToilet();

        } else if (choice == 2) {
            toiletChoices();
        }
    }

    //Booth
    public static void booth() {
        System.out.println(Colors.YELLOW + "Booth:" + Colors.RESET);
        System.out.println(Colors.GREEN + "You have entered the booth." + Colors.RESET);
        System.out.println("Time to " + Colors.YELLOW + "SHINE!!!" + Colors.RESET);
        String boothDesign = "\"                                └(=^‥^=)┐ " +
                "⠀⠀⠀⠀⠀⠀⠀⣀⠤⠐⠂⠈⠉⠉⠉⠁⠐⠂⠤⣀⠀⠀⠀⠀⠀⠀⠀  " +
                "⠀⠀⠀⠀⢀⠔⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠢⡀⠀⠀⠀⠀  " +
                "⠀⠀⢀⡔⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⡀⠀⠀  " +
                "⠀⢀⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⡄⠀  " +
                "⢀⠎⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⡄  " +
                "⠸⠀⠀⠀⠀⠀⠀⠀⠀⣠⠟⠁⣀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡡  " +
                "⡇⠀⠀⠀⠀⠀⠀⠀⢰⠇⢀⠎⠀⠀⠀⠑⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⸸  "+
                "⡇⠀⠀⠀⠀⠀⠀⠀⢸⡀⠘⡀⠀⠀⠀⢀⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀  "+
                "⢃⠀⠀⠀⠀⠀⠀⠀⠈⢷⠀⠘⠢⠤⠔⠋⠀⡰⠁⠀⠀⠀⠀⠀⠀⠀⠰  "+
                "⠘⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠈⠀⠀⠀⠀⠀⠀⠀⠀⢀⠇  "+
                "⠀⠱⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠌⠀  "+
                "⠀⠀⠐⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠊⠀⠀  "+
                "⠀⠀⠀⠀⠑⢄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠔⠁⠀⠀⠀  "+
                "⠀⠀⠀⠀⠀⠀⠑⠂⠀⡀⠀⠀⠀⠀⠀⠀⠀⣀⡠⠔⠈⠀⠀⠀⠀⠀⠀  "+
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠁⠀⠀⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ";

        System.out.println(boothDesign);
        boothChoices();
    }

    //Booth Choices
    public static void boothChoices() {
        System.out.println(Colors.GREEN + "(1) Yes (2) Exit " + Colors.RESET);
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1) {
            dj();

        } else if (choice == 2) {
            mainEntryRoom();

        }
    }

    //DJ
    public static void dj() {
        System.out.println("");

    }

    //JukeBox
    //Binary Heap
    //Hash Table
    //Binary Search tree
    public static void jukeBox() {
        System.out.println(Colors.YELLOW + "JukeBox:" + Colors.RESET);

    }

    //DanceFloor
    public static void floorDance() {
        System.out.println(Colors.YELLOW + "Dance Floor:" + Colors.RESET);
        System.out.println("It's very loud and there's so many people around!");
        System.out.println(Colors.GREEN + "What would you like to do?" + Colors.RESET);
        floorDanceChoice();
    }

    public static void floorDanceChoice() {
        System.out.print("(1) Dance (2) Exit");
        int choice = scanner.nextInt();
        System.out.println(Colors.GREEN + "You chose " + choice + "\n" + Colors.RESET);

        if (choice == 1) {
            System.out.print(Colors.GREEN + "You start dancing!!!" + Colors.RESET);
            String dance = "(_＼ヽ" +
                    "　 ＼＼ .Λ＿Λ." +
                    "　　 ＼(　ˇωˇ)" +
                    "　　　 >　⌒ヽ " +
                    "　　　/ 　 へ＼ " +
                    "　　 /　　/　＼＼ " +
                    "　　 ﾚ　ノ　　 ヽ_つ " +
                    "　　/　/ " +
                    "　 /　/| " +
                    "　(　(ヽ " +
                    "　|　|、＼ " +
                    "　| 丿 ＼ ⌒) " +
                    "　| |　　) / " +
                    "`ノ ) 　 Lﾉ " +
                    "(_／” ";
            System.out.println(dance);
            floorDance();

        } else if (choice == 2) {
            mainEntryRoom();
        }
    }
}