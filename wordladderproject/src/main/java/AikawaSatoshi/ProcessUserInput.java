package AikawaSatoshi;

import java.io.*;
import java.lang.String;
import java.util.Scanner;


class EndWordsLengthDoseNotMatchException extends RuntimeException {
    public EndWordsLengthDoseNotMatchException(String message) {
        super(message);
    }

}

public class ProcessUserInput {

    private String dictName;
    private String start;
    private String end;



    public ProcessUserInput(String start, String end, String dictName) {

        //try {
            //Scanner reader = new Scanner(System.in);  // Reading from System.in

            //System.out.println("Dictionary file name? ");
            //word = reader.nextLine();

            this.start=toLower(start);
            this.end=toLower(end);
            this.dictName=dictName;

            legitimateWord();

    }

    public String toLower(String word){
        if(!word.isEmpty())
            return word.toLowerCase();
        else
            return word;
    }

    public String showDictName(){
        return this.dictName;
    }
    public String showStartName(){
        return this.start;
    }
    public String showEndName(){
        return this.end;
    }


    public void legitimateWord(){


            if (this.start.isEmpty() || this.end.isEmpty() || this.dictName.isEmpty()) {
                throw new  EndWordsLengthDoseNotMatchException("Have a Nice day.");
            }

            if (this.start.length() != this.end.length()) {
                throw new  EndWordsLengthDoseNotMatchException("Have a Nice day.");
            }
            char[] temp = this.start.toCharArray();
            for (int i = 0; i < temp.length; ++i) {
                if (!(temp[i] >= 'a' && temp[i] <= 'z')) {
                    throw new  EndWordsLengthDoseNotMatchException("Have a Nice day.");
                }
            }

    }



}