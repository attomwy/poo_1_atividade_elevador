public class Main {
    public static void main(String[] args) {
        // Criando um elevador em um prédio de 5 andares
        Elevador meuElevador = new Elevador(5);

        System.out.println("--- TESTANDO O ELEVADOR ---");
        
        // Tentando subir com a porta aberta (Tem que dar erro!)
        meuElevador.abrirPorta();
        meuElevador.subir(); 
        
        // Fechando e subindo (Tem que funcionar)
        meuElevador.fecharPorta();
        meuElevador.subir();
        meuElevador.subir();
        
        // Mostrando o andar atual através do painel (Getter)
        System.out.println("Andar verificado no painel: " + meuElevador.getAndarAtual());
        
        // Descendo
        meuElevador.descer();
    }
}