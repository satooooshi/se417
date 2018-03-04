package iloveyouboss;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class WordLadderTest {

    @Test
    public void WhenInputtedStartAndEndWordsThenGenerateOneOfMinimumLengthWordLadder() {
        //Arrange
        Lexicon l=new Lexicon("dictionary.txt");
        ProcessUserInput p=new ProcessUserInput();
        String start=p.inputStartAs("oOld");
        String end=p.inputEndAs("WarM");
        l.addNewWord(start);
        l.addNewWord(end);

        //Act
        WordLadder w = new WordLadder(start,end,l.getDictionary());

        assertArrayEquals( w.getFoundLadder(),["warm","ward","wald","wold","oold"]);
    }

}

//givenSomeContextWhenDoingSomeBehaviorThenSomeResultOccurs
//Ex. matchAnswersFalseWhenMustMatchCriteriaNotMet