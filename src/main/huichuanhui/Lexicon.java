package huichuanhui;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.Queue;

public class Lexicon {

    Set<String> dict = new HashSet<>();
    String start;
    String end;

    public Lexicon(String filename, String start, String end){
        try{
            File file = new File(filename);
            BufferedReader br = new BufferedReader(new FileReader(file));

            String str = br.readLine();
            dict.add(str);
            while(str != null){
                //System.out.println(str);
                str = br.readLine();
                dict.add(str);
            }

            System.out.println("Success!");

            br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }

    public boolean findNextWord(){return false;}


}
