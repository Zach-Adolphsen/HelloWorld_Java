public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        for(int i =1; i<=5; i++){
            System.out.println("i = " + i);
        }

        boolean test = true;
        for(int i = 1; i <= 9; i++){
            System.out.println("i = " + i);
            System.out.println("test = " + test);

            if(i == 4) break;
        }

        Employee em1 = new Employee("Justin", "CEO", 200000);
        Employee em2 = new Employee("Chris", "Janitor", 50000);

        System.out.println(em1.toString());
        System.out.println(em2.toString());

    }

}