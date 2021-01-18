package home.blackharold.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

    public static void fileCopy(File in, File out) throws IOException {

        byte[] buffer = new byte[1024 * 1024];
        int readByte = 0;

        try (FileInputStream fis = new FileInputStream(in); FileOutputStream fos = new FileOutputStream(out)) {
            for (; (readByte = fis.read(buffer)) > 0; ) {
                fos.write(buffer, 0, readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static long calculateFolderSize(File folder) {
        if (folder.isDirectory()) {
            long size = 0;
            File[] fileArray = folder.listFiles();
            for (File file : fileArray) {
                size += calculateFolderSize(file);
            }
            return size;
        } else {
            return folder.length();
        }
    }

    public static void main(String[] args) {
//		File in = new File("E:\\Books\\Java\\Spring4.pdf");
//		File out = new File(
//				"E:\\Development\\Git\\fibonacci\\philosophy_java\\src\\home\\blackharold\\resources\\Spring4.pdf");
//		try {
//			FileOperation.fileCopy(in, out);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		System.out.println(calculateFolderSize(
//				new File("E:\\Development\\Git\\fibonacci\\philosophy_java\\src\\home\\blackharold")));

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(
                "E:\\Development\\Git\\fibonacci\\philosophy_java\\src\\home\\blackharold\\resources\\dos.txt",
                true))) {
            dos.writeInt(2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(
                "E:\\Development\\Git\\fibonacci\\philosophy_java\\src\\home\\blackharold\\resources\\dos.txt"))) {
            int a = 0;

            while ((a = dis.readInt()) != -1) {

                System.out.println(a);
            }

        } catch (IOException e) {
            // TODO: handle exception
        }

    }
}
