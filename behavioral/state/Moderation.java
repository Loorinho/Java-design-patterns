package behavioral.state;

public class Moderation extends State{
            public Moderation(Document document){
                super(document); // calling the constructor of the parent class
            }
            @Override
            public void publish() {
                document.setState(new Published(document));
            }
            @Override
            public void render() {
                System.out.println("Rendering the document in moderation state");
            }
}
