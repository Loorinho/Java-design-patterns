package structural.bridge;

public class FileDownloaderWindowsImplementation implements FileDownloadImplementaton{
    @Override
    public void downloadFile(String path) {
        System.out.println("Started file download on Windows");
        System.out.println("Downloading file with name " +path);
        System.out.println("Downloading file complete on Windows");
    }
}
