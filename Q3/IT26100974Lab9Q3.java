public class IT26100974Lab9Q3 {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        
        int part1 = multiply(3, 4);
        int part2 = multiply(5, 7);
        int sum1 = add(part1, part2);
        int expression1 = square(sum1);

        
        int sum2_1 = add(4, 7);
        int sum2_2 = add(8, 3);
        int expression2 = add(square(sum2_1), square(sum2_2));

        
        System.out.println("Result of (3*4+5*7)^2 : " + expression1);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + expression2);
    }
}