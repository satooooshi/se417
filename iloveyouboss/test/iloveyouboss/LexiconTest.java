package iloveyouboss;

import org.junit.*;
import java.io.FileNotFoundException;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class LexiconTest {


    @Test
    public void createLexiconFromNonExistFileThrowsFileNotFoundException() throws FileNotFoundException{
        Lexicon l = new Lexicon("nonexist.txt");
    }

    @Test
    public void addNewWordToLexicon()throws FileNotFoundException {
        //arrange
        Lexicon l = new Lexicon("dictionary.txt");
        //act
        l.addNewWord("newword");
        //assert
        assertTrue(l.getDictionary().contains("newword"));
    }

}