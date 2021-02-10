package Home_work_2;

public class Product implements People {
    public String product;

    public Product(String product) {
        this.product = product;
    }

    public void cantry(){
        System.out.println("Product in USA");
    }

    @Override
    public void info() {
        System.out.println("Product from USA, company name`s " + this.product);
    }
}
