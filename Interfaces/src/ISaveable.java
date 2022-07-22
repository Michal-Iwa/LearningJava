import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    //always write List instead of a specific type of List, so that the clas that implements
    // the interface isn't forced to use a certain type of list
    List<String> write();
    void read(List<String> savedValues);

    //also this is possible
    //List write();
    //void read(List savedValues);
    // so that you can choose a type for a list in a class
    // in that situation you have to change the definition in the class accordingly
}
