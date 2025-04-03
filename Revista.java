package exercicio1;

public class Revista extends ItemBiblioteca{
	
	private int numero;
	private String periocidade;
	private String editora;

    public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriocidade() {
		return periocidade;
	}

	public void setPeriocidade(String periocidade) {
		this.periocidade = periocidade;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Revista(String titulo, int ano_publicacao, boolean disponivel, int numero, String periocidade, String editora) {
        super(titulo, ano_publicacao, disponivel);
        this.numero = numero;
        this.periocidade = periocidade;
        this.editora = editora;
    }

    public String detalhes() {
        return super.detalhes() + "\n" +
               "Numero de edição: " + numero + "\n" +
               "Periocidade: " + periocidade + "\n" +
               "Editora: " + editora;
    }
}
