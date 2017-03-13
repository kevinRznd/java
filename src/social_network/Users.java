/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package social_network;

import java.util.ArrayList;

/**
 * 
 * @author Kevin Ruzand
 */
public class Users {    
    //attributs
    private String firstname;
    private String lastname;
    private int age;
    ArrayList<Users> listUsers = new ArrayList<>();    
    //constructeur
    public Users(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    } 
    
    
    public Users(){
    
        this.firstname = "undefined";
        this.lastname = "undefined";
        this.age = 0;
        
    
    }
/**
 * Cette méthode sert à récupérer la valeur de l'attribut firstname
 * @return firstname    
 */
    public String getFirstname() {
        return firstname;
    }
/**
 * Cette méthode sert à affecter une valeur à l'attribut firstname
 * @param firstname
 */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
/**
 * Cette méthode sert à récupérer la valeur de l'attribut lastname
 * @return lastname
 */
    public String getLastname() {
        return lastname;
    }
/**
 * Cette méthode sert à affecter une valeur à l'attribut lastname
 * @param lastname
 */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
/**
 * Cette méthode sert à récupérer la valeur de l'attribut age
 * @return age
 */
    public int getAge() {
        return age;
    }
/**
 * Cette méthode sert à affecter une valeur à l'attribut age
 * @param age
 */
    public void setAge(int age) {
        this.age = age;
    }   
 /**
 * Cette méthode sert à créer un user et l'ajouter à la liste
 * Cette methode ne renvoie rien
 */
    public void createUser () {
        listUsers.add(new Users(firstname, lastname, age));
    }
    
    
/**
 * Cette méthode sert à afficher une liste de tous les utilisateurs
 */
    public void getAllUsers () {
    
        for(int i = 0; i < listUsers.size(); i++) {
        
            System.out.println("The user is : " + listUsers.get(i).getFirstname() + " " + listUsers.get(i).getLastname() + " he's " + listUsers.get(i).getAge() + " years old");
            
        }
        
    }
    /**
 * Cette méthode sert à afficher une liste de tous les index utilisateurs
 */
    public void getIndexUsers () {
    
        for(int i = 0; i < listUsers.size(); i++) {
        
            System.out.println("Number user : " + i);
            
        }
        
    }
/**
 * Cette méthode sert à afficher le nom et prenom d'un utilsateur en fonction de son index
 * @param index
 */    
    public void getOneUser(int index){
        if(index < listUsers.size()) {
            System.out.println(listUsers.get(index).getFirstname() + " " + listUsers.get(index).getLastname());
        } else {
            System.out.println("This user does not exist ...");
        }
    }
/**
 * Cette méthode sert à supprimer un utilsateur
 * @param index
 */    
    public void deleteUser(int index){
        if(index < listUsers.size()) {
            listUsers.remove(index);
        } else {
            System.out.println("This user does not exist ...");
        }
    }
    
}