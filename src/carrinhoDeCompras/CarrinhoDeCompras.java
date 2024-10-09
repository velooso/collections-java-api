package carrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item  = new Item(nome, preco, quantidade);
        itemList.add(item);
    }

    public void removerItem(String nome){
            List<Item>  itemRemoveList = new ArrayList<>();
            for (Item r : itemList){
                if (r.getNome().equalsIgnoreCase(nome)){
                    itemRemoveList.add(r);
                }
            }
            itemList.removeAll(itemRemoveList);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        for (Item item : itemList){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItems(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        c.adicionarItem("Isopor", 2.5, 5);
        c.adicionarItem("Vassoura", 5.5, 5);
        c.exibirItems();
        c.removerItem("Vassoura");
        c.exibirItems();
        System.out.println("O valor dos itens é: " + c.calcularValorTotal());
    }
}
