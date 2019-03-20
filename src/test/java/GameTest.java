import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {


    @Test
    public void newGameUserAbleToDefineWorldToBe2By2Grid() {
        //setup
        Game game = new Game(2, 2);

        //action
        String result = game.showWorld();

        //assert
        Assert.assertEquals("..\n..\n", result);

    }

    @Test
    public void newGameGrid5x7() {
        Game game = new Game(5,7);

        String result = game.showWorld();

        Assert.assertEquals(".....\n.....\n.....\n.....\n.....\n.....\n.....\n", result);
    }

    @Test
    public void newGameSetInitialState() {
        Game game = new Game(5,5);
        Pair<Integer, Integer>[] seed = new Pair[] {
                new ImmutablePair(2, 2),
                new ImmutablePair(2, 3),
                new ImmutablePair(3, 3),
                new ImmutablePair(3, 4)
        };
        game.setInitialState(seed);

        //action
        String result = game.showWorld();

        //assert
        Assert.assertEquals(".....\n.##..\n..##.\n.....\n.....\n", result);
    }

    @Test
    public void checkCellNeighboursAndReturnHowManyNeighbouringCellsAreAlive() {
        //arrange
        Game game = new Game(5,5);
        Pair<Integer, Integer>[] seed = new Pair[]{
                new ImmutablePair(2,2),
                new ImmutablePair(2,3),
                new ImmutablePair(3,3),
                new ImmutablePair(3,4),
                new ImmutablePair(3,5)
        };
        game.setInitialState(seed);

        //act
        int result = game.checkCellNeighbours(0,0);

        //assert
        Assert.assertEquals(1,result);


    }
}