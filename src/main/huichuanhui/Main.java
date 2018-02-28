package huichuanhui;

import java.lang.String;

public class Main{
    public static void main(String[] args){
        Lexicon l=new Lexicon("dictionary.txt");
        WordLadder w=new WordLadder();
        System.out.println(w.findLadders("apple","elite",l.dict));

    }
}