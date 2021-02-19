package foobar.queries.addtwonumbers;

import org.springframework.stereotype.Component;

import an.awesome.pipelinr.Command;

@Component
public class AddTwoNumbersQueryHandler implements Command.Handler<AddTwoNumbersQuery, Integer> {
    @Override
    public Integer handle(AddTwoNumbersQuery command) {
        return command.firstNumber + command.secondNumber;
    }
}