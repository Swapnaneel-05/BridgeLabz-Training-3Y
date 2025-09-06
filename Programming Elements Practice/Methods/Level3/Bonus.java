package BridgeLabz.Method.Level3;

public class Bonus {
    static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            int salary = (int)(Math.random() * 90000) + 10000;
            int years = (int)(Math.random() * 10) + 1;
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    static double[][] calculateNewSalary(double[][] data) {
        int n = data.length;
        double[][] result = new double[n][3];
        for (int i = 0; i < n; i++) {
            double oldSalary = data[i][0];
            double years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;
            result[i][0] = oldSalary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    static void displaySummary(double[][] data, double[][] result) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.printf("%-10s %-10s %-12s %-12s %-12s %-12s%n",
                "EmpID", "Salary", "Years", "Bonus", "NewSalary", "Total");
        for (int i = 0; i < data.length; i++) {
            sumOld += result[i][0];
            sumBonus += result[i][1];
            sumNew += result[i][2];
            System.out.printf("%-10d %-10.2f %-12.0f %-12.2f %-12.2f %-12.2f%n",
                    (i + 1), result[i][0], data[i][1], result[i][1], result[i][2],
                    result[i][0] + result[i][1]);
        }

        System.out.printf("%-10s %-10.2f %-12s %-12.2f %-12.2f %-12s%n",
                "TOTAL", sumOld, "", sumBonus, sumNew, "");
    }

    public static void main(String[] args) {
        double[][] data = generateEmployeeData(10);
        double[][] result = calculateNewSalary(data);
        displaySummary(data, result);
    }
}
