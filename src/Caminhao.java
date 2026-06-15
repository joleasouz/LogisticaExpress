public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, String modelo, double capacidadeCargaKg, int eixos){
        super(placa, modelo, capacidadeCargaKg);
        this.eixos = eixos;
    }

    public int getEixos(){
        return this.eixos;
    }

    @Override
    public double calcularCustoFrete(double distanciaKm){
        double frete = (4.50*distanciaKm)*getEixos();
        return frete;
    }

    @Override
    public String getInstancia() {
        return " | Eixos: " + eixos;
    }
}
