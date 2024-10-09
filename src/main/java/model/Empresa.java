    //Nome, Endereço, Cidade, Estado, CEP e Fone
package model;

import javax.swing.JOptionPane;

public class Empresa {
    
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private int CEP;
    private int fone;
    
    public Empresa() {

    this("","","","",0,0);
    }

    public Empresa(String nome, String endereco, String cidade, String estado, int CEP, int fone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public int getCEP() {
        return CEP;
    }

    public int getFone() {
        return fone;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }
    
    public void leitura() {
    setNome(JOptionPane.showInputDialog("Digite o nome"));
    setEndereco(JOptionPane.showInputDialog("Digite o endereço"));
    setCidade(JOptionPane.showInputDialog("Digite a cidade"));
    setEstado(JOptionPane.showInputDialog("Digite o estado"));
    setCEP(Integer.parseInt(JOptionPane.showInputDialog("Digite o CEP")));
    setFone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone")));
    
    }

   public String mostrarEmpresa(){
   return "Nome: " + getNome() +", " + " Endereço: " + getEndereco() + ", "  + "Cidade: " + getCidade() + ", "  + "Estado: " + getEstado() + ", "  + "CEP: " + getCEP() + ", "  + "Fone: " + getFone();
   }
}
