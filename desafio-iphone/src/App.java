import models.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
    	IPhone iPhone1 = new IPhone();
    	
    	String numero = "99864-4013";
    	
    	iPhone1.ligar(numero);
    	iPhone1.atender();
    	iPhone1.iniciarCorreioVoz();
    	
    	iPhone1.tocar();
    	iPhone1.pausar();
    	iPhone1.selecionarMusica("paradise");
    	
    	iPhone1.exibirPagina("www.apple.com");
    	iPhone1.adicionarNovaAba();
    	iPhone1.atualizarPagina();
    	
    	
    }
}
