public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador("Dell", "Inspiron", 8000, 500, 4, 1000);
        SistemaOperacional so = new SistemaOperacional("Linux", "Ubuntu 22.04", 20);

        Programa prog1 = new Programa("EditorTexto", 2000, 2, 5000); 
        Programa prog2 = new Programa("JogoPesado", 16000, 50, 100000); 
        Programa prog3 = new Programa("EditorVideo", 4000, 600, 80000); 

        prog1.executarPrograma(pc, so);
        prog2.executarPrograma(pc, so);
        prog3.executarPrograma(pc, so);
    }
}

