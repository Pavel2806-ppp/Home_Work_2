package Home_work_2;

public class Price implements People {
    public int price;

    public Price(int price){
        this.price = price;
    }

    public void dollars(){
        System.out.println("Price it phone");
    }

    @Override
    public void info() {
        System.out.println("price in dollars this is phone = " + this.price);
    }
}
