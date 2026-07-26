public class Calculator {

    // Varargs accepts any number of values 
    public double add(double... numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total;
    }

    public double subtract(double... numbers) {
        if (numbers.length == 0) return 0;
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public double multiply(double... numbers) {
        if (numbers.length == 0) return 0;
        double result = 1;
    // Using enhanced for loop which visits every value in "numbers" in order,
    // no index needed since we just need each value, not its position
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }

    // Two operands only, since division is done in pairs
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

     public double maximum(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot find maximum of zero numbers.");
        }
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) 
                max = number;
        }
        return max;
    }

    public double minimum(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot find minimum of zero numbers.");
        }
        double min = numbers[0];
        for (double number : numbers) {
            if (number < min) 
                min = number;
        }
        return min;
    }



    // Two operands only, since modulus is done in pairs
    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot take modulus with divisor zero.");
        }
        return a % b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double average(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Cannot average zero numbers.");
        }
        return add(numbers) / numbers.length;
    }
}
   