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
public class UsuarioDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuario validar(String user, String pass){
        Usuario us=new Usuario();
        String sql="select * from Usuarios where ingresoUsuario=? and ingresoContrasenia=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,pass);
            rs=ps.executeQuery();
            while(rs.next()){
                us.setNom(rs.getString("ingresoUsuario"));
                us.setContra(rs.getString("ingresoContrasenia"));
            }
        }catch(Exception e){
            
        }
        return us;
    }   
    
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
}
