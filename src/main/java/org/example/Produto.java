package org.example;

public class Produto {

    IPreco preco;
    PrecoAdapter persistencia;

    public Produto(){
        preco = new PrecoReal();
        persistencia = new PrecoAdapter(preco);
    }

    public void setPreco(float precoDolar){
        preco.setPreco(precoDolar);
        persistencia.salvarPreco();
    }

    public float getPreco(){ return persistencia.recuperarPreco();}

    public float getPrecoDolar(){ return persistencia.getPrecoDolar(); }
}
