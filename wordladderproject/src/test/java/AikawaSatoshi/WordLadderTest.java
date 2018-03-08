package AikawaSatoshi;




import org.junit.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;


public class WordLadderTest {

    private WordLadder w;
    private Lexicon l;

    @Before
    public void initializeWordLadderGeneratorWithValidLexicon(){
        l=new Lexicon("dictionary.txt");
    }

    //
    //WhenDoingSomeBehavior
    //WhenUserInputValidEndWord

    //
    //ThenSomeResultOccur
    @Test
    public void GeneratesLadderWhenFound(){
        w=new WordLadder("code","data",l.getDictionary());
        assertThat(w.getFoundLadder(),
                equalTo(Arrays.asList(new String[] {"data","date","cate","cade","code"})));
    }

    @Test
    public void GeneratesOneOfMinimumLengthLadderWhenFound(){
        w=new WordLadder("code","data",l.getDictionary());
        assertThat(w.getFoundLadder().size(), equalTo(5));

    }
    @Test
    public void GenerateNothingWhenNoLadderFound(){
        w=new WordLadder("enable","ladder",l.getDictionary());
        assertNull( w.getFoundLadder());

    }
}

//givenSomeContextWhenDoingSomeBehaviorThenSomeResultOccurs
//Ex. matchAnswersFalseWhenMustMatchCriteriaNotMet