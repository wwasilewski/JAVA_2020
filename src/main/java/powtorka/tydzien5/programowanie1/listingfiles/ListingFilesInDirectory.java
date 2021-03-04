package powtorka.tydzien5.programowanie1.listingfiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListingFilesInDirectory {

    //using listFiles() from java.io - without sub-directories
    public Set<String> listFilesUsingJavaIO(String dir) {
        return Stream.of(new File(dir).listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .collect(Collectors.toSet());
    }


    //using DirectoryStream - without sub-directories
    public Set<String> listFilesUsingDirectoryStream(String dir) throws IOException {
        Set<String> filelist = new HashSet<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir))) {
            for (Path path : stream) {
                if (!Files.isDirectory(path)) {
                    filelist.add(path.getFileName()
                            .toString());
                }
            }
        }
        return filelist;
    }

    //using DirectoryStream with file-extension - without sub-directories
    public Set<String> listFilesUsingDirectoryStream(String dir, String fileExtension) throws IOException {
        Set<String> filelist = new HashSet<>();
        String file = "*." + fileExtension;
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir), file)) {
            for (Path path : stream) {
                if (!Files.isDirectory(path)) {
                    filelist.add(path.getFileName()
                            .toString());
                }
            }
        }
        return filelist;
    }

    //using Files.list() from Java8 nio
    public Set<String> listFilesUsingFileslist(String dir) throws IOException {
        try (Stream<Path> stream = Files.list(Paths.get(dir))) {
            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toSet());
        }
    }
}
