/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaproject;

/**
 *
 * @author BORRAT Joan et SERRE Loïc
 */
/** runs the main application */
public class main {

    /**
     * @param args the command line arguments
     */
    /** runs the main application */
    public static void main(String[] args) {
        // TODO code application logic here
        login login = new login("Hesslane");
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

}
