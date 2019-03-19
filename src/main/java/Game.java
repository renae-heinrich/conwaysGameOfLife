public class Game {

    private final World world;

    public Game(){

        world = new World();
    }

    public void setWorld(int x, int y){

        world.setWorldSize(x, y);

         //user input here, need to use the input to make array of arrays to make the grid size eg 2 x 2
        // how do I use this in the world class? am I putting this in the incorrect spot?

    }

    public World getWorld(){
        return world;
    }
}
