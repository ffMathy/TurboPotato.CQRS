package foobar;

import an.awesome.pipelinr.Command;

import org.springframework.stereotype.Component;

@Component
class LoggableMiddleware implements Command.Middleware {

    @Override
    public <R, C extends Command<R>> R invoke(C command, Next<R> next) {
        // System.out.println("logging stuff.");
        return next.invoke();
    }
}