import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOExceptionFileHandling {
    public static void main(String[] args) throws IOException{
        File F=new File("jonny.txt");
        try {
            F.createNewFile();
        }
        catch (Exception D){
            System.out.println(D);
        }


        FileWriter FW=new FileWriter("jonny.txt");
        FW.write("Nittin is good boy.He is very serious about his study.\nHe want to become a police office in Himachal pradesh ");
        FW.close();

        FileReader FR=new FileReader("jonny.txt");
        Scanner Sc=new Scanner(FR);
        while (Sc.hasNextLine()){
            String S= Sc.nextLine();
            System.out.println(S);
        }

        File f=new File("jonny.txt");
        f.delete();
    }
}    
