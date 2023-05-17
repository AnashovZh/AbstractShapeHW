import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /**public abstract double getPerimeter()
        деген абстракт методун  Shape деген класска кошунуз.
         Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту
         ишке ашырыныз.Добавьте абстрактный метод public abstract
         double getPerimeter() в класс Shape.
         Реализуйте этот метод в 5 классах наследниках класса Shape.
         Circle – круг
         Oval – овал
         Triangle – треугольник
         Square – квадрат
         Trapezium – трапеция
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Square perimeter: ");
        double a=scanner.nextDouble();

        Square square=new Square(a);
        System.out.print("Square perimeter= ");
        System.out.println(square.getPerimeter());
        System.out.println("Oval perimeter: ");
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();

        System.out.print("Oval perimeter= ");
        Oval oval=new Oval(b,c);
        System.out.println(oval.getPerimeter());
        System.out.println("Triangle perimeter: ");
        double a1=scanner.nextDouble();
        double b1=scanner.nextDouble();
        double c1=scanner.nextDouble();
        Triangle triangle=new Triangle(a1,b1,c1);
        System.out.print("Triangle perimeter= ");
        System.out.println(triangle.getPerimeter());
        System.out.println("Circle perimeter: ");
        double c2=scanner.nextDouble();
        Circle circle=new Circle(c2);
        System.out.println("Circle perimeter= ");
        System.out.println(circle.getPerimeter());
        System.out.println("Trapezium perimeter: ");
        double aa= scanner.nextDouble();
        double ab= scanner.nextDouble();
        double ac= scanner.nextDouble();
        double ad= scanner.nextDouble();
        Trapezium trapezium=new Trapezium(aa,ab,ac,ad);
        System.out.println("Trapezium perimeter= ");
        System.out.println(trapezium.getPerimeter());


    }
}