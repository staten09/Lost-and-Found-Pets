package com.thespotted.The.Spotted.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Pet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String status;

    @NotNull
    private String ownerFirstName;

    @NotNull
    private String ownerLastName;

    @NotNull
    private String contactNumber;

    @NotNull
    private String contactEmail;

    private String lastLocationSeen;

    private int microchipID;

    private String description;

    private String imageUrl;

    @Column(nullable = false, updatable = false)
    private String petId;

    public Pet(){}

    public Pet(String name, String status, String ownerFirstName, String ownerLastName, String contactNumber, String contactEmail, String lastLocationSeen, int microchipID, String description, String imageUrl, String petId) {
        this.name = name;
        this.status = status;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
        this.lastLocationSeen = lastLocationSeen;
        this.microchipID = microchipID;
        this.description = description;
        this.imageUrl = imageUrl;
        this.petId = petId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLastLocationSeen() {
        return lastLocationSeen;
    }

    public void setLastLocationSeen(String lastLocationSeen) {
        this.lastLocationSeen = lastLocationSeen;
    }

    public int getMicrochipID() {
        return microchipID;
    }

    public void setMicrochipID(int microchipID) {
        this.microchipID = microchipID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }
}
