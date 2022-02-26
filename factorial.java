 class Factorial {

    public static void main(String[] args) {

        int num = 5;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}



// github url -----> https://github.com/ShrutiMore24/JavaAssignment5
// hosted url  -------->  https://shrutimore24.github.io/JavaAssignment5/factorial.java