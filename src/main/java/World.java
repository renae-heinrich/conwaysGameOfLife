import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<List<World>> world;

   //set size of world based on input. if 2, 2, world/grid needs to be an 2 arrays in an array list,
    // with 2 indexes

    public World(){

        world = new ArrayList<>();


    }

    public String showWorld(){
        String result = ". .\n. .";
        return result;
    }


}
