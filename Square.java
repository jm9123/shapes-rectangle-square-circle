public class Square  extends Rectangle{

    public Square(String color, int side) {
        super(color, side, side);
    }

    @Override
    public void display(){
        System.out.println("This is a " + super.color + " " + "square");
    }

    public void test(){
        System.out.println("test");
    }
}
