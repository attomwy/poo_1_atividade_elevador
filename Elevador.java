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
        System.out.println("s porta do elevador abriu");
    }

    public void fecharPorta() {
        this.portaAberta = false;
        System.out.println("A porta do elevador fechou");
    }

    public void subir() {
        if (!this.portaAberta && this.andarAtual < this.totalAndares) {
            this.andarAtual++;
            System.out.println("Subindo para o andar " + this.andarAtual);
        } else {
            System.out.println("Não deu para subir, POrque a porta está aberta ou já estamos no ultimo andar");
        }
    }

    public void descer() {
        if (!this.portaAberta && this.andarAtual > 0) {
            this.andarAtual--;
            System.out.println("Descendo para o andar " + this.andarAtual);
        } else {
            System.out.println("Não deu para descer porque a porta está aberta ou já estamos no térreo");
        }
    }

    public boolean isPortaAberta() {
        return this.portaAberta;
    }

    public int getAndarAtual() {
        return this.andarAtual;
    }
}
