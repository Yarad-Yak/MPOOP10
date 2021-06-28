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
public class Cuenta {
    
    private double saldo;

    Cuenta() {
        saldo=0;
    }
    
    public void depositar(double monto){
        System.out.println("Depositando"+monto);
        saldo+=monto;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Tratando de retirar"+monto);
        if(saldo < monto){
            throw new SaldoInsuficienteException();
        }else{
            saldo-=monto;
        }
        
    }

    public double getSaldo() {
        System.out.println("Saldo"+saldo);
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
}
