package structural.bridge;

public class Client {
    public static void main(String[] args) {

        // Client is only talking to this abstraction
        FileDownloaderAbstraction downloader = new FileDownloaderAbstractionImplementor(new FileDownloaderLinuxImplementation());
        downloader.download("Ziggy.txt");
    }
}
