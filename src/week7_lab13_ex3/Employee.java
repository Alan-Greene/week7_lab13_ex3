package week7_lab13_ex3;

public class Employee {
    private String name;
    private String employee_number;
    private String hire_date;

    public Employee(){
        this.name = "";
        this.employee_number = "";
        this.hire_date = "";
    }

    public Employee(String name, String employee_number, String hire_date){
        this.name = name;
        if (check_number(employee_number)){
            this.employee_number = employee_number;
        } else {
            this.employee_number = "";
        }
        this.hire_date = hire_date;
    }

    private boolean check_number(String employee_number){
        boolean check = false;
        char first_letter = employee_number.charAt(0);

        if (first_letter == 'e'){
            check = true;
        }

        return check;
    }

    public String getName(){
        return this.name;
    }

    public String getEmployee_number(){
        return this.employee_number;
    }

    public String getHire_date(){
        return this.hire_date;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmployee_number(String employee_number){
        this.employee_number = employee_number;
    }

    public void setHire_date(String hire_date){
        this.hire_date = hire_date;
    }

    public void print_employee_details(){
        System.out.println("Employee details");
        System.out.printf("Employee name: %s%n", this.name);
        System.out.printf("Employee number: %s%n", this.employee_number);
        System.out.printf("Employee hire date: %s%n", this.hire_date);
    }

}
