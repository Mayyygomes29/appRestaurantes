
package com.mycompany.apprestaurantes;
public class Restaurantes extends Pedido {
  public String nomeRest,tipoComida,nomeRefeicao;
  public int cnpj,telefone;
  public boolean RestAberto;
   
  
  
  public Restaurantes(String nomeRest, int cnpj, String tipoComida) {
        this.nomeRest = nomeRest;
        this.cnpj = cnpj;
        this.tipoComida = tipoComida;
    }

    Restaurantes() {
    }

    @Override
    public void Avaliacao(String a) {
        super.Avaliacao(a);
    }
 
 

    public String getNomeRest() {
        return nomeRest;
    }

    public void setNomeRest(String nomeRest) {
        this.nomeRest = nomeRest;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getNomeRefeicao() {
        return nomeRefeicao;
    }

    public void setNomeRefeicao(String nomeRefeicao) {
        this.nomeRefeicao = nomeRefeicao;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public boolean isRestAberto() {
        return RestAberto;
    }

    public void setRestAberto(boolean RestAberto) {
        this.RestAberto = RestAberto;
    }
  
}