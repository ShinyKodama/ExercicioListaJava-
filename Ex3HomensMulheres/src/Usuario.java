/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lucas
 */
public class Usuario {
    static int nextID = 1;
    
    private int ID;
    private int idadeUsuario;
    
    private String nomeUsuario;    
    private String generoUsuario;
    
    public Usuario(String _nomeUsuario, int _idadeUsuario, String _generoUsuario) {
        this.ID = this.nextID++;
        this.nomeUsuario = _nomeUsuario;
        this.idadeUsuario = _idadeUsuario;
        this.generoUsuario = _generoUsuario;
    }
    
    public int getID()               { return ID; }
    public String getNomeUsuario()   { return nomeUsuario; }
    public int getIdadeUsuario()     { return idadeUsuario; }
    public String getGeneroUsuario() { return generoUsuario; }
    public String usuarioMaiorDeIdade() { return (idadeUsuario >= 18) ? "Maior de Idade!" : "Menor de Idade!"; }
};
