import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RecordKeeper {
    public static int getWins(Player player) {
        var scanner = new java.util.Scanner("record.txt");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals(player.getName())) {
                scanner.close();
                return scanner.nextInt();
            }
        }

        return 0;
    }

    public static void recordGame(Player p1, Player p2) {
        File record = new File("record.txt");
        try {
            record.createNewFile();
        } catch (IOException e) {
            System.out.println("ERROR: File not properly created");
            e.printStackTrace();
        }
        
        int length = 0;
        var scanner = new java.util.Scanner("record.text");
        while (scanner.hasNextLine()) {
            length++;
            scanner.nextLine();
        }
        var scanner2 = new java.util.Scanner("record.txt");
        String[] tempFile = new String[length];
        for (int i = 0; i < length; i++) {
            tempFile[i] = scanner2.nextLine();
        }

        for (int i = 0; i < tempFile.length; i++)
            if (tempFile[i].equals(p1.name))
                tempFile[i + 1] = Integer.toString(p1.getWins());
            else if (tempFile[i].equals(p2.name))
                tempFile[i + 1] = Integer.toString(p2.getWins());
        
        try {
            FileWriter fileWriter = new FileWriter("record.txt");
            for (int i = 0; i < tempFile.length; i++)
                fileWriter.write(tempFile[i]);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR: FileWriter not properly created");
            e.printStackTrace();
        }

        scanner.close();
        scanner2.close();
    }
}
