/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Bean.AlunoBean;
import Conexao.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Guilherme Bialas
 */
public class AlunoDAO {

    public int inserir(AlunoBean aluno) throws SQLException {
        Connection conexao = ConexaoFactory.obterConexao();
        if (conexao != null) {
            String sql = "INSERT INTO alunos"
                    + "\n(id, nome, nota_1, nota_2, nota_3, media, frquencia, codigo_matricula)"
                    + "\nVALUES(?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setInt(1, aluno.getId());
                ps.setString(2, aluno.getNome());
                ps.setString(3, aluno.getCodigoMatricula());
                ps.setFloat(4, aluno.getNota1());
                ps.setFloat(5, aluno.getNota2());
                ps.setFloat(6, aluno.getNota3());
                ps.setFloat(7, aluno.getMedia());
                ps.setByte(8, aluno.getFrequencia());
                ps.execute();
                ResultSet resultSet = ps.getGeneratedKeys();
                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoFactory.fecharConexao();
            }

        }
        return 0;
    }

    public boolean alterar(AlunoBean aluno) {
        Connection conexao = ConexaoFactory.obterConexao();
        String sql = "UPDATE alunos SET nome = ?, nota_1 = ?, nota_2 = ?, nota_3 = ?, media = ?, codigo_matricula = ?, frequencia = ? WHERE id = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setFloat(2, aluno.getNota1());
            ps.setFloat(3, aluno.getNota2());
            ps.setFloat(4, aluno.getNota3());
            ps.setFloat(5, aluno.getMedia());
            ps.setByte(6, aluno.getFrequencia());
            ps.setString(7, aluno.getCodigoMatricula());
            ps.setInt(8, aluno.getId());
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConexaoFactory.fecharConexao();
        }
        return false;
    }

    public boolean apagar(int id) {
        Connection conexao = ConexaoFactory.obterConexao();
        String sql = "DELETE FROM alunos WHERE id = ?;";
        if (conexao != null) {
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, id);
                return ps.executeUpdate() == 1;
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                ConexaoFactory.fecharConexao();
            }
        }
        return false;
    }

}
