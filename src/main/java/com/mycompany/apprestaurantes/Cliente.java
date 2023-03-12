package com.mycompany.apprestaurantes;

public class Cliente {

    protected String nome, endereco, usuario, senha;
    protected int idade, cpf, celular, cep;
    protected boolean contaAberta;

    Cliente() {
    }

    public void seCadastrar(String nome, int idade, int cpf, int cep, int celular, String endereco, String usuario, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cep = cep;
        this.endereco = endereco;
        this.celular = celular;
        this.usuario = usuario;
        this.senha = senha;

    }

    public Cliente(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;

        this.contaAberta = true;

        System.out.println("Entramos na Conta!");

    }

    public void sair() {
        if (this.contaAberta == true) {
            this.contaAberta = false;
            System.out.println("Conta fechada com sucesso!!");
        } else {
            System.out.println("Conta já está fechada!");
        }

    }

    public void cancelarPedido() {
        this.contaAberta = true;
        Pedido p = new Pedido();
        p.pedidoConcluido = false;
        System.out.println("Pedido cancelado!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public boolean isContaAberta() {
        return contaAberta;
    }

    public void setContaAberta(boolean contaAberta) {
        this.contaAberta = contaAberta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
