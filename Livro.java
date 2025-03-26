package exc1;

public class Livro extends ItemBiblioteca {
	public String autor;
	public int numero_paginas;
	public String isbn;

    public Livro(String titulo, int ano_publicacao, boolean disponivel, String autor, int numero_paginas, String isbn) {
        super(titulo, ano_publicacao, disponivel);
        this.autor = autor;
        this.numero_paginas = numero_paginas;
        this.isbn = isbn;
    }

    public String detalhes() {
        return super.detalhes() + "\n" +
               "Autor: " + autor + "\n" +
               "Número de Páginas: " + numero_paginas + "\n" +
               "ISBN: " + isbn;
    }
}
