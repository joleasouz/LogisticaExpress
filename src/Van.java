public class Van extends Veiculo{
    public Van(String placa, String modelo, double capacidadeCargaKg){
        super(placa, modelo, capacidadeCargaKg);
    }

    @Override
    public double calcularCustoFrete(double distanciaKm){
        double frete = 2.50*distanciaKm;
        if(getCapacidadeCargaKg() >= 1000){
            frete += 30;
        }
        return frete;
    }

    @Override
    public String getInstancia() {
        return "";
    }   

}
