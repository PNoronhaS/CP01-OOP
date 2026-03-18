package br.com.fiapride.model;


public class Veiculos {


    private String individuo;
    private String placa;
    private double gasolina;

  
    public Veiculos(String individuo, String placa, double gasolinaInicial) {
        this.individuo = individuo;
        this.placa = placa;
        setGasolina(gasolinaInicial);
    }

    
    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getGasolina() {
        return gasolina;
    }

   
    public void setGasolina(double gasolina) {
        if (gasolina < 0) {
            this.gasolina = 0; 
        } else {
            this.gasolina = gasolina;
        }
    }

  
    public void adicionarGasolina(double litros) {
        if (litros > 0) {
            this.gasolina += litros;
        }
    }

    public void gastarGasolina(double litros) {
        if (litros > 0 && litros <= this.gasolina) {
            this.gasolina -= litros;
        } else {
            System.out.println("Quantidade inválida de gasolina para gastar.");
        }
    }

    
    @Override
    public String toString() {
        return "Dono: " + individuo + " | Placa: " + placa + " | Gasolina: " + gasolina + "L";
    }
}
