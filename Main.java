/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.projetc172023;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Pessoa indentidade = new Pessoa();
        Caixa embalagem = new Caixa();
        
        embalagem.setLargura (10);
        embalagem.setAltura  (10);
        embalagem.setComprimento(10);
        
        
        System.out.println(indentidade.getIdade()       + "\n" + 
                           indentidade.getPeso()        + "\n" + 
                           indentidade.getAltura()      + "\n" + 
                           indentidade.getPrimeiroNome()+ "\n" +
                           indentidade.getUltimoNome()  + "\n" + 
                           indentidade.getNaturalidade());
        
        System.out.println(embalagem.getVolume());
         
    }
}
