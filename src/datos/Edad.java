/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.Scanner;

/**
 *
 * @author Persona1
 */
public class Edad {
    private int ano;
    
//------Constructor
    public Edad(int ano){
        this.ano = ano;
    }
//------Metodos   
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void pedir_ano(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        this.setAno(scanner.nextInt());
        while(this.ano < 0 || this.ano > 100){
            System.out.println("Ingrese una edad valida");
            this.setAno(scanner.nextInt());
        }
    }
    
    public void mensaje(){
        if(this.ano > 0 && this.ano < 14){
            System.out.println("La edad es "+ ano +" es un nino");
        }
        else{
            if(this.ano > 13 && this.ano < 19){
                System.out.println("La edad es "+ ano +" es un adolescente");
            }else{
                if(this.ano > 18 && this.ano < 61){
                    System.out.println("La edad es "+ ano +" es un adulto");
                }else{
                    if(this.ano > 61){
                    System.out.println("La edad es "+ ano +" es un adulto mayor");
                    }  
                }
            }
        }
    }
                
    
    public static void main(String[] args){
        Edad edad = new Edad(0);
        edad.pedir_ano();
        edad.mensaje();
    }
}
