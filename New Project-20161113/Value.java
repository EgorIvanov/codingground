public class Value implements Expression {
    double value
    
    public Value(double value) {
        this.value=value
    }
    
    public calculate() {
        return this.value
    }
}