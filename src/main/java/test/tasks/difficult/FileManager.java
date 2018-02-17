package test.tasks.difficult;

import java.io.*;
import java.util.ArrayList;

public class FileManager {
    //check file
    private static void exists(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    public static ArrayList read(String fileName) throws FileNotFoundException{
        ArrayList<String> list = new ArrayList();

        File file = new File(fileName);
        exists(fileName);
        try {
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                //line by line reading file
                String s;
                while ((s = in.readLine()) != null) {
                    list.add(s);
                }
            } finally {
                //close file
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

        //Return the resulting text
        return list;
    }

    public static void write(String fileName, String text) {
        File file = new File(fileName);

        try {
            //check file, if file not found create it
            if(!file.exists()){
                file.createNewFile();
            }

            FileManager.read(fileName);
            FileWriter out = new FileWriter(file.getAbsoluteFile(),true);
            try {
                //write text to a file
                out.append(text+"\n");
            } finally {
                //close file
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
