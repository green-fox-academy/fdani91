public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double Length = 101.5;
        double Width = 40.3;
        double Height = 35.7;

        double Volume = (Length * Width * Height);
        double Surface = ((2 * Width * Length) + (2 * Length * Height) + (2 * Height * Width));

        String VolumeAsString = String.format("%.0f", Volume);
        String SurfaceAsString = String.format("%.0f", Surface);

        System.out.println("Surface area: " + (SurfaceAsString));
        System.out.println("Volume: " + (VolumeAsString));

    }
}
