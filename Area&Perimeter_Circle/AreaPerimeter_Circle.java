/*
Write a Java program to print the area and perimeter of a circle.
    Test Data:
    Radius = 7.5

    Expected Output
    Perimeter is = 47.12388980384689
    Area is = 176.71458676442586
 */

/*
In geometry, the are enclosed by a circle of radius r is пr2(pie r squared)
 п is a constant which equals 3.14159 == (3.14)
which is equal to the ratio of the circuference of any circle to its diameter
*/

package area.perimeter_circle;

public class AreaPerimeter_Circle {

    public static void main(String[] args) {
        
        double radius  = 7.5;
        
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
                
    }
    
}
