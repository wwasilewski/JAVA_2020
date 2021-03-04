package powtorka.tydzien5.programowanie1.listingfiles;

import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {

        ListingFilesInDirectory lf = new ListingFilesInDirectory();
        Set<String> fileList1 = lf.listFilesUsingJavaIO("C://");
        System.out.println("listing files using listFiles() from java.io: " + fileList1);

        fileList1 = lf.listFilesUsingDirectoryStream("C://");
        System.out.println("listing files using DirectoryStream: " + fileList1);

        fileList1 = lf.listFilesUsingFileslist("c://");
        System.out.println("listing files using Files.list(): " + fileList1);
    }
}
