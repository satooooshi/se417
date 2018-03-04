package iloveyouboss;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class WordLadderTest {

    private Lexicon l;
    private ProcessUserInput p;
    private WordLadder w;

    //Arrange
    @Before
    public void create() {
        l=new Lexicon("dictionary.txt");
        p=new ProcessUserInput();
    }

    @Test
    public void WhenInputtedStartAndEndWordsThenGenerateWordLadder() {
        //Arrange
        String start=p.inputStartAs("code");
        String end=p.inputEndAs("data");
        l.addNewWord(start);
        l.addNewWord(end);

        //Act
        WordLadder w = new WordLadder(start,end,l.getDictionary());

        //Assert
        assertThat(Arrays.asList(w.getFoundLadder().toArray()),
                equalTo(Arrays.asList(new String[] {"code","cade","cate","date","data"})));
        assertThat(w.getFoundLadder().toArray().length, equalTo(5));
    }

    @Test
    public void WhenInputtedStartAndEndWordsThenGenerateOneOfMinimumLengthWordLadder() {

        //Arrange
        String start=p.inputStartAs("MArty");
        String end=p.inputEndAs("CurLs");
        l.addNewWord(start);
        l.addNewWord(end);

        //Act
        WordLadder w = new WordLadder(start,end,l.getDictionary());

        //Assert
        assertThat(w.getFoundLadder().toArray().length, equalTo(5));
    }




}

//givenSomeContextWhenDoingSomeBehaviorThenSomeResultOccurs
//Ex. matchAnswersFalseWhenMustMatchCriteriaNotMet