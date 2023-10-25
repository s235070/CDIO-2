public class Graphics {
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

    static void showImage(int diceRoll) {
        if (diceRoll == TOWER)
            System.out.println ("__ __ __\n" +
                                "|| || ||\n" +
                                "\\      /\n" +
                                " | [] | \n" +
                                " |    | \n" +
                                " |    | \n" +
                                " |    | \n" +
                                " ______ \n");
        else if (diceRoll == CRATER)
            System.out.println ("|      |\n" +
                                "|  ##  |\n" +
                                "| #### |\n" +
                                "|######|\n" +
                                "\\######/\n" +
                                " \\####/ \n" +
                                "  \\##/  \n" +
                                "   --   \n");
        else if (diceRoll == PALACE)
            System.out.println ("H H  H H\n" +
                                "HH|>HHHH\n" +
                                "HH|HH__H\n" +
                                "H/|\\||||\n" +
                                "/ | \\|0|\n" +
                                " o|  \\||\n" +
                                " +|[€]\\|\n" +
                                " ^| [£]|\n");
        else if (diceRoll == DESERT)
            System.out.println ("     *  \n" +
                                "  * *   \n" +
                                "   *  * \n" +
                                " ___   *\n" +
                                "/***\\ __\n" +
                                "*/**\\/**\n" +
                                "********\n" +
                                "********\n");
        else if (diceRoll == WALLED_CITY)
            System.out.println ("  |>    \n" +
                                "  |  |> \n" +
                                "__|__|__\n" +
                                "HH HH HH\n" +
                                "HH/||\\HH\n" +
                                "H/||||\\H\n" +
                                "H|||o||H\n" +
                                "H||||||H\n");
        else if (diceRoll == MONASTERY)
            System.out.println (" /\\     \n" +
                                "|  |____\n" +
                                "|[]| / |\n" +
                                "|_ |_ _|\n" +
                                "HHHH\\ HH\n" +
                                "HHHH/ /H\n" +
                                "HHH/  \\H\n" +
                                "HH/   /H\n");
        else if (diceRoll == BLACK_CAVE)
            System.out.println ("##/|####\n" +
                                "#/  \\###\n" +
                                "/ * | |\\\n" +
                                "    \\/  \n" +
                                "  /     \n" +
                                " /  / * \n" +
                                "  /   / \n" +
                                "        \n");
        else if (diceRoll == MOUNTAIN_HUTS)
            System.out.println (" /|    _\n" +
                                "|  \\  / \n" +
                                " __ \\/  \n" +
                                "/()\\ \\  \n" +
                                "  __  \\ \n" +
                                " /()\\__ \n" +
                                "    /()\\\n" +
                                "        \n");
        else if (diceRoll == WEREWALL)
            System.out.println ("  ___   \n" +
                                "_/THE\\__\n" +
                                " NORTH  \n" +
                                "________\n" +
                                "WEREWALL\n" +
                                "________\n" +
                                "THE     \n" +
                                "   SOUTH\n");
        else if (diceRoll == PIT)
            System.out.println ("        \n" +
                                "_    ___\n" +
                                " \\__/   \n" +
                                " / /    \n" +
                                "| /__   \n" +
                                "\\_\\  \\  \n" +
                                " |_\\ |  \n" +
                                "_____/  \n");
        else if (diceRoll == GOLDMINE)
            System.out.println ("__|X|___\n" +
                                "  |X| | \n" +
                                "  |X| | \n" +
                                "__|X|[$]\n" +
                                "  |X|   \n" +
                                "  |X|** \n" +
                                " *|X|***\n" +
                                "**|X|***\n");
    }
}