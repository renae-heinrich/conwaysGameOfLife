import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {


    @Test
    public void newGameUserAbleToDefineWorldToBe2By2Grid() {
        //setup
        Game game = new Game();
        game.setWorld(2,2);
        World world = game.getWorld();

        //action
        String result = world.showWorld();

        //assert
        Assert.assertEquals(". .\n. .", result);

    }

//    @Test
//    public void newGameUserAbleToSetInitialStateOfEachCellInTheWorld() {
//        Game game = new Game();
//        game.setWorld(2,2);
//        //each grid square needs to be called a cell
//        cell(0,0).setState("alive");
//        cell(0,1).setState("dead");
//        cell(1,1).setState("dead");
//        cell(1,2).setState("alive");
//        World world = game.getWorld();
//
//        String result = world.showWorld();
//        Assert.assertEquals("alive, dead\ndead, alive", result);
//    }
}