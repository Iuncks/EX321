package model;

import javax.swing.JOptionPane;

public class Restaurante extends Empresa {

    private String comida;
    private Double precoMedio;

    public Restaurante() {
    
        this("", "", "", "", 0, 0,"",0.0);
    }

    public Restaurante(String comida, Double precomedio) {
        this.comida = comida;
        this.precoMedio = precomedio;
    }

    public Restaurante(String nome, String endereco, String cidade, String estado, int CEP, int fone, String comida, Double precoMedio) {
        super(nome, endereco, cidade, estado, CEP, fone);
        this.comida = comida;
        this.precoMedio = precoMedio;
    }

    public String getComida() {
        return comida;
    }

    public Double getPrecoMedio() {
        return precoMedio;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public void setPrecoMedio(Double precoMedio) {
       this.precoMedio = precoMedio;
    }
    
    public void leituraRestaurante() {
    setComida(JOptionPane.showInputDialog("Digite a comida"));
    setPrecoMedio(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço")));
    
    }

    public String mostrarRestaurante(){
    return "COMIDA: " + getComida() + ", " + "PREÇO: " + getPrecoMedio();
   
    }
}

   

   


       