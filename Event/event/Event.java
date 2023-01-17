package Event.event;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Event <T> {
    List<T> Listeners = new ArrayList<>();

    T invoker;

    public T invoker() {
        return invoker;
    }

    public Event(Function<List<T>, T> invokerFactory) {
        invoker = invokerFactory.apply(Listeners);
    }

    public void register(T listener) {
        Listeners.add(listener);
    }
}
