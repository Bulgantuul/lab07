package frogger;

public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean isOccupied(int position) {
        if (position < 0 || position >= occupied.length) {
            return false;
        }
        return occupied[position];
    }
    
    public boolean isValidPosition(int position) {
        return position >= 0 && position < occupied.length;
    }
    
    public int getLength() {
        return occupied.length;
    }
}