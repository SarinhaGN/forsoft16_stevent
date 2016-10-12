/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stevent.model.atleta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import stevent.util.FabricaDeConexoes;

/**
 *
 * @author Yuri Pereira
 */
public class AtletaDAO {

    public void inserir(Atleta atleta) {

        Connection con = null;
        try {

            con = FabricaDeConexoes.conectar();
            String sql = "INSERT INTO atletas "
                    + "(Id, Nome, Email, Senha) VALUES (?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, atleta.getId());
            ps.setString(2, atleta.getNome());
            ps.setString(3, atleta.getEmail());
            ps.setString(4, atleta.getSenha());
//        ps.setString(5, atleta.getNumeroDocumento());

            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            FabricaDeConexoes.desconectar(con);
        }
    }

    public List<Atleta> listar() {

        List<Atleta> retorno = new ArrayList<Atleta>();
        Connection con = null;

        try {
            con = FabricaDeConexoes.conectar();

            String sql = "SELECT * FROM atletas ORDER BY Id";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Atleta atleta = new Atleta();
                atleta.setId(rs.getInt("id"));
                atleta.setNome(rs.getString("Nome"));
                atleta.setEmail(rs.getString("email"));
                atleta.setSenha(rs.getString("senha"));
//                atleta.setNumeroDocumento(rs.getString("numeroDocumento"));
                retorno.add(atleta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            FabricaDeConexoes.desconectar(con);
        }

        return retorno;
    }

    public void alterar(Atleta atleta) {

        Connection con = null;
        try {

            con = FabricaDeConexoes.conectar();
            String sql = "Update atletas set Nome=?,Email=?,"
                    + "Senha=? where Id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, atleta.getNome());
            ps.setString(2, atleta.getEmail());
            ps.setString(3, atleta.getSenha());
            ps.setInt(4, atleta.getId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    public void excluir(int id) {

        Connection con = null;
        try {
            con = FabricaDeConexoes.conectar();

            PreparedStatement ps = con.prepareStatement("DELETE from atletas where Id=?");
            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

    public Atleta buscarPorId(int Id) {

        Connection con = null;
        try {
            con = FabricaDeConexoes.conectar();
            String sql = "SELECT * from atletas where id";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            Atleta atleta = new Atleta();
            ps.setInt(1, Id);
            rs = ps.executeQuery();
            while (rs.next()) {
                atleta.setId(rs.getInt("id"));
                atleta.setNome(rs.getString("nome"));
                atleta.setEmail(rs.getString("email"));
                atleta.setEmail(rs.getString("senha"));

            }
            rs.close();
            ps.close();
            return atleta;

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            FabricaDeConexoes.desconectar(con);

        }
        return null;
    }

}
