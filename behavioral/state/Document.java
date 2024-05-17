package behavioral.state;

public class Document {

        private State state;
        public Document(){
            state = new Draft(this);
        }
        public void setState(State state){
            this.state = state;
        }
        public void publishDocument(){
            state.publish();
        }
        public void renderDocument(){
            state.render();
        }
}
