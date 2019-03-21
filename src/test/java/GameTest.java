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
                new ImmutablePair(3, 2),
                new ImmutablePair(3, 3),
                new ImmutablePair(4, 3)
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
                new ImmutablePair(3,2)

        };

        game.setInitialState(seed);

        //act
        int result = game.checkCellNeighbours(1,1);


        //assert
        Assert.assertEquals(1, result);

    }

    @Test
    public void checkCellNeighboursThatWrapToOtherSideOfGrid() {
        Game game = new Game(5,5);
        Pair<Integer,Integer>[] seed = new Pair[]{
                new ImmutablePair(2,2),
                new ImmutablePair(3,2),
                new ImmutablePair(3,3),
                new ImmutablePair(4,3),
                new ImmutablePair(5,3)
        };

        game.setInitialState(seed);

        int result = game.checkCellNeighbours(1,3);
        int result2 = game.checkCellNeighbours(3,1);
        int result3 = game.checkCellNeighbours(4,3);

        Assert.assertEquals(2, result);
        Assert.assertEquals(2, result2);
        Assert.assertEquals(3, result3);


    }

    @Test
    public void checkingWrappedFunctionalityUsingSmall4x5Grid() {
        Game game = new Game(4, 6);

        int result3 = game.checkCellNeighbours(1,6);


        Assert.assertEquals(0, result3);
    }


}