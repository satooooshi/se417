package iloveyouboss;

public class Main {

    public static void main(String[] args){
/*
        Queprac q= new Queprac();
        q.show();

        Lexicon l=new Lexicon("dictionary.txt");

        Solution s=new Solution();
        s.findLadders("apple","elite",l.dict);
*/
        Lexicon l=new Lexicon("dictionary.txt");
        WordLadder w = new WordLadder("wound","women",l.dict);
    }
}

//givenSomeContextWhenDoingSomeBehaviorThenSomeResultOccurs
