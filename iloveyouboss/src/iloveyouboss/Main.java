package iloveyouboss;


public class Main {

    public static void main(String[] args){

        //Arrange
        Lexicon l=new Lexicon("dictionary.txt");
        ProcessUserInput p=new ProcessUserInput();
        String start=p.inputStartAs("MArty");
        String end=p.inputEndAs("curLs");
        l.addNewWord(start);
        l.addNewWord(end);

        //Act
        WordLadder w = new WordLadder(start,end,l.getDictionary());

        System.out.println(w.getFoundLadder().size());
    }
}


