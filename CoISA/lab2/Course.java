package lab2;

import java.util.Arrays;

/**
 * course with grades and study hours
 */
public class Course {
    private String courseName;
    private int hours;
    private double[] grades;
    private int[] weights;

    public Course(String courseName) {
        this(courseName, 4);
    }

    public Course(String courseName, int numGrades) {
        this(courseName, numGrades, null);
    }

    /**
     * create course with weights
     * @param courseName course name
     * @param numGrades number of grades
     * @param weights weight for each grade
     */
    public Course(String courseName, int numGrades, int[] weights) {
        this.courseName = courseName;
        this.hours = 0;
        this.grades = new double[numGrades];
        this.weights = weights;
    }

    /**
     * add study hours
     * @param hours hours to add
     */
    public void addHours(int hours) {
        this.hours += hours;
    }

    /**
     * add grade
     * @param grade grade number
     * @param value grade value
     */
    public void addGrade(int grade, double value) {
        this.grades[grade - 1] = value;
    }

    private double getAverage() {
        if (this.weights == null) {
            double sum = 0;
            for (double g : this.grades) sum += g;
            return sum / this.grades.length;
        }
        double sum = 0;
        int sumWeights = 0;
        for (int i = 0; i < this.grades.length; i++) {
            sum += this.grades[i] * this.weights[i];
            sumWeights += this.weights[i];
        }
        return sum / sumWeights;
    }

    public boolean isApproved() {
        return getAverage() >= 7.0;
    }

    @Override
    public String toString() {
        return this.courseName + " " + this.hours + " " + getAverage() + " " + Arrays.toString(this.grades);
    }
}
