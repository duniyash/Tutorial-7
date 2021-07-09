public class Player {
    //instance variables
    private String name;
    private int age;
    private String playerType;
    private int runs;
    private int wickets;

    //main constructor
    public Player(String name, int age, String playerType, int runs, int wickets) {
        this.setName(name);
        this.setAge(age);
        this.setPlayer_type(playerType);
        this.setRuns(runs);
        this.setWickets(wickets);
    }

    //batting average
    public double battingAvg() {
        double battingAvg = getRuns() / 15.0;
        return battingAvg;
    }

    // bowling average
    public double bowlingAvg(){
        double bowlingAvg = getWickets()/15.0;
        return bowlingAvg;
    }

    //get player details method
    public void getPlayerDetails(){
        System.out.println("Name: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("Type of player: "+ getPlayerType());
        System.out.println("No. of Wickets scored: "+ getWickets());
        System.out.println("No. of runs: "+ getRuns());
    }


    //random getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setPlayer_type(String playerType) {
        this.playerType = playerType;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getRuns() {
        return runs;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public int getWickets() {
        return wickets;
    }
}