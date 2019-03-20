public class Cell {

    private boolean alive;

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getPrintValue(){
        return alive ? "#" : ".";
    }


}
