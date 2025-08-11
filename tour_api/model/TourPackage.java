package com.example.tour_api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "tour_package")
public class TourPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("image")
    private String image;

    @JsonProperty("discountInPercentage")
    @Column(name = "discount_in_percentage", nullable = false)
    private Integer discountInPercentage;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("actualPrice")
    @Column(name = "actual_price", nullable = false)
    private Double actualPrice;

    @JsonProperty("discountedPrice")
    @Column(name = "discounted_price", nullable = false)
    private Double discountedPrice;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public Integer getDiscountInPercentage() { return discountInPercentage; }
    public void setDiscountInPercentage(Integer discountInPercentage) { this.discountInPercentage = discountInPercentage; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }

    public Double getActualPrice() { return actualPrice; }
    public void setActualPrice(Double actualPrice) { this.actualPrice = actualPrice; }

    public Double getDiscountedPrice() { return discountedPrice; }
    public void setDiscountedPrice(Double discountedPrice) { this.discountedPrice = discountedPrice; }
}