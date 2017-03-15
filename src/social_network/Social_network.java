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
        Profil profil;        
        Scanner scan = new Scanner(System.in);
        Users user = new Users(null, null, 0);
        Menu m = new Menu();
        int response;
       
        //user profil
        profil = m.createProfil();
        //Display the main menu
        
        do {
            m.mainMenu(profil);
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
                //Delete message
                case 8:
                    profil.deleteOneMessage();
                    break;
                //Update message
                case 9:
                    profil.modifMessage();
                    break;
                //Delete user
                case 10:
                    user.deleteOneUser(((Moderator)profil).getLevel());
                    break;
                //Goodbye message
                case 20:
                    System.out.println("Bye bye " + profil.getFirstName() + " !!!");
                    break;
                //error message
                default: System.out.println("Sorry i don't understand...");
            }
        } while (response != 20);
    }  
}