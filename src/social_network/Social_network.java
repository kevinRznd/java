/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package social_network;

import java.util.Scanner;
/**
 *
 * @author Kevin Ruzand
 */
public class Social_network {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profil profil = new Profil();        
        Scanner scan = new Scanner(System.in);
        Users user = new Users(null, null, 0);
        Menu m = new Menu();
        int response;
        int userType;
        //user profil
        profil.createProfil();
        System.out.println(     "---------You are a user : 0     \n"
                            +   "---------You are a moderator : 1");
        userType = scan.nextInt();
        scan.nextLine();
        switch(userType) {
            case 0:
                //Display the main menu
                do {
                    m.mainMenuUser();
                    response = scan.nextInt();
                    scan.nextLine();
                    switch(response) {
                        //Display profil
                        case 0: System.out.println(profil.showProfil());
                                break;
                        //Display menu for update profil information
                        case 1:
                            int modif;
                            do {
                                m.updateMenu();
                                modif = scan.nextInt();
                                scan.nextLine();
                                switch(modif){
                                    //Update first name
                                    case 0:
                                        profil.modifFirstname();
                                        break;
                                    //Update last name
                                    case 1:
                                        profil.modifLastname();
                                        break;
                                    //Update date
                                    case 2:
                                        profil.modifAge();
                                        break;
                                    //Error message
                                    default: System.out.println("Sorry i don't understand...");
                                }
                            } while (modif < 0 || modif > 2);
                            break;
                        //Create new message
                        case 2:  
                            System.out.println("---------Enter your message : ");
                            profil.writeMessage(scan.nextLine());
                            break;
                        //Display all messages
                        case 3:
                            profil.getAllMessages();
                            break;
                        //Display one message
                        case 4:
                            profil.oneMessage();
                            break;
                        //Create a new user
                        case 5:
                            user.createUser();
                            break;
                        //Display all users
                        case 6:
                            user.getAllUsers();
                            break;
                        //Display one user
                        case 7:
                            user.displayOne();
                            break;
                        case 8:
                            profil.deleteOneMessage();
                            break;
                        //Goodbye message
                        case 10:
                            System.out.println("Bye bye " + profil.getFirstName() + " !!!");
                            break;
                        //error message
                        default: System.out.println("Sorry i don't understand...");
                    }
                } while (response != 10);
                break;
            case 1:
                int modo;
                System.out.println("Your level moderator : 1 or 2 ?");
                modo = scan.nextInt();
                scan.nextLine();
                do {
                    m.mainMenuModerator();
                    response = scan.nextInt();
                    scan.nextLine();
                    switch(response) {
                        //Display profil
                        case 0: System.out.println(profil.showProfil());
                                break;
                        //Display menu for update profil information
                        case 1:
                            int modif;
                            do {
                                m.updateMenu();
                                modif = scan.nextInt();
                                scan.nextLine();
                                switch(modif){
                                    //Update first name
                                    case 0:
                                        profil.modifFirstname();
                                        break;
                                    //Update last name
                                    case 1:
                                        profil.modifLastname();
                                        break;
                                    //Update date
                                    case 2:
                                        profil.modifAge();
                                        break;
                                    //Error message
                                    default: System.out.println("Sorry i don't understand...");
                                }
                            } while (modif < 0 || modif > 2);
                            break;
                        //Create new message
                        case 2:  
                            System.out.println("---------Enter your message : ");
                            profil.writeMessage(scan.nextLine());
                            break;
                        //Display all messages
                        case 3:
                            profil.getAllMessages();
                            break;
                        //Display one message
                        case 4:
                            profil.oneMessage();
                            break;
                        //Create a new user
                        case 5:
                            user.createUser();
                            break;
                        //Display all users
                        case 6:
                            user.getAllUsers();
                            break;
                        //Display one user
                        case 7:
                            user.displayOne();
                            break;
                        case 8:
                            profil.modifMessage();
                            break;
                        case 9:
                            profil.deleteOneMessage();
                            break;
                        case 10:
                            if(modo == 2 ) {
                            user.deleteOneUser();
                            }else{System.out.println("Access denied !!");}
                            break;
                        //Goodbye message
                        case 20:
                            System.out.println("Bye bye " + profil.getFirstName() + " !!!");
                            break;
                        //error message
                        default: System.out.println("Sorry i don't understand...");
                    }
                } while (response != 20);
                break;
            default: System.out.println("Sorry i don't understand...");
        }
    }  
}