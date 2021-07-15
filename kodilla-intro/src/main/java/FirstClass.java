public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 1000, 2021);
        Notebook heavyNotebook = new Notebook("2000g", 2000, 2015);
        Notebook oldNotebook = new Notebook("1200g", 650, 2010);
        Notebook newNotebook = new Notebook("1000g", 3000, 2021);
        Notebook myNotebook = new Notebook("1300g", 1150, 2014);

        notebookParameters(notebook, "prize: ");
        notebookParameters(heavyNotebook, "price: ");
        notebookParameters(oldNotebook, "price: ");
        notebookParameters(newNotebook, "price: ");
        notebookParameters(myNotebook, "price: ");
    }

    private static void notebookParameters(Notebook myNotebook, String s) {
        System.out.println("weight: " + myNotebook.weight + ", " + s + myNotebook.price + ", " + "year: "
                + myNotebook.year);
        myNotebook.checkPrice();
        myNotebook.checkWeight();
        myNotebook.checkValuation();
        System.out.println();
    }
}