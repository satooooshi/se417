package iloveyouboss;

import org.junit.*;
import java.io.FileNotFoundException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LexiconTest {


    @Test
    public void InitializeLexiconWithmNonExistFileThrowsFileNotFoundException() throws FileNotFoundException{
        Lexicon l = new Lexicon("nonexist.txt");
    }

    @Test
    public void addsNewWordToLexicon()throws FileNotFoundException {
        //arrange
        Lexicon l = new Lexicon("dictionary.txt");
        //act
        l.addNewWord("newword");
        //assert
        assertTrue(l.getDictionary().contains("newword"));
    }

}