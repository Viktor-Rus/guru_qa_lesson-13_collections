
import java.util.ArrayList;
import java.util.List;

public class VoleyballMan {
    private String name;
    private int height;
    private String position;
    private List<String> sneakers = new ArrayList<>();


    public VoleyballMan(String name, int height, String position, List<String> sneakers) {
        this.name = name;
        this.height = height;
        this.position = position;
        this.sneakers = sneakers;
    }


    public void addSneaker(String sneaker) {
        this.sneakers.add(sneaker);
    }

    public int getCountFirmSneaker(String firm){
        int count  = 0;
        for (String sneaker : sneakers) {
            if(sneaker.equals(firm)) count++;
        }

        return count;
    }
}



