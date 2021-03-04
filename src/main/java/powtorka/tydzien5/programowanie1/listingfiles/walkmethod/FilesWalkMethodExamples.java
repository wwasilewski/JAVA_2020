package powtorka.tydzien5.programowanie1.listingfiles.walkmethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesWalkMethodExamples {

    //using Files.walk() to list files without sub-directories
    List<String> listFilesUsingFilesWalk(String dir) throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get(dir))) {
            return stream
                    .filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toList());
        }
    }

    //using Files.walk() with depth to list files with sub-directories
    List<String> listFilesUsingFilesWalk(String dir, int depth) throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get(dir), depth)) {
            return stream
                    .filter(file -> !Files.isDirectory(file))
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toList());
        }
    }

    //using Files.walk() to list files with extension without sub-directories
    List<String> listFilesByExtensionUsingFilesWalk(String dir, String fileExtension) throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get(dir))) {
            return stream
                    .filter(Files::isRegularFile)
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .filter(s -> s.endsWith(fileExtension))
                    .collect(Collectors.toList());
        }
    }

    //using Files.walk() to list only directories
    List<String> listDirectoriesUsingFilesWalk(String dir) throws IOException {
        try (Stream<Path> stream = Files.walk(Paths.get(dir))) {
            return stream
                    .filter(Files::isDirectory)
                    .map(Path::toString)
                    .collect(Collectors.toList());
        }
    }
}
