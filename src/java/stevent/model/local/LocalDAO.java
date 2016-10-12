package stevent.model.local;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import stevent.model.local.Local;
import stevent.util.FabricaDeConexoes;

public class LocalDAO {

    public List<Local> listar(){
        
        List<Local> retorno = new ArrayList<Local>();
        Connection con = null;
        
      
        try {
        
            con = FabricaDeConexoes.conectar();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM local ORDER BY nome";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                
                Local local = new Local();
                local.setId(rs.getInt("ID"));
                local.setNome(rs.getString("NOME"));
                local.setEstado(rs.getString("ESTADO"));
                local.setCidade(rs.getString("CIDADE"));
                local.setBairro(rs.getString("BAIRRO"));
                local.setCep(rs.getString("CEP"));
                local.setEndereco(rs.getString("ENDERECO"));
                local.setNumero(rs.getString("NUMERO"));
                local.setComplemento(rs.getString("COMPLEMENTO"));
                retorno.add(local);
            }
            
         } catch (Exception e) {
             e.printStackTrace();
             
        } finally {     
            FabricaDeConexoes.desconectar(con);
            
        }
        
        return retorno;
    }
    

    
    public void inserir(Local local){
        
        Connection con = null;
      
        try {
  
            con = FabricaDeConexoes.conectar();
            String sql = "INSERT INTO local (nome, estado, cidade, bairro, cep, endereco, numero, complemento) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, local.getNome());
            ps.setString(2, local.getEstado());
            ps.setString(3, local.getCidade());
            ps.setString(4, local.getBairro());
            ps.setString(5, local.getCep());
            ps.setString(6, local.getEndereco());
            ps.setString(7, local.getNumero());
            ps.setString(8, local.getComplemento());
            ps.executeUpdate();
            
            
         } catch (Exception e) {
             e.printStackTrace();
             
        } finally {     
            FabricaDeConexoes.desconectar(con);
            
        }
       
    }

    
    public void alterar(Local local){
        
        Connection con = null;
        
        try {
            con = FabricaDeConexoes.conectar();
            String sql = "UPDATE local SET nome = ?, estado = ?, cidade = ?, bairro = ?, cep = ?, endereco = ?, numero = ?, complemento = ? where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, local.getNome());
            ps.setString(2, local.getEstado());
            ps.setString(3, local.getCidade());
            ps.setString(4, local.getBairro());
            ps.setString(5, local.getCep());
            ps.setString(6, local.getEndereco());
            ps.setString(7, local.getNumero());
            ps.setString(8, local.getComplemento());
            ps.setInt(9, local.getId() );  
            
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {     
            FabricaDeConexoes.desconectar(con);
            
        }
    }
    
    public Local obter(int id){
        
        Local retorno = new Local();
        Connection con = null;
      
        try {
  
            con = FabricaDeConexoes.conectar();
            String sql = "SELECT * FROM local WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                                
                retorno.setId(rs.getInt("ID"));
                retorno.setNome(rs.getString("NOME"));
                retorno.setEstado(rs.getString("ESTADO"));
                retorno.setCidade(rs.getString("CIDADE"));
                retorno.setBairro(rs.getString("BAIRRO"));
                retorno.setCep(rs.getString("CEP"));
                retorno.setEndereco(rs.getString("ENDERECO"));
                retorno.setNumero(rs.getString("NUMERO"));
                retorno.setComplemento(rs.getString("COMPLEMENTO"));
            }
            
         } catch (Exception e) {
             e.printStackTrace();
             
        } finally {     
            FabricaDeConexoes.desconectar(con);
            
        }
        
        return retorno;
    }
    
    public void excluir(int id){
        
        Connection con = null;
      
        try {
  
            con = FabricaDeConexoes.conectar();
            String sql = "DELETE FROM local WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            
         } catch (Exception e) {
             e.printStackTrace();
             
        } finally {     
            FabricaDeConexoes.desconectar(con);
            
        }
        
    }
    

    
}//class