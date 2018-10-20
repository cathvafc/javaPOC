import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int height = 0;

        System.out.println("Introduce the height of the rectangle: ");

        height = reader.nextInt();

        for (int stars=1; stars<height; stars++){

            for(int drawnStars = 0; drawnStars < stars; drawnStars++){

                System.out.print("x");

            }
            System.out.print("\n");

        }

        for(int counter = 0; counter < height; counter++){

            System.out.print("x");

        }

        System.out.print("\n");

        for (int stars = height - 1; stars > 0; stars--){

            for (int drawnStars = 0; drawnStars < stars; drawnStars++){

                System.out.print("x");

            }

            System.out.print("\n");
        }






    }
}
