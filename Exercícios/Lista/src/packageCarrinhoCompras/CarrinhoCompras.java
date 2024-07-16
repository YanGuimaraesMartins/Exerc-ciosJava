package packageCarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

import PackageListaTarefa.ListaTarefa;
import PackageListaTarefa.Tarefa;

public class CarrinhoCompras {
	private List<Item> itemList;

	public CarrinhoCompras() {
		this.itemList = new ArrayList<>();
	}

	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.itemList.add(item);
	}

	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item i: itemList) {
			if(i.getNome().equals(nome)) {
				itensParaRemover.add(i);
			}
		}
		itemList.removeAll(itensParaRemover);
	}
	
	public double calcularValorTotal() {
	    double valorTotal = 0d;
	    if (!itemList.isEmpty()) {
	      for (Item item : itemList) {
	        double valorItem = item.getPreco() * item.getQuantidade();
	        valorTotal += valorItem; 
	      }
	      return valorTotal;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }
	public void exibirItens() {
		System.out.println(this.itemList);
	}
	
	public static void main(String[] args) {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		
		carrinhoCompras.adicionarItem("pão", 2d, 1);	
		carrinhoCompras.adicionarItem("cebola", 5d, 2);
		carrinhoCompras.adicionarItem("carne", 10, 1);
		
		carrinhoCompras.exibirItens();
		 System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
		
	}
	
	
	
}
