/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokedexf;

import Treinadores.*;
import TiposDePokemon.*;
import Sons.*;
import pokedexf.*;
import Pokemons.*;
import javax.swing.*;
import java.awt.*;
import jplay.URL;

/**
 *
 * @author Mathews
 */
public class PokedexF
{

    public static void main(String[] args)                          //Ganhar xp deve ser um random da função combate (se ganhar luta)
    {

        /*Mathews m = new Mathews();
        m.apresentaTreinador();
        
        Treinador t1= new Treinador();
        
        Bulbassauro b = new Bulbassauro();
        b.apresentarPokemon();
        System.out.println(b.atacar());
        */
      
        JFrame telaInicial = new JFrame ();
        JLabel icone = new JLabel ();
        Icon imagem = new ImageIcon("src//Sprites//Main Title//MainTitle2.png");
        icone.setIcon(imagem);
        
        telaInicial.setBounds(100, 100, 800, 600);
        telaInicial.getContentPane().setBackground(Color.red);
        telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        icone.setBounds(100, 100, 800, 600);
        telaInicial.setLayout(null);
        telaInicial.add(icone);
        
        telaInicial.setVisible(true);
        
        
    }

}