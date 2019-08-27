package listaheranca;


public class TelefoneFixo extends Telefone{
    private int comprimentoCabo;
    private boolean isTemBase;

    public TelefoneFixo(int comprimentoCabo, boolean isTemBase, String cor, String tamanho) {
        super(cor, tamanho);
        this.comprimentoCabo = comprimentoCabo;
        this.isTemBase = isTemBase;
    }
    
    public int getComprimentoCabo() {
        return comprimentoCabo;
    }

    public void setComprimentoCabo(int comprimentoCabo) {
        this.comprimentoCabo = comprimentoCabo;
    }

    public boolean isIsTemBase() {
        return isTemBase;
    }

    public void setIsTemBase(boolean isTemBase) {
        this.isTemBase = isTemBase;
    }
    
    
}
