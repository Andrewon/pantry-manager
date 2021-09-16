package dev.ducta.pantrymanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Food implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private Integer quantity;
    private String expiration_date;
    private String imageUrl;

    public Food(Long id, String name, Integer quantity, String expiration_date, String imageUrl) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expiration_date = expiration_date;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", expiration_date='" + expiration_date + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
