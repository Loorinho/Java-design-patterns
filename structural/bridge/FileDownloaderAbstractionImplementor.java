package structural.bridge;

public class FileDownloaderAbstractionImplementor implements FileDownloaderAbstraction{

    private FileDownloadImplementaton implementor = null;

    FileDownloaderAbstractionImplementor(FileDownloadImplementaton imp){
        this.implementor = imp;
    }
    @Override
    public void download(String path) {
        implementor.downloadFile(path);
    }
}
