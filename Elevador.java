public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.portaAberta = false;
    }

    public void abrirPorta() {
        this.portaAberta = true;
        System.out.println("Porta ABERTA.");
    }

    public void fecharPorta() {
        this.portaAberta = false;
        System.out.println("Porta FECHADA.");
    }

    public void subir() {
        if (!this.portaAberta && this.andarAtual < this.totalAndares) {
            this.andarAtual++;
            System.out.println("Subindo... Agora estamos no andar " + this.andarAtual);
        } else {
            System.out.println("ERRO: Não é possível subir.");
        }
    }

    public void descer() {
        if (!this.portaAberta && this.andarAtual > 0) {
            this.andarAtual--;
            System.out.println("Descendo... Agora estamos no andar " + this.andarAtual);
        } else {
            System.out.println("ERRO: Não é possível descer.");
        }
    }

    public boolean isPortaAberta() {
        return this.portaAberta;
    }

    public int getAndarAtual() {
        return this.andarAtual;
    }
}
