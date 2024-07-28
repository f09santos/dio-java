package models;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{
	
	public IPhone() {
		
	}
	
	@Override
	public void ligar(String numero) {
		System.out.println("Discando para o numero:" + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada.");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Gravando correio de voz.");
		
	}
	@Override
	public void tocar() {
		System.out.println("Apple music: tocando música.");
		
	}
	
	@Override
	public void pausar() {
		System.out.println("Apple music: música pausada.");
		
	}
	
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Apple music: selecionar música "+ musica);
		
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("Opera: página url - " + url);
		
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("Opera: Adicionando aba.");
		
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("Opera: Atualizar página.");
		
	}
}
