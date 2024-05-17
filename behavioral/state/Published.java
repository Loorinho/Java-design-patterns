package behavioral.state;

public class Published extends State{
            public Published(Document document){
                super(document); // calling the constructor of the parent class
            }
            @Override
            public void publish() {
                System.out.println("Document is already published");
            }
            @Override
            public void render() {
                System.out.println("Rendering the document in published state");
            }
}
