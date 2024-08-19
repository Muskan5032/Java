import java.io.File;

public class Lab11_2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Lab11_2 <path>");
            return;
        }

        String path = args[0];
        File f_d = new File(path);

        if (f_d.isFile()) {
         
            System.out.println("File size: " + f_d.length() + " bytes");
        } else if (f_d.isDirectory()) {
          
            System.out.println("Listing files in directory: " + f_d.getAbsolutePath());

            File[] files = f_d.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("No files found in this directory");
            }
        } else {
            System.out.println("Not a valid file or directory");
        }
    }
}
