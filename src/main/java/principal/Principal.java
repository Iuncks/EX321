package principal;

import model.Empresa;
import model.Restaurante;
        
public class Principal {
    public static void main(String[] args) {
     
        
        Empresa empresa = new Empresa();
        empresa.leitura();
        System.out.println("As informações da empresa são: " + empresa.mostrarEmpresa());

   
        Restaurante restaurante = new Restaurante();
        restaurante.leituraRestaurante();
        System.out.println("As suas informações do restalrante são: " + restaurante.mostrarRestaurante());

    }
}
