package com.clase10.ejercicio2;

public class Cuenta {

    private Titular titular;
    private float saldo;


    public Cuenta(Titular titular) {
        this.titular = titular;
    }
    public Titular getTitular() {
        return this.titular;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String depositar(float deposito){

        if(deposito <= 0) return "Error: no se pudo completar el deposito";

       this.saldo += deposito;
        return "Deposito Excitoso";
    }

    public String retirar(float retiro) {

        if(retiro > saldo || retiro < 0) return "Error: no se pudo completar el retiro por saldo insufiente o retiro incorrecto";

        this.saldo -= retiro;
        return "Retiro Excitoso";
    }

    public  String mostrar() {
        return "Datos de la cuenta" + "\n" +
                         getTitular().toString() + "Saldo de la cuenta: " + getSaldo() +"\n"+
                    "------------------------------------------------- \n";
    }
}
