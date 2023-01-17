package Event;

import Event.event.ArgumentAndReturnExample;
import Event.event.BaseExample;

public class Example {
    public static void main(String... args) throws InterruptedException {
        BaseExample.EVENT.register(() -> {
            System.out.println("Base event 0");
        });
        
        BaseExample.EVENT.register(() -> {
            System.out.println("Base event 1");
        });

        BaseExample.EVENT.invoker().interact();

        

        ArgumentAndReturnExample.EVENT.register(arg -> {
            System.out.println(arg);

            return arg;
        });
        
        ArgumentAndReturnExample.EVENT.register(arg -> {
            System.out.println(arg * arg);

            return arg * arg;
        });

        System.out.println(ArgumentAndReturnExample.EVENT.invoker().interaction(10));
    }
}
