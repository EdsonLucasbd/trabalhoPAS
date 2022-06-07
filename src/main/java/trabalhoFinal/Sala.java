/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoFinal;

/**
 *
 * @author lucas
 */
public class Sala {
    private Sessao[] sessoes = new Sessao[5];
    private Filme[] filmes = new Filme[5];
    private int numeroSala, capacidadeSala;
    private float valorIngresso;

    public Sala(int numeroSala, int capacidadeSala, float valorIngresso) {
        this.numeroSala = numeroSala;
        this.capacidadeSala = capacidadeSala;
        this.valorIngresso = valorIngresso;
    }

    
    
    
}
