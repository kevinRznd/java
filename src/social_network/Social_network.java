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
        System.out.println("---------Enter your first name : ");
        profil.setFirstName(scan.nextLine());
        System.out.println("---------Enter your last name : ");
        profil.setLastName(scan.nextLine());
        System.out.println("---------Enter your age : ");
        profil.setAge(scan.nextInt());
        scan.nextLine();
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
                                        System.out.println("---------Enter your new first name : ");
                                        profil.setFirstName(scan.nextLine());
                                        System.out.println("Your new first name is " + profil.getFirstName());
                                        break;
                                    //Update last name
                                    case 1:
                                        System.out.println("---------Enter your new last name : ");
                                        profil.setLastName(scan.nextLine());
                                        System.out.println("Your new last name is " + profil.getLastName());
                                        break;
                                    //Update date
                                    case 2:
                                        System.out.println("---------Enter your new age : ");
                                        profil.setAge(scan.nextInt());
                                        scan.nextLine();
                                        System.out.println("Your new age is " + profil.getAge() + "years old");
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
                            profil.getIndexMessages();
                            System.out.println("---------Enter number message");
                            profil.getOneMessage(scan.nextInt());
                            scan.nextLine();
                            break;
                        //Create a new user
                        case 5:
                            System.out.println("---------Enter the first name : ");
                            user.setFirstname(scan.nextLine());
                            System.out.println("---------Enter the last name : ");
                            user.setLastname(scan.nextLine());
                            System.out.println("---------Enter the age : ");
                            user.setAge(scan.nextInt());
                            scan.nextLine();
                            user.createUser();
                            break;
                        //Display all users
                        case 6:
                            user.getAllUsers();
                            break;
                        //Display one user
                        case 7:
                            System.out.println("---------Enter number user");
                            user.getOneUser(scan.nextInt());
                            scan.nextLine();
                            break;
                        case 8:
                            profil.getIndexMessages();
                            System.out.println("---------Enter number message");
                            profil.deleteMessage(scan.nextInt());
                            scan.nextLine();
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
                                        System.out.println("---------Enter your new first name : ");
                                        profil.setFirstName(scan.nextLine());
                                        System.out.println("Your new first name is " + profil.getFirstName());
                                        break;
                                    //Update last name
                                    case 1:
                                        System.out.println("---------Enter your new last name : ");
                                        profil.setLastName(scan.nextLine());
                                        System.out.println("Your new last name is " + profil.getLastName());
                                        break;
                                    //Update date
                                    case 2:
                                        System.out.println("---------Enter your new age : ");
                                        profil.setAge(scan.nextInt());
                                        scan.nextLine();
                                        System.out.println("Your new age is " + profil.getAge() + "years old");
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
                            profil.getIndexMessages();
                            System.out.println("---------Enter number message");
                            profil.getOneMessage(scan.nextInt());
                            scan.nextLine();
                            break;
                        //Create a new user
                        case 5:
                            System.out.println("---------Enter the first name : ");
                            user.setFirstname(scan.nextLine());
                            System.out.println("---------Enter the last name : ");
                            user.setLastname(scan.nextLine());
                            System.out.println("---------Enter the age : ");
                            user.setAge(scan.nextInt());
                            scan.nextLine();
                            user.createUser();
                            break;
                        //Display all users
                        case 6:
                            user.getAllUsers();
                            break;
                        //Display one user
                        case 7:
                            System.out.println("---------Enter number user");
                            user.getOneUser(scan.nextInt());
                            scan.nextLine();
                            break;
                        case 8:
                            int n;
                            String content;
                            profil.getIndexMessages();
                            System.out.println("---------Enter number message");
                            n = scan.nextInt();
                            scan.nextLine();
                            System.out.println("---------Enter the new message : ");
                            content = scan.nextLine();
                            profil.updateMessage(n, content);
                            break;
                        case 9:
                            profil.getIndexMessages();
                            System.out.println("---------Enter number message");
                            profil.deleteMessage(scan.nextInt());
                            scan.nextLine();
                            break;
                        case 10:
                            if(modo == 2 ) {
                            user.getIndexUsers();
                            System.out.println("---------Enter number user");
                            user.deleteUser(scan.nextInt());
                            scan.nextLine();
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