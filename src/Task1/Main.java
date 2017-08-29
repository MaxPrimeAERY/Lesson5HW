package Task1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * Created by Maximus on 17.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyFileFilter mFF = new MyFileFilter("pdf");
        File fileIn = new File("C:\\Users\\Maximus\\Downloads\\");
        File[] fileList = fileIn.listFiles(mFF);

        for (File file : fileList) {
            System.out.println(file);
            try {
                File fileOut = new File("C:\\Users\\Maximus\\Videos\\" + file.getName());
                FileOperation.copyFile(file, fileOut);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
