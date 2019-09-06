package com.nisum.stomas.demo.digitalproduct.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="detail")
public class Detail {

    @Id
    @GeneratedValue(generator = "foreigngen")
    @GenericGenerator(strategy = "foreign", name = "foreigngen", parameters = @Parameter(name = "property", value = "product"))
    @Column(name="product_id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="has_video")
    private boolean hasVideo;

    @Column(name="review_statistics")
    private double reviewStatistics;

    @Column(name="brand")
    private String brand;

    @Column(name="upc_number")
    private String upcNumber;

    @Column(name="available")
    private boolean available;

    @Column(name="availability_message")
    private String availabilityMessage;

    @JsonIgnore
    @OneToOne(mappedBy = "productDetail")
    private Product product;

    public Detail() {
    }

    public Detail(String name, String description, boolean hasVideo, double reviewStatistics, String brand, String upcNumber, boolean available, String availabilityMessage) {
        this.name = name;
        this.description = description;
        this.hasVideo = hasVideo;
        this.reviewStatistics = reviewStatistics;
        this.brand = brand;
        this.upcNumber = upcNumber;
        this.available = available;
        this.availabilityMessage = availabilityMessage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public double getReviewStatistics() {
        return reviewStatistics;
    }

    public void setReviewStatistics(double reviewStatistics) {
        this.reviewStatistics = reviewStatistics;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUpcNumber() {
        return upcNumber;
    }

    public void setUpcNumber(String upcNumber) {
        this.upcNumber = upcNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getAvailabilityMessage() {
        return availabilityMessage;
    }

    public void setAvailabilityMessage(String availabilityMessage) {
        this.availabilityMessage = availabilityMessage;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", hasVideo=" + hasVideo +
                ", reviewStatistics=" + reviewStatistics +
                ", brand='" + brand + '\'' +
                ", upcNumber='" + upcNumber + '\'' +
                ", available=" + available +
                ", availabilityMessage='" + availabilityMessage + '\'' +
                '}';
    }
}
