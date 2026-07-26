public class Main {
    public static void main(String[] args) {
        Calculator casio = new Calculator();

        System.out.println("Addition: " + casio.add(10.9, 6.0, 70.0));
        System.out.println("Addition with edge case: " + casio.add(1.0, 2.0, 3.0, 4.0));

        System.out.println("Subtraction: " + casio.subtract(20.0, 5.0, 3.0));
        System.out.println("Subtraction with edge case: " + casio.subtract(9.0));

        System.out.println("Multiplication: " + casio.multiply(2.0, 3.0, 4.0));
        System.out.println("Multiplication with edge case: " + casio.multiply(5.0, 0.0, 9.0));

        System.out.println("Divide: " + casio.divide(12.0, 3.0));
        try {
            casio.divide(10.0, 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Error!: " + e.getMessage());
        }

        System.out.println("Maximum: " + casio.maximum(3.0, 9.0, 1.0));
        System.out.println("Maximum with edge case: " + casio.maximum(5.0, 5.0, 5.0));

        System.out.println("Minimum: " + casio.minimum(3.0, 9.0, 1.0));
        System.out.println("Minimum with edge case: " + casio.minimum(-4.0, -10.0, 2.0));
    

        System.out.println("Modulus: " + casio.modulus(27.0, 3.0));
        try {
            casio.modulus(10.0, 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Modulus error!: " + e.getMessage());
        }

        System.out.println("Power: " + casio.power(2.0, 8.0));
        System.out.println("Power with edge case: " + casio.power(8.0, -1.0));

        System.out.println("Average: " + casio.average(67.0, 8.0, 12.0));
        System.out.println("Average with edge case: " + casio.average(7.0));
    }
}