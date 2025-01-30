//Create a class Shape with a method area(). Create two subclasses Circle and Rectangle that override the area() method to calculate and print the area of the respective shapes.
class shape {
   public double pi=3.14;
   public int l;
   public int b;
    public void area(){
        System.out.println("Area of shapes");
    }
}
    class Circle extends shape{
          private double radius;
          private double pi=3.14;
         public Circle(double radius){
             this.radius=radius;
         } 
         @Override 
          public void area(){
             double result=pi*radius*radius;
             System.out.println("Area of radius:"+result);
         }
        
    }
    class Rectangle extends shape{
       private int l;
       private int b;
       public Rectangle(int l, int b){
           this.l=l;
           this.b=b;
       }
       @Override 
       public void area(){
           int result2 = l*b;
           System.out.println("Area of a rectangle:"+result2);
       }

}
class Main {
    public static void main(String[] args) {
Circle c= new Circle(2);
Rectangle r= new Rectangle(2,2);
c.area();
r.area();
    }
}