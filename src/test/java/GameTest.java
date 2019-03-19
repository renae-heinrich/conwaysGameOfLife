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
}