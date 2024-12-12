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
    public void setName(String name){
        this.name=name;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public String toString(){
        return "Name: " + name + " Title: " + title + " Salary: " + salary;
    }



}
