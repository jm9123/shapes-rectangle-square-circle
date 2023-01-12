public class Rectangle extends Shape{
    int lenght, width;

    public Rectangle(String color, int lenght, int width){
        super(color);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return this.lenght * this.width;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (this.width + this.lenght);
    }

    @Override
    public void display(){
        System.out.println("This is a " + super.color + " " + "rectangle");
    }


}
