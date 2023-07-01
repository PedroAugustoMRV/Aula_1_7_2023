/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.projetc172023;

/**
 *
 * @author aluno
 */
public class Pessoa {
    
     private int idade;
     
     private double peso;
     
     private double altura;
     
     private String primeiroNome;
     
     private String ultimoNome;
     
     private String natularidade;
     
     public void setIdade(int valor){
       idade = valor;
     }
     
     public int getIdade(){
       return idade;
     }
     
     public void setPeso(double valor){
       peso = valor;
     }
     
     public double getPeso(){
       return peso;
     }
     
     public void setAltura(double valor){
       altura = valor;
     }
     
     public double getAltura(){
       return altura;
     }
     
     public void setPrimeroNome(String valor){
       primeiroNome = valor;
     }
     
     public String getPrimeiroNome(){
       return primeiroNome;
     }
     
     public void setUltimoNome(String valor){
       ultimoNome = valor;
     }
     
     public String getUltimoNome(){
       return ultimoNome;
     }
     
      public void setNaturalidade(String valor){
       natularidade = valor;
     }
     
     public String getNaturalidade(){
       return natularidade;
     }
}
