public record Dados(double conversion_rates){
    @Override
    public String toString() {
        return "cotação atual: " + conversion_rates;
    }
}
