//9.  Design classes having attributes for furniture where there are wooden chairs and tables,
// metal chairs and tables. There are stress and fire tests for each products.
import java.util.Scanner;

abstract class Furniture{
    private String wchairname;
    private String wtablename;
    private String mchairname;
    private String mtablename;

    public void wooden(String wchairname, String wtablename){
        this.wchairname = wchairname;
        this.wtablename = wtablename;
        System.out.println("Wooden chair is : "+wchairname+ " Wooden table is : "+wtablename);
    }
    public void metal(String mchairname, String mtablename){
        this.mchairname = mchairname;
        this.mtablename = mtablename;
        System.out.println("Metal chair is : "+mchairname+" Metal table is : "+mtablename);
    }

    public abstract void stressForWoodenItems(int stress);
    public abstract void fireForWoodenItems(int fire);
    public abstract void fireForMetalItems(int fire);
    public abstract void stressForMetalItems(int stress);
}

public class Question9 extends Furniture {
    private int stress;
    private int fire;

    public static void main(String[] args) {
        Furniture f = new Question9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wooden chair name you want to buy");
        String wchairname = sc.next();
        System.out.println("Enter wooden table name you want to buy");
        String wtablename = sc.next();
        f.wooden(wchairname,wtablename);

        System.out.println("Enter metal chair name you want to buy");
        String mchairname = sc.next();
        System.out.println("Enter metal table name you want to buy");
        String mtablename = sc.next();
        f.metal(mchairname,mtablename);

        System.out.println("Enter the value to check stress of wooden item");
        int wstress = sc.nextInt();
        f.stressForWoodenItems(wstress);
        System.out.println("Enter the value to check fire of wooden item");
        int wfire = sc.nextInt();
        f.fireForWoodenItems(wfire);
        System.out.println("Enter the value to check stress of metal item");
        int mstress = sc.nextInt();
        f.stressForMetalItems(mstress);
        System.out.println("Enter the value to check fire of metal item");
        int mfire = sc.nextInt();
        f.fireForMetalItems(mfire);
    }

    @Override
    public void stressForWoodenItems(int stress) {
        if (stress<500){
            System.out.println("wooden furniture handles stress");
        }
        else{
            System.out.println("Wooden furniture does not handle stress");
        }
    }

    @Override
    public void fireForWoodenItems(int fire) {
        if (fire > 20){
            System.out.println("fire can be handled by wooden items");
        }
        else
            System.out.println("fire can not be handled by wooden items");
    }

    @Override
    public void fireForMetalItems(int fire) {
        if (fire >100)
            System.out.println("fire can be handled by metal items");
        else
            System.out.println("fire can not handled by metal items");
    }

    @Override
    public void stressForMetalItems(int stress) {
        if (stress < 1000)
            System.out.println("metal furniture handles stress");
        else
            System.out.println("metal furniture does not handle stress");
    }
}
