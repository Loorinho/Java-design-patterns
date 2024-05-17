package behavioral.state;

public class Client {

    public static void main(String[] args) {
        Document document = new Document();
        document.renderDocument(); // puts the document in draft state
        document.publishDocument(); // puts the document in moderation state since it was in draft state
        document.renderDocument();
        document.publishDocument(); // puts the document in published state since it was in moderation state
        document.renderDocument();


    }
}
