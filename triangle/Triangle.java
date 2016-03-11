
public class Triangle {
    /** side1 double type, first side */
    private double side1;
    /** side2 double type, second side */
    private double side2;
    /** side3 double type, last side */
    private double side3;
    
    /** constructor */
    public Triangle() {
      /*  this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;*/
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /** methods */
    // return true/flase if triangle is valid
    public boolean isValidTriangle() {
        double suma1 = getSide1() + getSide2();
        double suma2 = getSide2() + getSide3();
        double suma3 = getSide1() + getSide3();
        boolean isValidTriangle = false;
        
        if (suma1 > getSide3() && suma2 > getSide1() && suma3 > getSide2()) isValidTriangle = true;
        
        return isValidTriangle;
    }
    // if triangle no is valid return -1, else return size perimeter
    public double perimeter() {
        double perimetro;
        if (isValidTriangle() == true) {
            perimetro = getSide1() + getSide2() + getSide3();
        } else {
            perimetro = -1;
        }
        return perimetro;
    }
    // if triangle no is valid return -1, else return size area
    public double area() {
        double area;
        
        if (isValidTriangle() == true) {
            double s = perimeter() / 2;
            area = Math.sqrt(s*(s - getSide1()) * (s - getSide2()) * (s - getSide3()));
        } else {
            area = -1;
        }
        
        return area;
    }
    
    /** setters and getters */
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getSide3() {
        return side3;
    }
    
    /** toString */
    public String toString() {
        String longitud = "longitud del triangulo: " + getSide1() + ", " + getSide2() + ", " + getSide3();
        String area = "area: " + area();
        String perimetro = "perimetro: " + perimeter();
        
        return longitud + "\n" + area + "\n" + perimetro;
    }
}