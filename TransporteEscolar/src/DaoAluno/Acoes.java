package DaoAluno;

import Connection.Conexao;
import DtoAluno.Dados;
import Telas.DadosAluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Acoes {

    public boolean cadCliente(Dados dd) /*throws SQLException*/ {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        String sql = "insert into tbAluno (nomeAluno, nomeResp, escolaAluno, horario, rgResp, cpfResp, "
                + "endereco, telResp, telCasa, telComercial, inicio, termino, valorTotal, numParcelas, "
                + "valorParcelas, diaPagamnto) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, dd.getNomeAluno());
            stmt.setString(2, dd.getNomeResp());
            stmt.setString(3, dd.getEscolaAluno());
            stmt.setString(4, dd.getHorario());
            stmt.setString(5, dd.getRgResp());
            stmt.setString(6, dd.getCpfResp());
            stmt.setString(7, dd.getEndereco());
            stmt.setString(8, dd.getTel());
            stmt.setString(9, dd.getTel1());
            stmt.setString(10, dd.getTel2());
            stmt.setString(11, dd.getInicio());
            stmt.setString(12, dd.getTermino());
            stmt.setString(13, dd.getValorT());
            stmt.setString(14, dd.getParcelas());
            stmt.setString(15, dd.getValorP());
            stmt.setString(16, dd.getDiaPaga());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao salvar dados" + e);
            Conexao.closeConnection(con, stmt);

            return false;
        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    /* public void ConsultarDados() {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        String sql = "seletc * from tbAluno";

        try {

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao buscar os Dados" + e);
            Conexao.closeConnection(con, stmt);

        }

    }*/
    public List<Dados> ConsultaDados() {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Dados> listaDados = new ArrayList<>();

        try {

            stmt = con.prepareStatement("select * from tbAluno");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Dados dd = new Dados();

                dd.setCodAluno(rs.getInt("codAluno"));
                dd.setNomeAluno(rs.getString("nomeAluno"));
                dd.setNomeResp(rs.getString("nomeResp"));
                dd.setEscolaAluno(rs.getString("escolaAluno"));
                dd.setHorario(rs.getString("horario"));
                dd.setRgResp(rs.getString("rgResp"));
                dd.setCpfResp(rs.getString("cpfResp"));
                dd.setEndereco(rs.getString("endereco"));
                dd.setTel(rs.getString("telResp"));
                dd.setTel1(rs.getString("telCasa"));
                dd.setTel2(rs.getString("telComercial"));
                dd.setInicio(rs.getString("inicio"));
                dd.setTermino(rs.getString("termino"));
                dd.setValorT(rs.getString("valorTotal"));
                dd.setParcelas(rs.getString("numParcelas"));
                dd.setValorP(rs.getString("valorParcelas"));
                dd.setDiaPaga(rs.getString("diaPagamnto"));

                listaDados.add(dd);

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao buscar os Dados" + e);
            Conexao.closeConnection(con, stmt);

        } finally {
            Conexao.closeConnection(con, stmt, rs);
        }

        return listaDados;
    }

    public void updateCliente(Dados dd) /*throws SQLException*/ {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("update tbAluno a set a.nomeAluno  = ? , a.nomeResp = ?, "
                    + "a.escolaAluno = ?, a.horario = ?, a.rgResp = ?, a.cpfResp = ?,"
                    + "a.endereco = ?, a.telResp = ?, a.telCasa = ?, a.telComercial = ?, "
                    + "a.inicio = ?, a.termino = ?, a.valorTotal = ?, a.numParcelas = ?, "
                    + "a.valorParcelas = ?, a.diaPagamnto = ?  where a.codAluno = ?");

            stmt.setString(1, dd.getNomeAluno());
            stmt.setString(2, dd.getNomeResp());
            stmt.setString(3, dd.getEscolaAluno());
            stmt.setString(4, dd.getHorario());
            stmt.setString(5, dd.getRgResp());
            stmt.setString(6, dd.getCpfResp());
            stmt.setString(7, dd.getEndereco());
            stmt.setString(8, dd.getTel());
            stmt.setString(9, dd.getTel1());
            stmt.setString(10, dd.getTel2());
            stmt.setString(11, dd.getInicio());
            stmt.setString(12, dd.getTermino());
            stmt.setString(13, dd.getValorT());
            stmt.setString(14, dd.getParcelas());
            stmt.setString(15, dd.getValorP());
            stmt.setString(16, dd.getDiaPaga());
            stmt.setInt(17, DadosAluno.cod);

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Alterado com Sucesso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados" + e);

        } finally {
            Conexao.closeConnection(con, stmt);
        }
    }

    public boolean DeleteCliente(Dados dd) {

        Connection con = Conexao.getConnection();
        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("delete from tbAluno where codAluno = ?");
            stmt.setInt(1, DadosAluno.cod);

            int i = JOptionPane.showConfirmDialog(null, "Deseja deletar esse registro?", "TextEditor", 0);

            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Registro Deletado!");
                stmt.executeUpdate();
                return true;
            } else if (i == 1) {
                JOptionPane.showMessageDialog(null, "Registro não Deletado");
                return false;
            }
            //JOptionPane.showConfirmDialog(null, "Deseja deletar esse registro?");
            //JOptionPane.showMessageDialog(null, "Deletado com Sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Deletar" + e);

        } finally {
            Conexao.closeConnection(con, stmt);
        }
        return false;
    }

    public static void retornoJopionPane() {
        int i = JOptionPane.showConfirmDialog(null, "Deseja deletar esse registro?", "TextEditor", 0);

        if (i == 0) {
            JOptionPane.showMessageDialog(null, "Registro Deletado!");
        } else if (i == 1) {
            JOptionPane.showMessageDialog(null, "não salva o arquivo");
        }
    }
}
