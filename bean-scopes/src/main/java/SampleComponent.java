/**
 * Created by Michał Szewczyk on 2017-02-16.
 */
public class SampleComponent {
    private static int instanceCounter;
    SampleComponent(){
        instanceCounter++;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }
}
