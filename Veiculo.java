package AtvdadeMaio;

public class Veiculo {
    private String marca;
    private String modelo;
    private String combustivel;
    private double tanque;
    private double autonomia;

    public Veiculo(String marcaParam, String modeloParam, String combustivelParam, double tanqueParam, double autonomiaParam) {
        marca = marcaParam;
        modelo = modeloParam;
        combustivel = combustivelParam;
        tanque = tanqueParam;
        autonomia = autonomiaParam;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double getTanque() {
        return tanque;
    }

    public double getAutonomia() {
        return autonomia;
    }
}
