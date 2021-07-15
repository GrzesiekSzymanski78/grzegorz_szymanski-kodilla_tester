public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 1000, 2021);
        System.out.println("weight: " + notebook.weight + ", " + "prize: " + notebook.price + ", " + "year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkValuation();
        System.out.println();

        Notebook heavyNotebook = new Notebook("2000g", 2000, 2015);
        System.out.println("weight: " + heavyNotebook.weight + ", " + "price: " + heavyNotebook.price + ", " + "year: "
                + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkValuation();
        System.out.println();

        Notebook oldNotebook = new Notebook("1200g", 650, 2010);
        System.out.println("weight: " + oldNotebook.weight + ", " + "price: " + oldNotebook.price + ", " + "year: "
                + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkValuation();
        System.out.println();

        Notebook newNotebook = new Notebook("1000g", 3000, 2021);
        System.out.println("weight: " + newNotebook.weight + ", " + "price: " + newNotebook.price + ", " + "year: "
                + newNotebook.year);
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.checkValuation();
        System.out.println();

        Notebook myNotebook = new Notebook("1300g", 1150, 2014);
        System.out.println("weight: " + myNotebook.weight + ", " + "price: " +  myNotebook.price + ", " + "year: "
                + myNotebook.year);
        myNotebook.checkPrice();
        myNotebook.checkWeight();
        myNotebook.checkValuation();
    }
}