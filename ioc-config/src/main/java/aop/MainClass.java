package aop;

import java.io.PrintStream;

/**
 * Created by Michał Szewczyk on 2017-02-28.
 *
 * Example of implementing aspect oriented programming using xml configuration
 */
public class MainClass {
    private PrintStream stream;

    public MainClass(PrintStream stream) {
        this.stream = stream;
    }

    public void setStream(PrintStream stream) {
        this.stream = stream;
    }

    public void method(){
        stream.println("main method");
    }
}
