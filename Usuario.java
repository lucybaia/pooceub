package exercicio1;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id_usuario;
    private ArrayList<ItemBiblioteca> itens_emprestados
    			= new ArrayList<ItemBiblioteca>();

   public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

    public void emprestarItem(ItemBiblioteca item) {
        if (item != null && item.isDisponivel()) {
            itens_emprestados.add(item);
            item.setDisponivel(false);
            System.out.println(nome + " emprestou o item: " + item.getTitulo());
        } else {
            System.out.println("Item não disponível para empréstimo.");
        }
    }
}