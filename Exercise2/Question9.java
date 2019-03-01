import java.util.Scanner;

abstract class Furniture {

    String product;
    int stressLevel;
    int fireTest;

    abstract void getProduct();

    abstract void stressLevel();

    abstract void fireTest();
}

class Wood extends Furniture {

    public Wood(String product, int stressLevel, int fireTest) {
        this.product = product;
        this.stressLevel = stressLevel;
        this.fireTest = fireTest;
    }

    @Override
    public void getProduct() {
        System.out.println("Type of Product : " + product);
    }

    @Override
    public void stressLevel() {
        if (stressLevel < 500) {
            System.out.println("wooden furniture handles stress");
        } else {
            System.out.println("Wooden furniture does not handle stress");
        }

    }

    @Override
    public void fireTest() {
        if (fireTest > 20) {
            System.out.println("fire can be handled by wooden items");
        } else
            System.out.println("fire can not be handled by wooden items");
    }
}

class Metal extends Furniture {

    public Metal(String product, int stressLevel, int fireTest) {
        this.product = product;
        this.stressLevel = stressLevel;
        this.fireTest = fireTest;
    }

    @Override
    public void getProduct() {
        System.out.println("Type of Product : " + product);
    }

    @Override
    public void stressLevel() {
        if (stressLevel < 1000)
            System.out.println("metal furniture handles stress");
        else
            System.out.println("metal furniture does not handle stress");

    }

    @Override
    public void fireTest() {
        if (fireTest > 100)
            System.out.println("fire can be handled by metal items");
        else
            System.out.println("fire can not handled by metal items");
    }
}

public class Question9 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of furniture : ");
        String type = sc.next().toLowerCase();

        System.out.println("Enter the product : ");
        String product = sc.next();

        System.out.println("Enter the stress : ");
        int stress = sc.nextInt();

        System.out.println("Enter the fire level : ");
        int fire = sc.nextInt();

        if (type.equals("wood")) {
            Wood wood = new Wood(product, stress, fire);
            wood.getProduct();
            wood.fireTest();
            wood.stressLevel();
        } else {
            Metal metal = new Metal(product, stress, fire);
            metal.getProduct();
            metal.fireTest();
            metal.stressLevel();
        }
    }

}
