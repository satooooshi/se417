package AikawaSatoshi;


import org.junit.*;
import org.junit.rules.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class ProcessUserInputTest {

    @Test
    public void setDictNameAndEndWords() {
        ProcessUserInput p=new ProcessUserInput("Code","data","dictionary.txt");
        assertEquals(p.showDictName(),"dictionary.txt");
        assertEquals(p.showStartName(),"code");
        assertEquals(p.showEndName(),"data");
    }


    @Test(expected = EndWordsLengthDoseNotMatchException.class)
    public void throwsWhenInputNonCharacters() {
        ProcessUserInput p=new ProcessUserInput("Hell0","ap23__","dictionary.txt");
    }

    @Test(expected = EndWordsLengthDoseNotMatchException.class)
    public void throwsWhenEnterThenOutputHaveANiceDay(){
        ProcessUserInput p=new ProcessUserInput("","ap23__","dictionary.txt");
    }

    @Test(expected = EndWordsLengthDoseNotMatchException.class)
    public void throwsWhenInputEndWordsWithDifferentLength(){
        ProcessUserInput p=new ProcessUserInput("Hello","gentleman","dictionary.txt");
    }

}