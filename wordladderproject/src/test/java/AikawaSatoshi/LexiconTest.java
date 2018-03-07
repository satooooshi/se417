package AikawaSatoshi;

import org.junit.*;
import java.io.FileNotFoundException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class LexiconTest {


    @Test
    public void InitializeLexiconWithNonExistFileThrowsFileNotFoundException() throws FileNotFoundException{
        Lexicon l = new Lexicon("nonexist.txt");
    }


    @Test
    public void WhenInitialiseNewLexiconFromValidFileNameThenLexiconIsNotEmpty(){
        Lexicon l= new Lexicon("dictionary.txt");
        assertThat(l.getDictionary().isEmpty(),is(not(true)));
    }

    @Test
    public void addsEndWordsToLexicon()throws FileNotFoundException {
        //arrange
        Lexicon l = new Lexicon("dictionary.txt");
        //act
        l.addNewWord("newword");
        //assert
        assertTrue(l.getDictionary().contains("newword"));
    }

}