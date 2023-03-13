package com.example.esyfinancebackend.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginResponseDTO {
    
    @Id
    private String publicKey;

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }


}
