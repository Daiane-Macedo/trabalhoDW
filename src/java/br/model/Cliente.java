package br.model;

public class Cliente {

    public Cliente(int id) {
        this.id = id;
    }

    private int id;
    private String nome;
    private String celular;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cpf;
    private String rg;
    private String cep;
    private String referencia;
    private String telefone;
    private String numero_cartao;
    private String bandeira_cartao;
    
    public Cliente(String nome, String celular, String endereco, String bairro, String cidade, String estado, String cpf, String rg, String cep, String referencia,String telefone, String numero_cartao, String bandeira_cartao) {
        this.nome = nome;
        this.celular = celular;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cpf = cpf;
        this.rg = rg;
        this.cep = cep;
        this.referencia = referencia;
        this.telefone = telefone;
        this.numero_cartao = numero_cartao;
        this.bandeira_cartao = bandeira_cartao;
    }
  
    public Cliente(int id,String nome, String celular, String endereco, String bairro, String cidade, String estado, String cpf, String rg, String cep, String referencia, String telefone, String numero_cartao, String bandeira_cartao) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cpf = cpf;
        this.rg = rg;
        this.cep = cep;
        this.referencia = referencia;
        this.telefone = telefone;
        this.numero_cartao = numero_cartao;
        this.bandeira_cartao = bandeira_cartao;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular(){
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEndereco() {
        return endereco;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   
    public String getEstado() {
        return estado;
    }

    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getRg() {
        return rg;
    }

        public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCep() {
        return cep;
    }

    
    
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getReferencia() {
        return referencia;
    }

    
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
    }

    
    public String getBandeira_cartao() {
        return bandeira_cartao;
    }

    public void setBandeira_cartao(String bandeira_cartao) {
        this.bandeira_cartao = bandeira_cartao;
    }


}
