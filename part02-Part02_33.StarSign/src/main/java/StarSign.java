
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");

    }

    public static void printStars(int number) {
        // first part of the exercise
        int i = 0;
        while (i < number) {
            System.out.printf("*");
            i++;
        }
        System.out.println("");
        
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int i = 1;
        while (i <= size) {
            printStars(size);         
            i++;
        }
        System.out.println("");
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        int i = 1;
        int j = 1;
        while (i <= width) {
            while (j <= height) {
                printStars(width);
                j++;
            }   
            i++;
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }
}
