package listaheranca;


public class TelefoneCelular extends Telefone{
    private String modeloBateria;
    private Frequencia frequencia;

    public TelefoneCelular(String modeloBateria, Frequencia frequencia, String cor, String tamanho) {
        super(cor, tamanho);
        this.modeloBateria = modeloBateria;
        this.frequencia = frequencia;
    }

    public String getModeloBateria() {
        return modeloBateria;
    }

    public void setModeloBateria(String modeloBateria) {
        this.modeloBateria = modeloBateria;
    }

    public Frequencia getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Frequencia frequencia) {
        this.frequencia = frequencia;
    }
    
    
    
}
