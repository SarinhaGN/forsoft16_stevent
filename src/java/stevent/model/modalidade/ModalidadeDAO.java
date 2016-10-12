package stevent.model.modalidade;

import stevent.util.FabricaDeConexoes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ModalidadeDAO {

    public List<Modalidade> listar() {

        List<Modalidade> retorno = new ArrayList<Modalidade>();

        Connection con = null;

        try {

            con = FabricaDeConexoes.conectar();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM contatos ORDER BY nome";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                Modalidade modalidade = new Modalidade();
                modalidade.setId(rs.getInt("ID"));
                modalidade.setNome(rs.getString("NOME"));
                retorno.add(modalidade);
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            FabricaDeConexoes.desconectar(con);

        }

        return retorno;
    }

    public void inserir(Modalidade modalidade) {

        Connection con = null;

        try {

            con = FabricaDeConexoes.conectar();
            String sql = "INSERT INTO Modalidade (nome) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, modalidade.getNome());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            FabricaDeConexoes.desconectar(con);

        }

    }

    public void alterar(Modalidade modalidade) {

        Connection con = null;

        try {
            con = FabricaDeConexoes.conectar();
            String sql = "UPDATE Modalidade SET nome = ? where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, modalidade.getNome());
            ps.setInt(2, modalidade.getId());

            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            FabricaDeConexoes.desconectar(con);

        }
    }

    public Modalidade obterPorId(int id) {

        Modalidade retorno = new Modalidade();
        Connection con = null;

        try {

            con = FabricaDeConexoes.conectar();
            String sql = "SELECT * FROM Modalidade WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                retorno.setId(rs.getInt("ID"));
                retorno.setNome(rs.getString("NOME"));

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
            String sql = "DELETE FROM Modalidade WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            FabricaDeConexoes.desconectar(con);

        }

    }
}
