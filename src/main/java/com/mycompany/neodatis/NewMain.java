package com.mycompany.neodatis;

import java.time.LocalDate;
import newpackage.Cliente;
import newpackage.ItemPedido;
import newpackage.Pedido;
import newpackage.Produto;
import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;

public class NewMain {

    public static void main(String[] args) {

        ODB odb = ODBFactory.open("aula.odb", "odb", "123456");

//        Cliente c = new Cliente(1, "João");
//
//        Produto p1 = new Produto(1, "Teclado", 50);
//        Produto p2 = new Produto(2, "Mouse", 30);
//        Produto p3 = new Produto(3, "Cabo HDMI", 40);
//
//        Pedido p = new Pedido(1, LocalDate.now(), c);
//        p.addItem(new ItemPedido(1, p1, 1));
//        p.addItem(new ItemPedido(2, p2, 1));
//        p.addItem(new ItemPedido(3, p3, 1));
//
//        odb.store(p);

        IQuery query = new CriteriaQuery(Pedido.class);
        Objects<Pedido> pedidos = odb.getObjects(query);
        
        while(pedidos.hasNext()){
            System.out.println(pedidos.next());
        }
        
        odb.close();

    }

}
