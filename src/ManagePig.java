import java.util.ArrayList;
import java.util.List;

public class ManagePig {

    List<Pig> list = new ArrayList<>();

    public void addPig(Pig pig){
        list.add(pig);
        System.out.println("Dodano maciore");
    }

    public void displayPigs(){
        for (Pig pig: list) {
            System.out.println(pig);
        }
    }

    public void removePig(Pig pig){
        list.remove(pig);
        System.out.println("Usunięto");
    }
}
