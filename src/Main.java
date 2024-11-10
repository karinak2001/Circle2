import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle(); //Default constructor
        System.out.println(c1.center); //printing the center of the c1 object
        System.out.println(c1.radius);

        //CHANGING THE VALUE OF ATTRIBUTES
        c1.center = new Point(0, 0);
        c1.radius = 3;
        // כרגע אפשר לגשת לשדות של האובייקט דרך האופרטור נקודה, אבל לאחר מכן אי אפשר יהיה
        // לגשת ככה לשדות בגלל ה Access Modifiers למשל private

        System.out.println(c1.center);
        System.out.println(c1.radius);


        // אתחול נכון של ערכים לתוך השדות של האובייקט שלנו
        c1.setCenter(new Point(1, 2) );
        c1.setRadius(5);

        System.out.println(c1.center);
        System.out.println(c1.radius);


        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());
    }

}