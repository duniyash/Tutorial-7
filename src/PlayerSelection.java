import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PlayerSelection {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Player> player = new ArrayList<Player>();
    static String playerName;
    static String playerType;
    static String option;
    static int age;
    static double statistics;

    public static void main(String[] args) {
        while (true) {
            System.out.println("A : Add a Player\n" +
                    "E : Player Average\n" +
                    "F : GET Player Details\n" +
                    "G : GET Best Performance\n" +
                    "H : GET Player Type\n" +
                    "V : View All Players\n" +
                    "Q : QUIT");
            System.out.println("Choose Your Option : ");
            option = input.next().toUpperCase();
            if (option.equals("Q"))
                break;
            else
                checkOption(option);
        }
    }

    public static void checkOption(String option){
        switch(option){
            case "A":
                addPlayer();
                break;
            case "E":
                playerAverage();
                break;
            case "F":
                getPlayerDetails();
                break;
            case "G":
                bestPerformance();
                break;
            case "H":
                getPlayerType();
                break;
            case "V":
                viewAllPlayer();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public static void addPlayer(){
        System.out.println("ADD PLAYER\n------------------------");
        System.out.println("Enter Player's Name : ");
        playerName = input.next();
        System.out.println("Enter Player's Age : ");
        age = input.nextInt();
        System.out.println("Enter Player Type : ");
        playerType = input.next();
        System.out.println("Enter Player's Statistics (runs scored or wickets taken in the past 15 matches) : ");
        statistics = input.nextDouble();
        player.add(new Player(playerName, age, playerType, statistics));
    }

    public static void bestPerformance(){
        System.out.println( "B : Display Two best Batsman\n" +
                "C : Display Two Best Bowlers\n" +
                "D : Display Best Keeper\n");
        option = input.next().toUpperCase();
        if(option.equals("B")){
            System.out.print("The best Batsman : "+statistics);
        }
        else if(option.equals("C")){
            System.out.print("The best Bowler : "+statistics);
        }
        else if(option.equals("D")){
            System.out.print("The best Keeper : "+statistics);
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    public static void playerAverage(){
        System.out.println("Enter Player's Name : ");
        playerName = input.next();
        player.get(player.indexOf(playerName)).playerAverage();
    }

    public static void getPlayerDetails(){
        System.out.println("Enter Player's Name : ");
        playerName = input.next();
        player.get(player.indexOf(playerName)).getPlayerDetails();
    }

    public static void getPlayerType(){
        System.out.println("Enter Player's Name : ");
        playerName = input.next();
        player.get(player.indexOf(playerName)).getPlayerType();
    }

    public static void viewAllPlayer(){
        for (int x=0; x<player.size(); x++){
            player.get(x).getPlayerDetails();
            System.out.println("--------------------------------------------------------");
        }
    }

}
