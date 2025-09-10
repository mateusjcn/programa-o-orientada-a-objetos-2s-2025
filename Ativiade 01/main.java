public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador("Dell", "Inspiron", 8000, 500, 4, 1000);
        SistemaOperacional so = new SistemaOperacional("Linux", "Ubuntu 22.04", 20);

        Programa programa1 = new Programa("EditorTexto", 2000, 2, 5000); 
        Programa programa2 = new Programa("JogoPesado", 16000, 50, 100000); 
        Programa programa3 = new Programa("EditorVideo", 4000, 600, 80000); 

        programa1.executarPrograma(pc, so);
        programa2.executarPrograma(pc, so);
        programa3.executarPrograma(pc, so);
    }
}

