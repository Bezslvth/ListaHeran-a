/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaheranca;


public class Telefone {
    private String cor;
    private String formato;   

    public Telefone(String cor, String tamanho) {
        this.cor = cor;
        this.formato = formato;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getformato() {
        return formato;
    }

    public void setformato(String tamanho) {
        this.formato = formato;
    }   
    
}
