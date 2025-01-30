//Create a Book class with attributes title, author, and price. Write a method to display the details of the book. Create multiple objects of the class and call the method.
class Book {
    String title;
    String author;
    int price;

 Book(String title,String author,int price){
     this.title=title;
     this.author=author;
     this.price=price;
 }

 public void display(){
    System.out.println("Tile:"+title);
    System.out.println("Author:"+author);
    System.out.println("Price:"+price);
}
}
class Main {
    public static void main(String[] args) {
    Book b1= new Book("book1","abc",20);
    Book b2= new Book("book2","xyz",30);
    b1.display();
    System.out.println();
    b2.display();
    
    }
}