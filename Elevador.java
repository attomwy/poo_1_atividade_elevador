public class Elevador {

    // atributos privados
    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    // construtor define total de andares e estado inicial
    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // começa no térreo
        this.portaAberta = false; // porta inicia fechada
    }

    // abre a porta
    public void abrirPorta() {
        this.portaAberta = true;
        System.out.println("Porta ABERTA.");
    }

    // fecha a porta
    public void fecharPorta() {
        this.portaAberta = false;
        System.out.println("Porta FECHADA.");
    }

    // sobe se porta fechada e não estiver no último andar
    public void subir() {
        if (!this.portaAberta && this.andarAtual < this.totalAndares) {
            this.andarAtual++;
            System.out.println("Subindo... Agora estamos no andar " + this.andarAtual);
        } else {
            System.out.println("ERRO: Não é possível subir. Verifique se a porta está fechada ou se já está no último andar.");
        }
    }

    // desce se porta fechada e não estiver no térreo
    public void descer() {
        if (!this.portaAberta && this.andarAtual > 0) {
            this.andarAtual--;
            System.out.println("Descendo... Agora estamos no andar " + this.andarAtual);
        } else {
            System.out.println("ERRO: Não é possível descer. Verifique se a porta está fechada ou se já está no térreo.");
        }
    }

    // retorna se a porta está aberta
    public boolean isPortaAberta() {
        return this.portaAberta;
    }

    // retorna o andar atual
    public int getAndarAtual() {
        return this.andarAtual;
    }
}