package aop;

import java.io.PrintStream;

/**
 * Created by Michał Szewczyk on 2017-02-28.
 */
public class AspectClass {
    private PrintStream stream;

    public AspectClass(PrintStream stream) {
        this.stream = stream;
    }

    public void setStream(PrintStream stream) {
        this.stream = stream;
    }

    public void methodBefore(){
        stream.println("method before");
    }

    public void methodAfter(){
        stream.println("method after");
    }
}
