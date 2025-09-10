public class SistemaOperacional {
    private String nome;
    private String versao;
    private int tamanhoSSDOcupado; 

    public SistemaOperacional(String nome, String versao, int tamanhoSSDOcupado) {
        this.nome = nome;
        this.versao = versao;
        this.tamanhoSSDOcupado = tamanhoSSDOcupado;
    }

    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getVersao() { return versao; }
    public void setVersao(String versao) { this.versao = versao; }
    public int getTamanhoSSDOcupado() { return tamanhoSSDOcupado; }
    public void setTamanhoSSDOcupado(int tamanhoSSDOcupado) { this.tamanhoSSDOcupado = tamanhoSSDOcupado; }
}
