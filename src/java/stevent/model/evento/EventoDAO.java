package stevent.model.evento;

import stevent.util.FabricaDeConexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EventoDAO {

    public List<Evento> listar() {

        List<Evento> retorno = new ArrayList<Evento>();
        Connection con = null;

        try {

            con = FabricaDeConexoes.conectar();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM Equipe ORDER BY nome";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                Evento evento = new Evento();
                evento.setId(rs.getInt("ID"));
//                equipe.setNome(rs.getString("NOME"));
//               equipe.getModalidade().getId();
//               equipe.setAtletas((List<Atleta>) rs.getArray("atleta"));

                retorno.add(evento);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            FabricaDeConexoes.desconectar(con);

        }

        return retorno;
    }

    public void inserir(Evento evento) {

        Connection con = null;

        try {

            con = FabricaDeConexoes.conectar();
            String sql = "INSERT INTO contatos (nome , modalidade,atleta) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, evento.getNome());
//            ps.setInt (2,equipe.getModalidade().getId());
//            ps.setArray(3, (Array) equipe.getAtletas());
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            FabricaDeConexoes.desconectar(con);

        }

    }

    public void alterar(Evento evento) {

        Connection con = null;

        try {
            con = FabricaDeConexoes.conectar();
            String sql = "UPDATE contatos SET nome = ?,= Modalidade?, atleta = ? where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, evento.getNome());
//            ps.setInt(2, equipe.getModalidade().getId());
//            ps.setArray(3, (Array) equipe.getAtletas());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            FabricaDeConexoes.desconectar(con);

        }
    }

    public Evento obterPorId(int id) {

        Evento retorno = new Evento();
        Connection con = null;

        try {

            con = FabricaDeConexoes.conectar();
            String sql = "SELECT * FROM Equipe WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                retorno.setId(rs.getInt("ID"));
                retorno.setNome(rs.getString("NOME"));
//                retorno.getModalidade().getId();
//                retorno.setAtletas((List<Atleta>) rs.getArray("atleta"));
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            FabricaDeConexoes.desconectar(con);

        }

        return retorno;
    }

    public void excluir(int id) {

        Connection con = null;

        try {

            con = FabricaDeConexoes.conectar();
            String sql = "DELETE FROM Equipe WHERE id = ?";
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
