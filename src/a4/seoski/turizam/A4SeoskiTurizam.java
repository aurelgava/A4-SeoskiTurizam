/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4.seoski.turizam;

/**
 *
 * @author Kab15prof
 */
public class A4SeoskiTurizam {
    public static final String URL_BAZE="jdbc:ucanaccess://src\\resursi\\SeoskiTurizam.accdb";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new GlavniProzor().setVisible(true);
    }
    
}
