package com.nisum.stomas.demo.digitalproduct.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

    // define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="product_url")
    private String productUrl;

    @Column(name="top_level_category_id")
    private String topLevelCategoryId;

    @Column(name="top_level_category_name")
    private String topLevelCategoryName;

    @Column(name="price")
    private double price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="product_detail_id")
    private Detail productDetail;

    // define constructors

    // no args required by hibernate
    public Product() {
    }

    public Product(String productUrl, String topLevelCategoryId, String topLevelCategoryName, double price) {
        this.productUrl = productUrl;
        this.topLevelCategoryId = topLevelCategoryId;
        this.topLevelCategoryName = topLevelCategoryName;
        this.price = price;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getTopLevelCategoryId() {
        return topLevelCategoryId;
    }

    public void setTopLevelCategoryId(String topLevelCategoryId) {
        this.topLevelCategoryId = topLevelCategoryId;
    }

    public String getTopLevelCategoryName() {
        return topLevelCategoryName;
    }

    public void setTopLevelCategoryName(String topLevelCategoryName) {
        this.topLevelCategoryName = topLevelCategoryName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // define toString


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productUrl='" + productUrl + '\'' +
                ", topLevelCategoryId='" + topLevelCategoryId + '\'' +
                ", topLevelCategoryName='" + topLevelCategoryName + '\'' +
                ", price=" + price +
                '}';
    }
}
