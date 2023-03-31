package READFILE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) {
        try{
            File myobj=new File("testFile.txt");
            Scanner myReader =new Scanner(myobj);
           // System.out.println(myReader.hasNextLine());
          for(int i=0;i<=90;i++){
              System.out.print("=");
          }
            System.out.println();
            while(myReader.hasNextLine()) {
                String Reader = myReader.nextLine();
                System.out.println(Reader);
                System.out.println("successfully done");
            }
                myReader.close();

        }catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();

        }
    }
}
