package foobar.queries.addtwonumbers;

import an.awesome.pipelinr.Command;

public class AddTwoNumbersQuery implements Command<Integer> {
    public final Integer firstNumber;
    public final Integer secondNumber;
    
    public AddTwoNumbersQuery(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
}
