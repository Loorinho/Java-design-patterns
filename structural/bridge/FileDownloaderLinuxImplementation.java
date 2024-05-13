package structural.bridge;

public class FileDownloaderLinuxImplementation implements FileDownloadImplementaton{
    @Override
    public void downloadFile(String path) {
        System.out.println("Started file download on Linux");
        System.out.println("Downloading file with name " +path);
        System.out.println("Downloading file complete on Linux");
    }
}
