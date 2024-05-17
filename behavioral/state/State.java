package behavioral.state;

public abstract class State {

    protected Document document;

    public State(Document document){
        this.document = document;
    }
    public abstract void publish();
    public abstract void render();
}
