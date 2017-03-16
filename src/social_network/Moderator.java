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
public class Moderator extends Profil{

    private int level;
   

    public Moderator(String firstName, String lastName, int age, int lvl) {
        
        super(firstName, lastName, age);
        this.level = lvl;
        
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }    
}