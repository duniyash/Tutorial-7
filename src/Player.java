public class Player {
    private String playerName;
    private int age;
    private String playerType;
    private double statistics;

    public Player(String playerName, int age, String playerType, double statistics){
        this.playerName = playerName;
        this.age = age;
        this.playerType = playerType;
        this.statistics = statistics;
    }

    void playerAverage(){

    }

    void getPlayerDetails(){
        System.out.println("Player's Name : "+playerName);
        System.out.println("Player's Age : "+age);
        System.out.println("Player's Type : "+playerType);
    }

    void getBestPerformance(){

    }

    void getPlayerType(){
        System.out.println("Player's Type : " +playerType);
    }
}
