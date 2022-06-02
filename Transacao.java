package Transacao;
import java.util.Date;

public class Transacao{
    double valor;
    Date data=new Date();
    String tipo;
    String referencia;
    
    Transacao(double valor, String tipo){
        this.valor = valor;
        this.tipo = tipo;
}
}