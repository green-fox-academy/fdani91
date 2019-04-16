// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.*;

public class CopyFile {
    public static void main(String[] args) {
        System.out.println(copyFunction("my-file.txt", "asd/multiple-lines-2.txt"));
    }

    public static Boolean copyFunction(String copyFrom, String copyTo) {
        Path copyFilePath = Paths.get(copyFrom);
        Path pasteFilePath = Paths.get(copyTo);

        try {
            Files.copy(copyFilePath, pasteFilePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileAlreadyExistsException e) {
            return true;
        } catch (NoSuchFileException e) {
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
