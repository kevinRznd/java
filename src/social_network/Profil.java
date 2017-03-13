/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package social_network;
import java.util.*;
/**
 * 
 * @author Sammy Guergachi
 */
public class Profil {
    
    private String firstName;
    private String lastName;

    private int age;
    private ArrayList<String> messages;    

    /**
     *
     * @return
     */
    public ArrayList<String> getMessages() {
        return messages;
    }

    /**
     *
     * @param messages
     */
    public void setMessages(ArrayList<String> messages) {
        this.messages = messages;
    }

    /**
     *
     */
    public Profil() {
        messages = new ArrayList<>(); 
    }
/**
 * Cette méthode permet de récupérer la valeur de l'attribut firstName
 * @return firstname
 */    
    public String getFirstName() {
        return firstName;
    }
/**
 * Cette méthode permet d'affecter une valeur à l'attribut firstName
 * @param firstName
 */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
/**
 * Cette méthode permet de récupérer la valeur de l'attribut lastName
 * @return firstName
 */
    public String getLastName() {
        return lastName;
    }
/**
 * Cette méthode permet d'affecter une valeur à l'attribut lastName
 * @param lastName
 */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
/**
 * Cette méthode permet de récupérer la valeur de l'attribut age
 * @return age
 */
    public int getAge() {
        return age;
    }
/**
 * Cette méthode permet d'affecter une valeur à l'attribut age
 * @param age
 */
    public void setAge(int age) {
        this.age = age;
    }
/**
 * Cette méthode permet d'afficher le profil utilisateur 
 * @return une chaîne de caractère avec le nom, prénom et age
 */
    public String showProfil() {
        return "Your name is " + firstName + " " + lastName + " and you are " + age + " years old"; 
    }
/**
 * Cette méthode permet de récupérer et d'afficher tous les messages
 * 
 */    
    public void getAllMessages () {     
        for (int i=0; i < messages.size(); i++) {
            System.out.println(messages.get(i));
        }
    }
/**
 * Cette méthode permet de récupérer et d'afficher les index des messages
 * 
 */   
    public void getIndexMessages () {     
        for (int i=0; i < messages.size(); i++) {
            System.out.println("Message number "+ i);
        }
    }
/**
 * Cette méthode permet de récupérer et d'afficher un message en fonction de son index 
 * @param index 
 */    
    public void getOneMessage(int index){
        if(index < messages.size()) {
            System.out.println(messages.get(index));
        } else {
            System.out.println("This message does not exist ...");
        }
    }
/**
 * Cette méthode permet d'enregistrer un nouveau message
 * @param content
 */    
    public void writeMessage (String content) {
        messages.add(content);
    }    
}