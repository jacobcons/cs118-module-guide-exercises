public class Variables {
    public static void main(String[] args) {
        //Ex7 - you'd use a short to store 6,371
        //Ex8 - you'd use a long to store 7,046,000,000
        int surfaceArea = 510100000;
        long population = 7046000000L;
        float populationDensity = (float) population / surfaceArea;
        System.out.printf("Population density is approx %.2f km^2\n", populationDensity);
    }
}