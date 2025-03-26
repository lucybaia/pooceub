package exc1;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends ItemBiblioteca {
	
	public String nome;
	public int id_usuario;
	public List<ItemBiblioteca> itens_emprestados;
	
	 public Usuario(String nome, int id_usuario) {
	        this.nome = nome;
	        this.id_usuario = id_usuario;
	        this.itens_emprestados = new ArrayList<>();
	    }
	 
	    public String getNome() {
	        return nome;
	    }

	    public int getIdUsuario() {
	        return id_usuario;
	    }

	    public List<ItemBiblioteca> getItensEmprestados() {
	        return itens_emprestados;
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