/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.parial2.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.parial2.config.Conexion;
import pe.edu.upeu.parial2.dao.UsuarioDao;
import pe.edu.upeu.parial2.model.Usuario;

/**
 *
 * @author SERGESAN PCS2021
 */
public class UsuarioDaoImpl implements UsuarioDao {
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int create(Usuario user) {
        int x=0;
		String SQL="insert into usuarios(username,password) values(?,?)";
		try {
			cx=Conexion.getConex();
			ps=cx.prepareStatement(SQL);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFecha());
		} catch (Exception e) {
			System.out.println("Error:"+e);
		}
		return x;
    }

    @Override
    public int update(Usuario user) {
        int x=0;
		String SQL="update usuarios set username=? where idusuario=?";
		try {
			cx=Conexion.getConex();
			ps=cx.prepareStatement(SQL);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getFecha());
                        
			x=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error:"+e);
		}
		return x;
    }

    @Override
    public int delete(int id) {
        int x=0;
		String SQL="delete from usuarios where idusuario=?";
		try {
			cx=Conexion.getConex();
			ps=cx.prepareStatement(SQL);
			
			ps.setInt(1, id);
			x=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("Error:"+e);
		}
		return x;
    }

    @Override
    public Usuario read(int id) {
        Usuario p=new Usuario();
		String SQL="SELECT *FROM Usuario where idpost=?";
		try {
			cx=Conexion.getConex();
			ps= cx.prepareStatement(SQL);
			ps.setInt(1, id);
			rs =ps.executeQuery();
			while (rs.next()) {
				p.setIdusuario(rs.getInt("idusuario"));
				p.setUsername(rs.getString("username"));
				p.setPassword(rs.getString("password"));
                                p.setIdpersona(rs.getInt("idpersona"));
                                p.setIdrol(rs.getInt("idrol"));
				
			}
		} catch (Exception e) {
			System.out.println("Error:"+e);
		}
		return p;
    }

    @Override
    public List<Usuario> readAll() {
        List<Usuario> lista =new ArrayList<>();
		String SQL="select *from usuarios";
		try {
			cx=Conexion.getConex();
			ps= cx.prepareStatement(SQL);
			rs =ps.executeQuery();
			while (rs.next()) {
				Usuario p=new Usuario();
				p.setIdusuario(rs.getInt("idusuario"));
				p.setUsername(rs.getString("username"));
				p.setPassword(rs.getString("password"));
                                p.setIdpersona(rs.getInt("idpersona"));
                                p.setIdrol(rs.getInt("idrol"));
                                p.setFecha(rs.getString("fechacreacion"));
                                p.setEstado(rs.getBoolean("estado"));
                      
                                
				lista.add(p);
				
			}
					
		} catch (Exception e) {
			System.out.println("Error:"+e);
		}
	
		return lista;
    }

    @Override
    public List<Map<String, Object>> readAll2() {
        List<Map<String, Object>> lista =new ArrayList<>();
        String SQL="select u.idusuario ,u.username ,p.apellidos,p.nombres ,r.nombre"
                + "  from usuarios as u inner join roles as r on u.idrol=r.idrol \n" +
                    "inner join personas as p on u.idpersona=p.idpersona ";
        try {
            cx=Conexion.getConex();
            ps=cx.prepareStatement(SQL);
            rs=ps.executeQuery();
            while (rs.next()) {     
                Map<String, Object> map =new HashMap<>();
                map.put("idusuario", rs.getInt("idusuario"));
                map.put("username", rs.getString("username"));
                map.put("apellidos", rs.getString("apellidos"));
                map.put("nombres", rs.getString("nombres"));
                map.put("rol", rs.getString("nombre"));
                
                lista.add(map);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error :"+e);
        }
        return lista;
    }
    
}
