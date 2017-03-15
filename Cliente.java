/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaserver;

/**
 *
 * @author Mayara
 */
public class Cliente {
    
    private String nome;
    private int codCliente;
    private String senha;

    public Cliente(String nome, int codCliente, String senha) {
        this.nome = nome;
        this.codCliente = codCliente;
        this.senha = senha;
    }
    
}
