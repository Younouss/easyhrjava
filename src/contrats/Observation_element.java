/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrats;

/**
 *
 * @author h
 */
public class Observation_element {
    private String observation;
    private String date_created;
    private String user_date_created;
    private String date_modified;
    private String user_date_modified;
     public Observation_element(String description, String date_created,String user_date_created, String date_modified, String user_date_modified){
         this.observation = description;
        this.date_created = date_created;
        this.user_date_created = user_date_created;
        this.date_modified = date_modified;
        this.user_date_modified = user_date_modified;
     }
     public String getObservation()
    {
        return observation;
    }
      public String getDate_created()
    {
        return date_created;
    }  
    public String getUser_date_created()
    {
        return user_date_created;
    }
    
    public String getDate_modified()
    {
        return date_modified;
    }
   public String getUser_date_modified()
    {
        return user_date_modified;
    } 
}
