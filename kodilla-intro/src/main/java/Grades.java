public class Grades {

    private int[] grades;
    private int size;
    public double average;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade() {
        return this.grades[this.size - 1];
    }

    public double calculateAverageGrade(double average) {
        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];
            average = sum / 10;
        }
        return average;
    }
}