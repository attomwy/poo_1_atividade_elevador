public class Main {
    public static void main(String[] args) {
        Elevador meuElevador = new Elevador(5);

        System.out.println("--- TESTANDO O ELEVADOR ---");
        
        meuElevador.abrirPorta();
        meuElevador.subir(); 
        
        meuElevador.fecharPorta();
        meuElevador.subir();
        meuElevador.subir();
        
        System.out.println("Andar verificado no painel: " + meuElevador.getAndarAtual());
        
        meuElevador.descer();
    }
}
