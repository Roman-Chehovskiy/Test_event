package employees;

import java.io.*;
import java.time.LocalDate;
import java.util.Date;

public class Woker extends Employees {
    public Woker() {
        try {
            File file = new File("Woker.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            int i = 1;
            while (line != null) {
                if (i == 1) super.name = line;
                else if (i == 2) super.date_r = LocalDate.parse(line);
                line = reader.readLine();
                i++;
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
