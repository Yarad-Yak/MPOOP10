/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10Exceptions;


/**
 *
 * @author Yarad Yamil
 */
public class Cajero {
    public static void main(String[] args){
        try {
            Cuenta cuenta = new Cuenta();
            cuenta.getSaldo();
            cuenta.depositar(1000);
            cuenta.getSaldo();
            cuenta.retirar(500);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
        } catch (SaldoInsuficienteException sie) {
            System.out.println("No cuentas con el saldo suficiente");
            //Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, sie);
        }
    }
}
