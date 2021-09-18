import java.io.*;

public class Helper
{
    // There are different ways to achieve this. Found this one here:
    // https://stackoverflow.com/questions/4716503/reading-a-plain-text-file-in-java
    // This way is very common in College courses.
    public static String ReadFile(String path) {

        String content = null;
        File file = new File(path);
        FileReader reader = null;
        try
        {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return content;

    }
}
