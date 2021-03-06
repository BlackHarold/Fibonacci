package home.blackharold.thread;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileWatcher implements Runnable {

    private File mainFolder;

    public FileWatcher(File mainFolder) {
        super();
        this.mainFolder = mainFolder;
    }

    public FileWatcher() {
        super();
    }

    public File getMainFolder() {
        return mainFolder;
    }

    private String getFolderInt() {
        if (mainFolder == null) {
            return "None!";
        }
        StringBuilder sb = new StringBuilder();
        File[] fileArray = this.mainFolder.listFiles();
        for (File file : fileArray) {
            sb.append(file.getName() + "\t" + file.length()).append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy hh:mm:ss");
        for (; !t.isInterrupted(); ) {
            System.out.println(sdf.format(System.currentTimeMillis()));
            System.out.println(getFolderInt());
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("File watcher is stop!");
    }

}
