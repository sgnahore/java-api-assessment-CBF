package com.cbfacademy.javaapiassessment.eventCreator;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "eventCreator") 
public class EventCreator {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String username;
    private String email;
    private LocalDateTime creationDate;

    
    public EventCreator(String username, String email, LocalDateTime creationDate){
        this.id =UUID.randomUUID();
    this.username = username;
    this.email = email;
    this.creationDate = creationDate;
   }

   public EventCreator() {

   }

   public UUID getId(){
    return this.id;
   }

   public String getUsername(){
    return this.username;
   }

   public String getEmail(){
    return this.email;
   }

   public LocalDateTime getCreationDate(){
    return this.creationDate;
   }

   public void setUsername(String username){
    this.username = username;
   }

   public void setEmail(String email){
    this.email = email;
   }

   public void setCreationDate(LocalDateTime creationDate){
    this.creationDate = creationDate;
   }
   
}

