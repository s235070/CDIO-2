import java.io.UnsupportedEncodingException;

public class Languages {
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

    //To add new languages, make a new Language function and add it to the array languages, then expand Utils to include it
    static Language english = index -> {
        if (index == TOWER)
            return "Plundering the dangerous tower can earn you 250 gold coins";
        else if (index == CRATER)
            return "In pursuit of gold, you excavated a vast pit, only to watch 100 vanish, leaving you in utter despair";
        else if (index == PALACE)
            return "You trade at the camp outside the palace gates and earn 100";
        else if (index == DESERT)
            return"You have to resupply after journeying through the cold desert, lose 20";
        else if (index == WALLED_CITY)
            return "The king of the walled city commends your chivalry, earn 180";
        else if (index == MONASTERY)
            return "Your pilgrimage to the monastery does not yield a profit";
        else if (index == BLACK_CAVE)
            return "Your quest to cleanse the black cave proves costly, lose 70";
        else if (index == MOUNTAIN_HUTS)
            return "You hunt with the people of the mountains and sell your game for 60 gold coins";
        else if (index == WEREWALL)
            return "Your journey to the Werewall proves costly, but the knights protecting it send you on a quest, lose 80";
        else if (index == PIT)
            return "Your horse breaks its leg in a pit, lose 50";
        else if (index == GOLDMINE)
            return "In your journey of hardship you earn 650 gold coins!";
        else if (index == NAME_TEXT)
            return " choose which name people should remember you by ";
        else if (index == SCORE_TEXT)
            return ("Points thus far: ");
        else
            return ("ERROR: Index out of range");
    };

    static Language romanian = index -> {
        if (index == TOWER)
            try {
                return new String ("Jefuiești turnul și câștigi 250".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 2 not properly encoded";
            }
        else if (index == CRATER)
            try {
                return new String ("Sapi un crater gol căutând aur și pierzi 100".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 3 not properly encoded";
            }
        else if (index == PALACE)
            try {
                return new String ("Faci troc la tabăra dinaintea porților palatului și câștigi 100".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 4 not properly encoded";
            }
        else if (index == DESERT)
            try {
                return new String ("Trebuie să te reaprovizionezi după ce ai trecut prin deșertul rece, pierzi 20".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 5 not properly encoded";
            }
        else if (index == WALLED_CITY)
            try {
                return new String ("Regele orașului zidit îți laudă cavaleria, câștigi 180".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 6 not properly encoded";
            }
        else if (index == MONASTERY)
            try {
                return new String ("Pelerinajul tău spre mănăstire nu-ți aduce profit".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 7 not properly encoded";
            }
        else if (index == BLACK_CAVE)
            try {
                return new String ("Misiunea ta de a curăța peștera de monștri se dovedește a fi costisitoare, pierzi 70".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 8 not properly encoded";
            }
        else if (index == MOUNTAIN_HUTS)
            try {
                return new String ("Vânezi cu oamenii munților și îți vinzi prada pe 60".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 9 not properly encoded";
            }
        else if (index == WEREWALL)
            try {
                return new String ("Drumeția ta spre Vârcozid este costisitoare, dar cavalerii ce-l păzesc te trimit în misiune, pierzi 80.\nEXTRA TURĂ".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 10 not properly encoded";
            }
        else if (index == PIT)
            try {
                return new String ("Calul tău își rupe piciorul într-o groapă, pierzi 50".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 11 not properly encoded";
            }
        else if (index == GOLDMINE)
            try {
                return new String ("Găsești aur în munți și câștigi 650!".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 12 not properly encoded";
            }
        else if (index == NAME_TEXT)
            try {
                return new String (" alege un nume".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 13 not properly encoded";
            }
        else if (index == SCORE_TEXT)
            try {
                return new String ("Puncte până acum: ".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Index 14 not properly encoded";
            }
        else
            try {
                return new String ("EROARE: Indice în afara razei".getBytes("ISO-8859-16"), "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return "ERROR: Default case not properly encoded";
            }
    };

    static Language bengali = index -> {
        if (index == TOWER)
            return "Bippajjanaka kothin tower ta tomake 250 gold coins dibe";
        else if (index == CRATER)
            return "gold ta pao ar joino tumi ekta bisal garta kanana kara kintu 100 gold coins loss apanake sampurna hatasara madhye rekhe yacchi ";
        else if (index == PALACE)
            return "apani prasadera getera baire sibire byabasa karena ebam 100 uparjana karena";
        else if (index == DESERT)
            return"Thanda marubhumira madya diye yatra karara pare apanake punaraya sarabaraha karate habe, 20 harana";
        else if (index == WALLED_CITY)
            return "Pracira ghera sanarera raja apanara biratbera prasansa karena, 180 uparjana karuna";
        else if (index == MONASTERY)
            return "Mathe apanara tirthayatra labha kare na";
        else if (index == BLACK_CAVE)
            return "Kalo guha pariskara karara jonno apanara anusandhana byayabahula pramanita, 70 harana";
        else if (index == MOUNTAIN_HUTS)
            return "Apani paharera lokadera sathe sikara karena ebam 60 sbarnamudrara jonno apanare khela bikri karena";
        else if (index == WEREWALL)
            return "oyara apanare yatra byaybahula pramanita, kintu eti raksakari na itara apanake ekati anusandhane pathaya, 80 harana";
        else if (index == PIT)
            return "Apanare ghora ekati garte tara pa bhenge, 50 harana";
        else if (index == GOLDMINE)
            return "Apanare kastera yatraya apani 650 sonara kayena uparjana karena!";
        else if (index == NAME_TEXT)
            return " loke apanake kona name smarana karabe ta cayana karuna ";
        else if (index == SCORE_TEXT)
            return ("Ekhana paryanta payenta: ");
        else
            return ("Truti: suci simara ba'ire");
    };

    static Language[] languages = new Language[] {english, romanian, bengali};

    public static String getLanguage(int language, int index) {
        return languages[language].LanguageOutput(index);
    }

    public static int selectLanguage() {
        
        try {
            System.out.println(new String ("EN: English | RO: Română | BE: Bangla".getBytes("ISO-8859-16"), "ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            System.out.println("ERROR: Language select not properly encoded");
            e.printStackTrace();
        }

        var scanner = new java.util.Scanner(System.in);
        int language = 9999;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("EN") || line.equalsIgnoreCase("English")) {
                language = 0;
                break;
            } else if (line.equalsIgnoreCase("RO") || line.equalsIgnoreCase("Română") || line.equalsIgnoreCase("Romanian") || line.equalsIgnoreCase("Romana")) {
                language = 1;
                break;
            } else if (line.equalsIgnoreCase("BE") || line.equalsIgnoreCase("Bengali") || line.equalsIgnoreCase("Bangla") || line.equalsIgnoreCase("BA") || line.equalsIgnoreCase("BD") || line.equalsIgnoreCase("BN")) {
                language = 2;
                break;
            }
        }

        return language;
    }
}

@FunctionalInterface
interface Language {
    public String LanguageOutput(int index);
}