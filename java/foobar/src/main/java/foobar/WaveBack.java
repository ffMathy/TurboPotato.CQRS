package foobar;

import org.springframework.stereotype.Component;

import an.awesome.pipelinr.Command;

@Component
class WaveBack implements Command.Handler<Wave, String> {
    @Override
    public String handle(Wave command) {
        return null;
    }
}