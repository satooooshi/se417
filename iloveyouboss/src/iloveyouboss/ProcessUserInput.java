package iloveyouboss;

import java.lang.String;

public class ProcessUserInput {
    private String start;
    private String end;

    public String inputStartAs(String start){
        this.start=start.toLowerCase();
        return this.start;
    }

    public String inputEndAs(String end){
        this.end=end.toLowerCase();
        return this.end;
    }


}
