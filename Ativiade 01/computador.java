public class Computador {
    private String marca;
    private String modelo;
    private int memoriaRAM; 
    private int armazenamento; 
    private int nucleosCPU;
    private int operacoesPorSegundo;

    public Computador(String marca, String modelo, int memoriaRAM, int armazenamento, int nucleosCPU, int operacoesPorSegundo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.nucleosCPU = nucleosCPU;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

   
    public String getMarca() { return marca;}
 public void setMarca(String marca) { this.marca = marca;}

    public String getModelo() { return modelo; }
public void setModelo(String modelo) { this.modelo = modelo;}

    public int getMemoriaRAM() { return memoriaRAM;}
public void setMemoriaRAM(int memoriaRAM) { this.memoriaRAM = memoriaRAM;}

    public int getArmazenamento() { return armazenamento;}
    public void setArmazenamento(int armazenamento) { this.armazenamento = armazenamento;}
    public int getNucleosCPU() { return nucleosCPU}
    public void setNucleosCPU(int nucleosCPU) { this.nucleosCPU = nucleosCPU;}
    public int getOperacoesPorSegundo() { return operacoesPorSegundo; }
    public void setOperacoesPorSegundo(int operacoesPorSegundo) { this.operacoesPorSegundo = operacoesPorSegundo;}
}
