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
    }

}