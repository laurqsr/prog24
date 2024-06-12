package aula19;

import java.util.Random;

public class Conta {
    String titular;
    String identificador;
    float saldo;

    void geraIdentificador(){
        char letra = (char) new Random().nextInt(65,91);
        int valor = new Random().nextInt(1000,10000);
        identificador = letra+"_"+valor;
    }

    void depositar(float valor){
        saldo+=valor;
    }
    boolean sacar(float valor){
        if(valor<=saldo){
            saldo-=valor;
            return true;
        }
        return false;
    }
    String verificaSaldo(){
        return "Saldo atual R$ "+String.format("%.2f",saldo);
    }
}
