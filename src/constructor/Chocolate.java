/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author Alumno
 */
//ejemplo constructor caja de chocolates
public  class Chocolate {
    /*
    Variables de instancia
    */
    String color ="negro";
    int cantidad = 0;
    int base = 0;
    int altura = 0;
    double area = 0;
    String sabor = "amargo";
    int precio = 0; 
    
    /**
     * 
     * @param base Base de la caja
     * @param altura altura de la caja
     */
    Chocolate(int altura, int base){
        this.base = base;
        this.altura = altura;
    }
/**
     * 
     * @param base Base de la caja
     * @param altura altura de la caja
     * @param area area de la caja
     */
    Chocolate(int altura, int base, double area){
        this.area = base*altura;
    }
    /**
     * 
     * @param color color del chocolate
     * @param sabor sabor del chocolate
     */
    Chocolate(String color, String sabor){
        this.color = color;
        this.sabor = sabor;
    }
     /**
     * 
     * @param precio Precio de caja
     */
    Chocolate(int precio){
        this.precio = precio;
    }

}

