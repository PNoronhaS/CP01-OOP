package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class principal {
    public static void main(String[] args) {
        Veiculos v1 = new Veiculos("Carlos", "ABC-1234", 10);

        v1.adicionarGasolina(50);
        v1.gastarGasolina(100); 

        System.out.println(v1);
    }
}
