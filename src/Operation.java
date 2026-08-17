import java.util.Scanner;
abstract class Operation
{

    abstract double Calculator (double x, double y);
}

class Sum extends Operation
{
    double  Calculator (double x , double y )
    {
       return x + y;
    }
}

class Sub extends Operation
{

    double  Calculator (double x , double y )
    {
        return x - y;
    }
}

class Multi extends Operation
{
    double  Calculator (double x , double y )
    {
        return x * y;
    }
}

class Div extends Operation
{

    double  Calculator (double x , double y )
    {
        if ( y== 0)
        {
            System.out.println("Error: Division by zero!");
        }

        return x/y;
    }
}

class Calculator
{
  static void main()
  {
     Scanner sc = new Scanner (System.in);

       System.out.println("Sum: Enter two number");
       Sum sum = new Sum();
       double sumResult = sum.Calculator(sc.nextDouble(),sc.nextDouble());
       System.out.println("Result: " + sumResult);

      System.out.println("Subtraction: Enter two number");
      Sub sub = new Sub();
      double subResult = sub.Calculator(sc.nextDouble(),sc.nextDouble());
      System.out.println("Result: " + subResult);

      System.out.println("Multiplication: Enter two number");
      Multi multi = new Multi();
      double multResult = multi.Calculator(sc.nextDouble(),sc.nextDouble());
      System.out.println("Result: " + multResult);

      System.out.println("Division Enter two number");
      Div div = new Div();
      double divResult = div.Calculator(sc.nextDouble(),sc.nextDouble());
      System.out.println("Result: " + divResult);
  }
}
