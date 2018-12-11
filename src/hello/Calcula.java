/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

/**
 *
 * @author WELLINGTON.RIGONI
 */
public class Calcula {

    public String resto(int a) {
        if (a % 2 == 0) {
            return ("Par" + "\nValor de a:" + a);
        } else {
            return ("Impar" + "\nValor de a:" + a);
        }

    }
}
