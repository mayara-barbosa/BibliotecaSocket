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
public class Livro {
    
    private int codLivro;
    private String titulo;
    private int anoPublicacao;
    private int codUsuario;

    public Livro(int codLivro, String titulo, int anoPublicacao, int codUsuario) {
        this.codLivro = codLivro;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.codUsuario = codUsuario;
    }
    
}
