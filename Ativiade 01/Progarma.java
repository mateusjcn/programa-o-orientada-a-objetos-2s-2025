public class Programa {
    private String nome;
    private int memoriaRAMAlocada; 
    private int tamanhoSSDOcupado; 
    private int quantidadeOperacoes;

    public Programa(String nome, int memoriaRAMAlocada, int tamanhoSSDOcupado, int quantidadeOperacoes) {
        this.nome = nome;
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.tamanhoSSDOcupado = tamanhoSSDOcupado;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    
    public void executarPrograma(Computador computador, SistemaOperacional so) {
        if (tamanhoSSDOcupado > computador.getArmazenamento() - so.getTamanhoSSDOcupado()) {
            System.out.println("Erro: espaço insuficiente para instalar " + nome);
            return;
        }

        if (memoriaRAMAlocada > computador.getMemoriaRAM()) {
            System.out.println("Erro: memória insuficiente para executar " + nome);
            return;
        }

        double tempoExecucao = (double) quantidadeOperacoes / (computador.getOperacoesPorSegundo() * computador.getNucleosCPU());
        System.out.println("Programa " + nome + " executado com sucesso!");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos");
    }

    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getMemoriaRAMAlocada() { return memoriaRAMAlocada; }
    public void setMemoriaRAMAlocada(int memoriaRAMAlocada) { this.memoriaRAMAlocada = memoriaRAMAlocada; }

    public int getTamanhoSSDOcupado() { return tamanhoSSDOcupado; }
    public void setTamanhoSSDOcupado(int tamanhoSSDOcupado) { this.tamanhoSSDOcupado = tamanhoSSDOcupado; }

    public int getQuantidadeOperacoes() { return quantidadeOperacoes; }
    public void setQuantidadeOperacoes(int quantidadeOperacoes) { this.quantidadeOperacoes = quantidadeOperacoes; }
}
