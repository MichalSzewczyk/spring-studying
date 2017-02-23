package sample;

public class Foo {
    private String[] args;

    public Foo(String... args) {
        this.args = args;
    }
}

class Bar{
    public static void main(String[] args) {
        Foo foo = new Foo();
    }
}