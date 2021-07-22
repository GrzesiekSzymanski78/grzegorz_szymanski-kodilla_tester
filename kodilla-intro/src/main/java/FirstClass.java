public class FirstClass {
    public static void main(String[] args) {

//        Notebook notebook = new Notebook("600g", 1000, 2021);
//        Notebook heavyNotebook = new Notebook("2000g", 2000, 2015);
//        Notebook oldNotebook = new Notebook("1200g", 650, 2010);
//        Notebook newNotebook = new Notebook("1000g", 3000, 2021);
//        Notebook myNotebook = new Notebook("1300g", 1150, 2014);
//
//        notebookParameters(notebook, "prize: ");
//        notebookParameters(heavyNotebook, "price: ");
//        notebookParameters(oldNotebook, "price: ");
//        notebookParameters(newNotebook, "price: ");
//        notebookParameters(myNotebook, "price: ");

        Grades grades = new Grades();
        grades.add(1);
        grades.add(2);
        grades.add(3);
        grades.add(4);
        grades.add(5);
        grades.add(6);
        System.out.println(grades.lastGrade());
        System.out.println(grades.calculateAverageGrade());
        int[] gregorGrades = new int[5];
        gregorGrades[0] = 0;
        gregorGrades[1] = 20;
        gregorGrades[2] = 30;
        gregorGrades[3] = 40;
        gregorGrades[4] = 50;

        System.out.println(grades.calculateAverageFromArray(gregorGrades));
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