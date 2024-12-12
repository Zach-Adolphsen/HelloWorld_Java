public class Employee {

    public String name;
    public String title;
    public double salary;

    public Employee(String name, String title, double salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getTitle(){
        return title;
    }

    public double getSalary(){
        return salary;
    }

    public String toString(){
        return "Name: " + name + " Title: " + title + " Salary: " + salary;
    }



}
