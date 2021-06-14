/*
Write a Java program to print the area and perimeter of a rectangle.
    Test Data:
    Width = 5.6 Height = 8.5

    Expected Output
    Area is 5.6 * 8.5 = 47.60
    Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

package area.perimeter_rectangle;

public class AreaPerimeter_rectangle {

    public static void main(String[] args) {
        
// the logical coding might be done in this manner:
        
        double wid = 5.6;
        double hei = 8.5;
        
        double a = wid * hei;
        double p = wid + wid + hei + hei;
        
        System.out.println(wid + " * " + hei + " = " + a);
        System.out.println(wid + " + " + wid + " + " + hei + " + " + hei + " = " + p);
        
        System.out.println("\n");
        
// To round the numbers accordingly and following the question specifically and answer it correctly 
        
        double width = 5.6;
        double height = 8.5;
        
        double area = width * height;
        double perimeter = 2 * (width + height);
        
        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", width, height, perimeter);
        
        
// %.1f === how many decimals after the comma [the number tells how many there should be]
// printf === print format method
// (2 * (%.1f + %.1f) = %.2f \n", , , ) === this tells the computer that the 1st point after the comma to have 1 decimal
//                                                                           2nd point after the comma to have 1 decimal
//                                                                           3rd point after the comma to have 2 decimal        

    }
    
}
