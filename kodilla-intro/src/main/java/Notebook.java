public class Notebook {
    String weight;
    int price;
    int year;

    public Notebook(String weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap");
        } else if ((this.price >= 600) && (this.price <= 1000)) {
            System.out.println("This price is good");
        } else
            System.out.println("This notebook is expensive");
    }

    public void checkWeight() {
        if (this.weight == "600g") {
            System.out.println("This notebook is light");
        } else if ((this.weight == "1200g") && (this.weight == "1000g")) {
            System.out.println("This notebook isn't light, but not very heavy");
        } else
            System.out.println("This notebook is heavy");
    }

    public void checkValuation() {
        if ((this.price >= 3000) && (this.year > 2018) && (this.year <= 2021)) {
            System.out.println("This notebook is right priced");
        } else if ((this.price < 2000) && (this.price >= 1100) && (this.year <= 2015)) {
            System.out.println("This notebook is highly overpriced");
        } else if ((this.price <= 1000) && (this.year > 2015) && (this.year <= 2021)) {
            System.out.println("This notebook is discounted");
        } else
            System.out.println("This notebook is slightly overpriced");
    }
}