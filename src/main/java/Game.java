import org.apache.commons.lang3.tuple.Pair;

public class Game {

    private Cell[][] world;
    private int worldWidth;
    private int worldHeight;

    public Game(int width, int height){
        this.world = new Cell[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.world[i][j] = new Cell();
            }
        }
        this.worldWidth = width;
        this.worldHeight = height;
    }

    public String showWorld(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < worldHeight; i++) {
            for (int j = 0; j < worldWidth; j++) {
                result.append(world[i][j].getPrintValue());
            }
            result.append("\n");
        }

        return result.toString();
    }

    public void setInitialState(Pair<Integer, Integer>[] seed) {
        for (int i = 0; i < seed.length; i++) {
            Pair<Integer, Integer> seedElement = seed[i];
            Cell cell = world[seedElement.getLeft() - 1][seedElement.getRight() - 1];
            cell.setAlive(true);
        }
    }

    public int checkCellNeighbours(int x, int y) {

        int numOfLiveNeighbours = 0;

        for (int row = x - 1; row <= x + 1; row++) {
            int wrappedRow = wrappedRowValue(row);
            for (int col = y - 1; col <= y + 1; col++) {
                int wrappedCol = wrappedColumnValue(col);
                if (world[wrappedRow][wrappedCol].isAlive()) {
                    numOfLiveNeighbours++;
                }
            }

        } return numOfLiveNeighbours;

    }

    private int wrappedRowValue(int rowPosition){
        if(rowPosition == -1){

            return worldHeight - 1;
        } else if(rowPosition == worldHeight + 1){
            return 0;
        }
        return rowPosition;
    }

    private int wrappedColumnValue(int colPosition){
        if(colPosition == -1){
            return worldWidth - 1;

        } else if(colPosition == worldWidth + 1){
            return 0;
        }
        return colPosition;
    }












}
