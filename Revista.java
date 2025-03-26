package exc1;

public class Revista extends ItemBiblioteca {
	public int numero;
	public String periocidade;
	public String editora;

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
