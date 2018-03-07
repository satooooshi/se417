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
        w=new WordLadder("code","data",l.getDictionary());
    }

    //
    //WhenDoingSomeBehavior
    //WhenUserInputValidEndWord

    //
    //ThenSomeResultOccur
    @Test
    public void GeneratesLadderWhenFound(){
        assertThat(w.getFoundLadder(),
                equalTo(Arrays.asList(new String[] {"data","date","cate","cade","code"})));
    }

    @Test
    public void GeneratesOneOfMinimumLengthLadder(){
        assertThat(w.getFoundLadder().size(), equalTo(5));

    }
}

//givenSomeContextWhenDoingSomeBehaviorThenSomeResultOccurs
//Ex. matchAnswersFalseWhenMustMatchCriteriaNotMet