package org.example;

public class PrecoAdapter extends PrecoDolar{

    private IPreco precoReal;

    public PrecoAdapter(IPreco precoReal) { this.precoReal = precoReal; }

    public float recuperarPreco() {
        return precoReal.setPreco(this.getPrecoDolar() / 5.00f);
    }

    public void salvarPreco(){
        this.setPrecoDolar(precoReal.getPreco() * 5.000f);
    }
}
