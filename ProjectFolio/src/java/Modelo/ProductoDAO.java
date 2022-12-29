/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daya_
 */
public class ProductoDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
     public List listar(){
        String sql="select * from producto";
        List<Producto>lista=new ArrayList<>();
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Producto pr=new Producto();
                pr.setId(rs.getInt(1));
                pr.setProducto(rs.getString(2));
                pr.setCantidad(rs.getInt(3));
                pr.setPreciou(rs.getDouble(4));
                pr.setTotal(rs.getDouble(5));
                lista.add(pr);
            }
        } catch (Exception e) {
        }
        return lista;
    }
     
     
     public Producto listarId(int id){
        Producto pr=new Producto();
        String sql="select * from producto where id="+id;
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                pr.setId(rs.getInt(1));
                pr.setProducto(rs.getString(2));
                pr.setCantidad(rs.getInt(3));
                pr.setPreciou(rs.getDouble(4));
                pr.setTotal(rs.getDouble(5));             
            }
        } catch (Exception e) {
        }
        return pr;
    }
     
     
     
}
