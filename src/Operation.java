abstract class Operation
{
    double x;
    double y;

    public void calculate (double x , double y )
    {
        this.x=x;
        this.y=y;
    }
}

class Sum extends Operation
{
    double sum;
    public void calculate (double x , double y )
    {
        this.x=x;
        this.y=y;
        sum = x+y;
    }
}

class Sub extends Operation
{
    double sub;
    public void calculate (double x , double y )
    {
        this.x=x;
        this.y=y;
        sub = x-y;
    }
}

class Multi extends Operation
{
    double multi;
    public void calculate (double x , double y )
    {
        this.x=x;
        this.y=y;
        multi = x*y;
    }
}

class Div extends Operation
{
    double div;
    public void calculate (double x , double y )
    {
        this.x=x;
        this.y=y;
        div = x/y;
    }
}

class Calculator
{

}
