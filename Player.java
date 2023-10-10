public class Player {
    String name;
    Account account;
    int wins;

    public Player(String name) {
        this.name = name;
        this.account = new Account();
        this.wins = RecordKeeper.getWins(this);
    }

    public String getName() {
        return this.name;
    }

    public int getWins() {
        return this.wins;
    }

    public int getCash() {
        return this.account.getCash();
    }

    public String toString() {
        return this.name + "'s current funds: " + this.getCash() + ".";
    }

    public String toStringFull() {
        return this.name + "'s current funds: " + this.getCash() + ". Number of wins: " + this.wins;
    }

    public void wins() {
        this.wins += 1;
        System.out.println(this.name + " wins!");
        System.out.println("Total wins: " + this.wins);
    }

    public boolean addCash(int diceRoll) {
        switch(diceRoll) {
            case 2:
                return this.account.addCash(250);
            case 3:
                return this.account.addCash(-100);
            case 4:
                return this.account.addCash(100);
            case 5:
                return this.account.addCash(-20);
            case 6:
                return this.account.addCash(180);
            case 8:
                return this.account.addCash(-70);
            case 9:
                return this.account.addCash(60);
            case 10:
                return this.account.addCash(-80);
            case 11:
                return this.account.addCash(-50);
            case 12:
                return this.account.addCash(650);
            default:
                return true;
        }
    }
}
