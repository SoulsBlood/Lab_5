import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab5 {
        public static void main(String[] args) throws IOException {
            try {
                Scanner sr = new Scanner(new File("C://Users//user//Desktop//Data.txt"));
                File fou = new File("C://Users//user//Desktop//Result.txt");
                fou.createNewFile();

                DataOutputStream wr = new DataOutputStream(new FileOutputStream(fou.getAbsolutePath()));

                while(sr.hasNextInt()){
                    int x = sr.nextInt();
                    if (x % 2 == 0) {
                        wr.writeBytes(String.format("%s ", x));
                    }
                }

                wr.flush();
                wr.close();
                sr.close();

                System.out.println("Готово");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
