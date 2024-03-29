public class Oval extends Shape{
    private double a;
    private double b;

    public Oval(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 4*(((Math.PI*a*b)+Math.pow(a-b,2))/(a+b));
    }
}
