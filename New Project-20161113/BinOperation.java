    public BinOperation(Expression value) {
        this.value=value;
    }
    
    public double calculate() {
        return doCalculate;
    }
    
    protected abstract double doCalculate(Expression e); 
}
public class SqrtOperation extends UnOperation{
    SqrtOperation(Expression value) {
        super(UnOperation);
    }
    
    public calculate() {
        return(doCalculate);
    }
    
    public doCalculate(Expression e) {
        e=double c;
    }
}