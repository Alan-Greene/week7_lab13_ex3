package week7_lab13_ex3;

public class ProductionWorker extends Employee{
    final int DAY_SHIFT = 1;
    final int NIGHT_SHIFT = 2;
    double day_rate;
    double night_rate;
    double[] payslips;

    public ProductionWorker(){
        super();
        this.day_rate = 0;
        this.night_rate = 0;
        this.payslips = new double[5];
    }

    public ProductionWorker(String name, String employee_number, String hire_date,
                            double day_rate, double night_rate, int number_of_days_worked){
        super(name, employee_number, hire_date);
        this.day_rate = day_rate;
        this.night_rate = night_rate;
        this.payslips = new double[number_of_days_worked];
    }

    public void calculate_pay(int day_number, int number_of_hours_worked, int shift_type){
        double pay = 0.0;

        if (shift_type == 1){
            pay = this.day_rate * number_of_hours_worked;
        } else {
            pay = this.night_rate * number_of_hours_worked;
        }

        this.payslips[day_number] = pay;
    }

    public double total_pay(){
        double sum = 0;

        for (double payslip : this.payslips) {
            sum += payslip;
        }

        return sum;
    }

    public void print_pay() {
        int counter = 1;
        System.out.println("Daily pay");
        for (double payslip : this.payslips) {
            System.out.printf("Pay for day %d is €%.2f%n", counter, payslip);
            counter++;
        }
        counter = 0;
    }

    @Override
    public void print_employee_details(){
        super.print_employee_details();
        System.out.printf("Total pay: €%.2f%n", this.total_pay());
        System.out.println("");
        this.print_pay();
    }
}
