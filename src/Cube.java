public class Cube {
    private int side;

    //No-argument constructor that sets side = 1
    public Cube(){
        this.side = 1;
    }

    public Cube(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int calculateSurfaceArea(){
        return 6 * side * side;
    }

    public int calculateVolume() {
        return side * side * side;
    }

    public String ToString() {
        return "Cube{side=" + side + "}";
    }
}
