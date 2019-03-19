import java.util.ArrayList;
import java.util.List;

public class World {

    private final List<List<Character>> world;
//    private final int numColumns;
//    private final int numRows;

    //set size of world based on input. if 2, 2, world/grid needs to be an 2 arrays in an array list,
    // with 2 indexes

    public World(){

        world = new ArrayList<>();
        // I want 2 to be the input given to make the rows of the world
        for(int i = 0; i < 2; i ++ ){
            world.add(new ArrayList<>());
        }

//


        //using x, y, determine how many arraylists need to be implemented for size
        // if World(2,2) then my world needs 2 rows and 2 columns,
        // if World(10,15), then my world needs 10 rows and 15 columns


    }

    public void setWorldSize(int x, int y){
       int row = y;
       int column = x;




    }

    public String showWorld(){
        String result = ". .\n. .";
        return result;
    }





}
