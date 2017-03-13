/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package social_network;

/**
 * 
 * @author Kevin Ruzand
 */
public class Menu {
/**
 * Cette méthode sert à afficher le menu principal d'un utilisateur simple
 * 
 */    
    public void mainMenuUser() {
        System.out.println(         "---------Show your profil : 0       \n"
                            +       "---------Modify your profil : 1     \n"
                            +       "---------Write a message : 2        \n"
                            +       "---------Show all messages : 3      \n"
                            +       "---------Show one messages : 4      \n"
                            +       "---------Create a new user : 5      \n"
                            +       "---------Show all users : 6         \n"
                            +       "---------Show one user : 7          \n"
                            +       "---------Delete a message : 8       \n"        
                            +       "---------Quit the program : 10");
    }
/**
 * Cette méthode sert à afficher le menu principal d'un modérateur
 * 
 */    
    public void mainMenuModerator() {
        System.out.println(         "---------Show your profil : 0       \n"
                            +       "---------Modify your profil : 1     \n"
                            +       "---------Write a message : 2        \n"
                            +       "---------Show all messages : 3      \n"
                            +       "---------Show one messages : 4      \n"
                            +       "---------Create a new user : 5      \n"
                            +       "---------Show all users : 6         \n"
                            +       "---------Show one user : 7          \n"
                            +       "---------Update message : 8         \n" 
                            +       "---------Delete message : 9         \n"
                            +       "---------Delete user : 10           \n"
                            +       "---------Quit the program : 20");
    }    
/**
 * Cette méthode sert à afficher le menu de modification du profil utilisateur
 * 
 */
    public void updateMenu() {
        System.out.println(         "---------Modify your first name : 0    \n"
                                +   "---------Modify your last name : 1     \n"
                                +   "---------Modify your age : 2");
    }

}
