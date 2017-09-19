package newpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private List<ItemPedido> itens;
    private Cliente cliente;
    private LocalDate data;

    public Pedido(int id, LocalDate data, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        itens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<ItemPedido> getItens() {
        return itens;
    }
    
    public boolean addItem(ItemPedido item){
        return itens.add(item);
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", itens=" + itens + ", cliente=" + cliente + ", data=" + data + '}';
    }
    
    public float calcularTotal(){
        float total = 0;
        for(ItemPedido item : itens){
            total+=item.calcularSubtotal();
        }
        return total;
    }
    
}
