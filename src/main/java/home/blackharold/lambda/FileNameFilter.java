package home.blackharold.lambda;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class FileNameFilter {
    static String[] names;

    public static void main(String[] args) {

        File directory = new File("./src/main/java/home/blackharold/access");

//        try first
        String[] names = fileNames(directory);
        System.out.println(Arrays.asList(names));

//        try second
        names = directory.list(((dir, name) -> name.endsWith(".java")));
        System.out.println(Arrays.asList(names));

//        try third
        names = directory.list((File dir, String name) -> name.endsWith(".java"));
        System.out.println(Arrays.asList(names));

//        try fourth
        names = directory.list((File dir, String name) -> {
            return name.endsWith(".java");
        });
        System.out.println(Arrays.asList(names));
    }

    private static String[] fileNames(File directory) {
        names = directory.list((dir, name) -> name.endsWith(".java"));
        return names;
    }


}
