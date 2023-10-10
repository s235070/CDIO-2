public class DiceGame {
    static int TOWER = 2;
    static int CRATER = 3;
    static int PALACE = 4;
    static int DESERT = 5;
    static int WALLED_CITY = 6;
    static int MONASTERY = 7;
    static int BLACK_CAVE = 8;
    static int MOUNTAIN_HUTS = 9;
    static int WEREWALL = 10;
    static int PIT = 11;
    static int GOLDMINE = 12;
    static int NAME_TEXT = 13;
    static int SCORE_TEXT = 14;

    public static void main (String[] args) {
        boolean extra = false;
        int language = Languages.selectLanguage();

        System.out.println("P1" + Languages.getLanguage(language, NAME_TEXT));
        var scanner = new java.util.Scanner(System.in);
        Player p1 = new Player(scanner.nextLine());
        System.out.println("P2" + Languages.getLanguage(language, NAME_TEXT));
        Player p2 = new Player(scanner.nextLine());
        
        while(true) {
            System.out.println(p1.getName() + ": ");
            do {
                extra = false;
                int diceRoll = Dice.rollDice();
                //System.out.println("Diceroll: " + diceRoll); //Debug line
                System.out.println(Languages.getLanguage(language, diceRoll));
                if (diceRoll == WEREWALL)
                    extra = true;
                    scanner.nextLine();
                if(!p1.addCash(diceRoll)) {
                    System.out.println(Languages.getLanguage(language, SCORE_TEXT) + p1.getCash());
                    p1.wins();
                    RecordKeeper.recordGame(p1, p2);
                    scanner.close();
                    return;
                }         
                System.out.println(Languages.getLanguage(language, SCORE_TEXT) + p1.getCash());   
            } while (extra);

            System.out.println(p2.getName() + ": ");
            do {
                extra = false;
                int diceRoll = Dice.rollDice();
                //System.out.println("Diceroll: " + diceRoll); //Debug line
                System.out.println(Languages.getLanguage(language, diceRoll));
                if (diceRoll == WEREWALL)
                    extra = true;
                    scanner.nextLine();
                if(!p2.addCash(diceRoll)) {
                    System.out.println(Languages.getLanguage(language, SCORE_TEXT) + p2.getCash());
                    p2.wins();
                    RecordKeeper.recordGame(p1, p2);
                    scanner.close();
                    return;
                }
                System.out.println(Languages.getLanguage(language, SCORE_TEXT) + p2.getCash());            
            } while (extra);
        }
    }
}