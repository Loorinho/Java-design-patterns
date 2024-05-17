package behavioral.state;

public class Draft extends State{

        public Draft(Document document){
            super(document); // calling the constructor of the parent class
        }
        @Override
        public void publish() {
            // in draft, this method moves the document to the moderation state
            document.setState(new Moderation(document));
        }
        @Override
        public void render() {
            System.out.println("Rendering the document in draft state");
        }
}
