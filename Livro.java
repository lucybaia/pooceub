package exercicio1;

public class Livro extends ItemBiblioteca {

	private String autor;
	private int numero_paginas;
	private String isbn;
	
    public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumero_paginas() {
		return numero_paginas;
	}

	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

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