package musementpark.online.Interpret;

public class Number implements Expression{
    Double number;
    public Number(Double x){
        number=x;
    }

    @Override
    public Double intercept() {
        return number;
    }
}
