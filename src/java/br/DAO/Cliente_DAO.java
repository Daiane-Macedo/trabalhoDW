/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.DAO;

import br.model.Cliente;
import br.model.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Cliente_DAO {

    public void Inserir(Cliente cliente) throws Exception {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO CLIENTE (nome, celular, endereco, bairro,  cidade, estado, cpf, rg, cep, referencia, telefone, numero_cartao, bandeira_cartao) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            sql.setString(1, cliente.getNome());
            sql.setString(2, cliente.getCelular());
            sql.setString(3, cliente.getEndereco());
            sql.setString(4, cliente.getBairro());
            sql.setString(5, cliente.getCidade());
            sql.setString(6, cliente.getEstado());
            sql.setString(7, cliente.getCpf());
            sql.setString(8, cliente.getRg());
            sql.setString(9, cliente.getCep());
            sql.setString(10, cliente.getReferencia());
            sql.setString(11, cliente.getTelefone());
            sql.setString(12, cliente.getNumero_cartao());
            sql.setString(13, cliente.getBandeira_cartao());
            sql.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            conexao.closeConexao();
        }
    }

    public Cliente get(Cliente cliente) throws Exception {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT * FROM CLIENTE WHERE ID = ? ");
            sql.setInt(1, cliente.getId());
            ResultSet resultado = sql.executeQuery();
            if (resultado != null) {
                while (resultado.next()) {
                    cliente.setNome(resultado.getString("NOME"));
                    cliente.setCelular(resultado.getString("CELULAR"));
                    cliente.setEndereco(resultado.getString("ENDERECO"));
                    cliente.setBairro(resultado.getString("BAIRRO"));
                    cliente.setCidade(resultado.getString("CIDADE"));
                    cliente.setEstado(resultado.getString("ESTADO"));
                    cliente.setCpf(resultado.getString("CPF"));
                    cliente.setRg(resultado.getString("RG"));
                    cliente.setCep(resultado.getString("CEP"));
                    cliente.setReferencia(resultado.getString("REFERENCIA"));
                    cliente.setTelefone(resultado.getString("TELEFONE"));
                    cliente.setNumero_cartao(resultado.getString("NUMERO_CARTAO"));
                    cliente.setBandeira_cartao(resultado.getString("BANDEIRA_CARTAO"));
                    
                }
            }
            return cliente;

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            conexao.closeConexao();
        }
    }

    public void Alterar(Cliente cliente) throws Exception {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("UPDATE CLIENTE SET nome= ?, celular= ?, endereco= ?, bairro= ?,  cidade= ?, estado= ?, cpf= ?, rg= ?, cep= ?, referencia= ?, telefone= ?, numero_cartao= ?, bandeira_cartao= ?  WHERE ID = ? ");
            sql.setString(1, cliente.getNome());
            sql.setString(2, cliente.getCelular());
            sql.setString(3, cliente.getEndereco());
            sql.setString(4, cliente.getBairro());
            sql.setString(5, cliente.getCidade());
            sql.setString(6, cliente.getEstado());
            sql.setString(7, cliente.getCpf());
            sql.setString(8, cliente.getRg());
            sql.setString(9, cliente.getCep());
            sql.setString(10, cliente.getReferencia());
            sql.setString(11, cliente.getTelefone());
            sql.setString(12, cliente.getNumero_cartao());
            sql.setString(13, cliente.getBandeira_cartao());
            sql.setInt(14, cliente.getId());
            sql.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            conexao.closeConexao();
        }
    }
    
    public void Excluir(Cliente cliente) throws Exception {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("DELETE FROM CLIENTE WHERE ID = ? ");
            sql.setInt(1, cliente.getId());
            sql.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            conexao.closeConexao();
        }
    }

    public ArrayList<Cliente> Listar() {
        ArrayList<Cliente> meusClientes = new ArrayList();
        Conexao conexao = new Conexao();
        try {
            String selectSQL = "SELECT * FROM CLIENTE";
            PreparedStatement preparedStatement;
            preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado != null) {
                while (resultado.next()) {
                    Cliente cliente;
                    cliente = new Cliente(Integer.parseInt(resultado.getString("id")),
                            resultado.getString("NOME"),
                            resultado.getString("CELULAR"),
                            resultado.getString("ENDERECO"),
                            resultado.getString("BAIRRO"),
                            resultado.getString("CIDADE"),
                            resultado.getString("ESTADO"),
                            resultado.getString("CPF"),
                            resultado.getString("RG"),
                            resultado.getString("CEP"),
                            resultado.getString("REFERENCIA"),
                            resultado.getString("TELEFONE"),
                            resultado.getString("NUMERO_CARTAO"),
                            resultado.getString("BANDEIRA_CARTAO"));
                    meusClientes.add(cliente);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexao.closeConexao();
        }
        return meusClientes;

    }

}
