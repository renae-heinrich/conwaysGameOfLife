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

    //set future state of cell to get status on what cell state will be on next evolution





}
