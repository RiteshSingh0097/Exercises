//Q9.Write a program to display values of enums using a constructor & getPrice()
// method (Example display house & their prices)


enum Rent{
    Alpha(5000),
    Beta(7500),
    Gama(8500),
    Delta(9500);

    private final int price;

    Rent(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
public class Question9 {
    Rent rent;
    Question9(Rent rent){
        this.rent = rent;
    }

    public static void main(String[] args) {
        for(Rent house : Rent.values()){
            System.out.println("House name : "+house+" Rent : "+house.getPrice());
        }

    }
}
