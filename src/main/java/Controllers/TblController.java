/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Pojo.Producto;
import javax.swing.table.DefaultTableModel;
import Main.FacturaDemo;
/**
 *
 * @author Sistemas-32
 */
public class TblController {
    private FacturaDemo facturaDemo;
    private Producto p;
    private final String Tbl[] = new String[]{"Código", "Nombre", "Cantidad", "Precio", "Sub-Total"};
    private DefaultTableModel defaultTableModel;
    
    private void initComponent(){
        facturaDemo.getBtnAdd().addActionListener((e) -> AddButton());
    }
    private void AddButton(){
        int Codigo;
        float Precio;
        String Nombre, Cantidad;
        Codigo = Integer.parseInt(facturaDemo.getTxtCodigo().getText());
        Cantidad = facturaDemo.getSpnCantidad().getValue().toString();
        Precio = Float.parseFloat(facturaDemo.getFrtxtPrecio().getText());
        Nombre = facturaDemo.getTxtNombre().getText();
        p = new Producto(Codigo, Nombre, Cantidad, Precio);
        int i = 0;
        String M[][]= new String[i][5];
        M[i][0] = Integer.toString(p.getNoCodigo());
        M[i][1] = p.getNombre();
        M[i][2] = p.getCantidad();
        M[i][3] = Float.toString(p.getPrecio());
        
        defaultTableModel = new DefaultTableModel(M, Tbl);
        i++;
    }
}
