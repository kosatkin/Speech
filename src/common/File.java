package common;

import IOAdapter.Factory;
import IOAdapter.IInput;
import IOAdapter.IOutput;

public final class File {

    public static void writeLine(String filename, String content) throws Exception {
        IOutput adapter = Factory.output("file", filename);
        adapter.writeLine(content);
    }
    
    public static String readLine(String filename) throws Exception {
        IInput adapter = Factory.input("file", filename);
        return adapter.readLine();
    }
    
    public static void write(String filename, String line) throws Exception {
        IOutput adapter = Factory.output("file", filename);
        adapter.write(line);
    }
    

}
