package iloveyouboss;

import org.junit.*;
import org.junit.rules.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class ProcessUserInputTest {


    @Test(expected=EndWordsLengthDoseNotMatchException.class)
    public void WhenInputNonCharactersThenPutError() {
        ProcessUserInput p=new ProcessUserInput("Hell0","ap23__","dictionary.txt");

    }

    @Test
    public void WhenInputEnterThenOutputHaveANiceDay(){

    }

    @Test
    public void WhenInputEndWordsWithDifferentLengthThenOutputError(){
    }

}