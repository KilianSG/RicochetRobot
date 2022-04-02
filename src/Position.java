import java.util.HashSet;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // copy constructor
    public Position(Position that) {
        this(that.x, that.y);
    }

    /**
     * Displace the position by the specified values.
     *
     * @param xd Displacement in x-direction
     * @param yd Displacement in y-direction
     */
    public void displace(int xd, int yd) {
        x += xd;
        y += yd;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        /* TODO */
        if(this == o){
            return true;
        }
        if(o instanceof Position){
            if(this.x != ((Position) o).x || this.y != ((Position) o).y){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        /* TODO */
        int hash = 7;
        hash = hash * 31 + this.x;
        hash = hash * 31 + this.y;
        return hash;
    }
}

