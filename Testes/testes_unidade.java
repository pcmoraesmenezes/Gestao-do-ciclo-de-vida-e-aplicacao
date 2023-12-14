import org.example.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class TestCalculator {
    private Calculator calculator;

    @Test
    @DisplayName("#add > When both numbers are positive > Return a positive number")
    public void addWhenBotNumberArePositive(){
            calculator = new Calculator();
            int result = calculator.somar(2,3);
            Assertions.assertEquals(5,result);
        }
        public void addWhenOneIsNegativeAndOtherIsPositive(){
        calculator = new Calculator();
        int result = calculator.somar(-1,2);
        Assertions.assertEquals(1,result);
        }

        @Test
        public void AddTwoNegative(){
        calculator = new Calculator();
        int result = calculator.somar(-1,-1);
        Assertions.assertEquals(-2,result);
        }

        @Test
        public void negativeAndPositive(){
        calculator = new Calculator();
        double result = calculator.subtrair(-1,1);
        Assertions.assertEquals(-2.0, result);

        }
        @Test
        public void positiveAndPositive(){
        calculator = new Calculator();
        double result = calculator.subtrair(1,1);
        Assertions.assertEquals(0.0, result);
        }
        @Test
        public void negativeAndNegative(){
        calculator = new Calculator();
        double result = calculator.subtrair(-1,-1);
        Assertions.assertEquals(0, result);
        }

        @Test
    public void divideByZero(){
        calculator = new Calculator();
            Assert.assertThrows(ArithmeticException.class, () ->{
                double result = calculator.dividir(1,0);
            });
        }
        @Test
    public void divideTwoInteger(){
        calculator = new Calculator();
        double result = calculator.dividir(2.0, 4.0);
        Assert.assertEquals(0.5, result, 0.0);
    }
    @Test
    public void divideTwoFloat(){
        calculator = new Calculator();
        double result = calculator.dividir(0.5, 0.5);
        Assert.assertEquals(1.0, result, 0.0);
    }
    @Test
    public void multiplyTwoPositive(){
        calculator = new Calculator();
        double result = calculator.multiplicar(2,2);
        Assertions.assertEquals(4.0,result);
    }
    @Test
    public void multiplyTwoNegative(){
        calculator = new Calculator();
        double result = calculator.multiplicar(-2,-2);
        Assertions.assertEquals(4.0, result);
    }
    @Test
    public void multiplyOneNegativeByPositive(){
        calculator = new Calculator();
        double result = calculator.multiplicar(-2, 2);
        Assertions.assertEquals(-4.0, result);
    }
    }


