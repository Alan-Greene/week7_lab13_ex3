package week7_lab13_ex3;

import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the employee details: ");

        System.out.println("Employee name: ");
        String emp_name = in.nextLine();

        System.out.println("Employee number: ");
        String emp_number = in.nextLine();

        System.out.println("Employee hire date (dd-mm-YYYY): ");
        String emp_hire_date = in.nextLine();

        System.out.println("The DAY pay rate: ");
        double day_rate = in.nextDouble();

        System.out.println("The NIGHT pay rate: ");
        double night_rate = in.nextDouble();

        System.out.println("The number of days worked: ");
        int number_of_days_worked = in.nextInt();

        ProductionWorker worker1 = new ProductionWorker(emp_name, emp_number, emp_hire_date, day_rate, night_rate, number_of_days_worked);

        for (int day = 0; day < number_of_days_worked;day++){
            System.out.printf("Did you work the DAY(1) or NIGHT(2) shift for day %d", day+1);
            int shift = in.nextInt();
            in.nextLine();
            System.out.printf("How many hours did you work for day %d", day+1);
            int hours = in.nextInt();
            in.nextLine();

            worker1.calculate_pay(day, hours, shift);
        }

        worker1.print_employee_details();

    }


}
