package Event.event;

public interface ArgumentAndReturnExample {
    Event<ArgumentAndReturnExample> EVENT = new Event<>(Listeners -> arg -> {
        int sam = 0;
        
        for (ArgumentAndReturnExample Listener : Listeners) {
            sam += Listener.interaction(arg);
        }

        return sam;
    });

    int interaction(int arg);
}
