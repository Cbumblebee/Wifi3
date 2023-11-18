public class Main {
    public static void main(String[] args) {
        Mountainbike bike1 = new Mountainbike("Santa Cruz", 1000, MountainbikeTyp.FULLY);
        Mountainbike bike2 = new Mountainbike("Propain", 4999, MountainbikeTyp.DOWNHILL);

        System.out.println("Bike 1 Details: ");
        bike1.zeigeDetails();
        System.out.println("Bike 2 Details: ");
        bike2.zeigeDetails();
    }
}