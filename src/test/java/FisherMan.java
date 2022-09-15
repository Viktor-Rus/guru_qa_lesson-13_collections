import java.util.HashSet;
import java.util.Set;

public class FisherMan {
    private String name;
    private int age;
    private Set<String> wobblers = new HashSet<>();

    public FisherMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addWobblers(String wobbler) {
        wobblers.add(wobbler);
    }

    public void deleteCastmaster() {
        for (String wobbler : wobblers) {
            if(wobbler.equals("castmaster")) {
                this.wobblers.remove(wobbler);
            }
        }
    }


}
