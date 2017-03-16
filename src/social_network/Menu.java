/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package social_network;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * 
 * @author Kevin Ruzand
 */
public class Menu {

    Scanner scan = new Scanner(System.in);

/**
 * Cette méthode sert à afficher le menu principal d'un modérateur
 * 
 * @param p
 */    
    public void mainMenu(Profil p) {
        System.out.println(         "---------Show your profil :    0           \n"
                            +       "---------Modify your profil :  1           \n"
                            +       "---------Write a message :     2           \n"
                            +       "---------Show all messages :   3           \n"
                            +       "---------Show one messages :   4           \n"
                            +       "---------Create a new user :   5           \n"
                            +       "---------Show all users :      6           \n"
                            +       "---------Show one user :       7           \n"
                            +       "---------Delete message :      8           ");
                                           
        if(p.getClass().getName() == "social_network.Moderator") {  
            System.out.println(     "---------Update message :      9           \n"
                            +       "---------Delete user :         10          ");
        }
        
        System.out.println(         "---------Quit the program :    20          ");
    }    
/**
 * Cette méthode sert à afficher le menu de modification du profil utilisateur
 * 
 */
    public void updateMenu() {
        System.out.println(         "---------Modify your first name :  0       \n"
                                +   "---------Modify your last name :   1       \n"
                                +   "---------Modify your age :         2       ");
    }

    public Profil createProfil() {
        Profil person=null;
        int userType;
        System.out.println("---------Enter your first name : ");
        String firstName =scan.nextLine();
        System.out.println("---------Enter your last name : ");
        String lastName =scan.nextLine();
        int age = 0;
        do{
            try {
                System.out.println("---------Enter your age : ");
                age = scan.nextInt();               
            } catch (InputMismatchException e) {
                System.out.println("Invalid age. ");
            }
             scan.nextLine();
        } while (age <= 0);
        
        
        
        System.out.println(     "---------You are a user :      0       \n"
                            +   "---------You are a moderator : 1       ");
        userType = scan.nextInt();
        scan.nextLine();
        int lvl;
        if(userType == 1){
            System.out.println("Your moderation level : 1 or 2");
            lvl = scan.nextInt();
            scan.nextLine();
            person = new Moderator(firstName, lastName, age, lvl);

        }else if(userType == 0) {
            person = new Profil(firstName, lastName, age);

        }
        return person;
    
    }
}