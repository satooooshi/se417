package iloveyouboss;


import java.util.Scanner;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {

        ProcessUserInput p=new ProcessUserInput("apple","elite","dictionary.txt");
        Lexicon l=new Lexicon(p.showDictName());
        WordLadder w=new WordLadder(p.showStartName(),p.showEndtName(),l.getDictionary());
        Stack<String>ladder=(Stack<String>) w.getFoundLadder().clone();
        while(!ladder.empty()){
            System.out.println(ladder.pop());
        }
    }

}



