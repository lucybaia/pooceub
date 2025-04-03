package exercicio1;

public class ItemBiblioteca {

	private String titulo;
	private int ano_publicacao;
	private boolean disponivel;

	
	
	public ItemBiblioteca(String titulo, int ano_publicacao, boolean disponivel) {
		this.titulo = titulo;
		this.ano_publicacao = ano_publicacao;
		this.disponivel = disponivel;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAnoPublicacao(int ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public ItemBiblioteca() {
		this.disponivel = true;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public String getTitulo() {
		return titulo;
	}

	public void emprestar() {
		if (disponivel) {
			disponivel = false;
			System.out.println("Livro emprestado.");
		} else {
			System.out.println("Livro não disponível.");
		}
	}

	public void devolver() {
		disponivel = true;
		System.out.println("Livro devolvido.");
	}

	public String detalhes() {
		return "Título: " + titulo + "\n" + "Ano de Publicação: " + ano_publicacao + "\n" + "Disponível: "
				+ (disponivel ? "Sim" : "Não");
	}

	public static void main(String[] args) {
		Livro livroUm = new Livro("Garota Exemplar", 2013, true, "Gillian Flynn", 448, "978-8580572902");
		Livro livroDois = new Livro("Igreja Punhal", 1984, false, "Lion Kacur", 474, "978-8534572902");
		Revista revistaUm = new Revista("Capricho", 2024, false, 1212, "Mensal", "Abril");
		Revista revistaDois = new Revista("Anna Lia", 2006, true, 19, "Anual", "Luciana");
		System.out.println(livroUm.detalhes());
		System.out.println("\n" + revistaUm.detalhes());
		System.out.println("\n" + revistaDois.detalhes());
		System.out.println("\n" + livroDois.detalhes());
	}
}