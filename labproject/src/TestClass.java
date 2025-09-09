import java.lang.Throwable;

abstract class Shape{

    abstract void area();

    abstract void perimeter();

}

interface Drawable{

    void Draw();
}






class Circle extends Shape implements Drawable{


    int radius;

    Circle(int radius){
        if(radius>0)
        this.radius=radius;
        else {
            throw new RuntimeException("NegativeDimensionException");
        }

    }

    public void Draw(){
        System.out.println("Drawing Circle");
    }

    public void area(){
        double area = Math.PI*radius*radius;
        System.out.println(area);
    }

    public void perimeter(){
        double perimeter = Math.PI*2*radius;
        System.out.println(perimeter);
    }


}

class Rectangle extends Shape implements Drawable{

    int length;
    int bredth;

    Rectangle(int length,int breadth){
        if(length>0&&breadth>0) {
            this.length = length;
            this.bredth = breadth;
        }
        else {
            throw new RuntimeException("NegativeDimensionException");
        }
    }
    public void Draw(){
        System.out.println("Drawing rectangle");
    }

    public void area(){
        double area = length*bredth;
        System.out.println(area);
    }

    public void perimeter(){
        double perimeter = 2*(length+bredth);
        System.out.println(perimeter);
    }

}
class Triangle extends Shape implements Drawable{

        int base;
        int height;


    Triangle(int base,int height){
        if(base>0&&height>0) {
            this.base = base;
            this.height = height;
        }
        else {
            throw new RuntimeException("NegativeDimensionException");
        }
    }

    public void Draw(){
        System.out.println("Drawing Triangle");
    }

    public void area(){
        double area =(float) (base*height)/2;
        System.out.println(area);
    }

    public void perimeter(){
        double perimeter =  (base+height) ;
        System.out.println(perimeter);
    }

}





public class TestClass {

    public static void main(String[] args) {
       Rectangle rect = new Rectangle(10,2);
       rect.Draw();
       rect.area();
       rect.perimeter();

        Circle circle = new Circle(10);
        circle.Draw();
        circle.area();
        circle.perimeter();

        Triangle triangle = new Triangle(30,23);
        triangle.Draw();
        triangle.area();
        triangle.perimeter();

    }
}
