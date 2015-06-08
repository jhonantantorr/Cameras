/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

/**
 *
 * @author Jhonatan
 */
public class Camera {

    private long codigo;
    private String nome;
    private int tipodeCamera;
    private String especificações;
    private boolean habilitado;
    private int localdaCamera;

    public Camera(long codigo, String nome, int tipodeCamera, String especificações, boolean habilitado, int localdaCamera) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipodeCamera = tipodeCamera;
        this.especificações = especificações;
        this.habilitado = habilitado;
        this.localdaCamera = localdaCamera;
    }

    public Camera() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipodeCamera() {
        return tipodeCamera;
    }

    public void setTipodeCamera(int tipodeCamera) {
        this.tipodeCamera = tipodeCamera;
    }

    public String getEspecificações() {
        return especificações;
    }

    public void setEspecificações(String especificações) {
        this.especificações = especificações;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public int getLocaldaCamera() {
        return localdaCamera;
    }

    public void setLocaldaCamera(int localdaCamera) {
        this.localdaCamera = localdaCamera;
    }
public String toString(){
    String relacao = "nome="+nome+
            ", habilitado="+habilitado+
            ", tipodeCamera="+tipodeCamera+
            ", especificações="+especificações+
            ", localdaCamera=" +localdaCamera;
    return relacao;
}

}
