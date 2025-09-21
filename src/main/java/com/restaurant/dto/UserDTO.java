package com.restaurant.dto;

public class UserDTO {
    private Long id;
    private String email;
    private String fullName;
    private String phone;
    private String address;
    private String role;
    private String password; // <-- AGREGADO

    public UserDTO() {}

    public UserDTO(String email, String fullName, String phone, String address, String password) {
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.password = password;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}