package Event.event;

public interface BaseExample {
    Event<BaseExample> EVENT = new Event<>(Listeners -> () -> {
        for (BaseExample Listener : Listeners) {
            Listener.interact();
        }
    });

    void interact();
}
