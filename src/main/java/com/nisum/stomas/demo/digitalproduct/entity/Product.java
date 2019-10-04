package com.nisum.stomas.demo.digitalproduct.entity;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Representa un Producto.
 * @author L.J Zúñiga
 * @version 1.0
 */
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
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
    @PrimaryKeyJoinColumn
    private Detail productDetail;


    /**
     * Constructor sin parámetros, crea una instancia de Product (producto).
     */
    public Product() {
    }

    /**
     * Constructor con parámetros, crea una instancia de Product (producto).
     * @param productUrl dirección url del producto.
     * @param topLevelCategoryId identificador de la categoría de alto nivel del producto.
     * @param topLevelCategoryName nombre de la categoría de alto nivel del producto.
     * @param price precio del producto
     */
    public Product(String productUrl, String topLevelCategoryId, String topLevelCategoryName, double price) {
        this.productUrl = productUrl;
        this.topLevelCategoryId = topLevelCategoryId;
        this.topLevelCategoryName = topLevelCategoryName;
        this.price = price;
    }


    /**
     * Obtiene id del producto.
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica id del producto.
     * @param id identificador del producto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Dirección url del producto.
     * @return String
     */
    public String getProductUrl() {
        return productUrl;
    }

    /**
     * Modifica la dirección url del producto.
     * @param productUrl dirección url de un producto
     */
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     * Obtiene el id de la categoría de alto nivel del producto.
     * @return id
     */
    public String getTopLevelCategoryId() {
        return topLevelCategoryId;
    }

    /**
     * Modifica el id de la categoría de alto nivel del producto.
     * @param topLevelCategoryId identificador de la categoría de alto nivel.
     */
    public void setTopLevelCategoryId(String topLevelCategoryId) {
        this.topLevelCategoryId = topLevelCategoryId;
    }

    /**
     * Obtiene el nombre de la categoría de alto nivel del producto.
     * @return String
     */
    public String getTopLevelCategoryName() {
        return topLevelCategoryName;
    }

    /**
     * Modifica el nombre de la categoría de alto nivel del producto.
     * @param topLevelCategoryName nombre de la categoría de alto nivel.
     */
    public void setTopLevelCategoryName(String topLevelCategoryName) {
        this.topLevelCategoryName = topLevelCategoryName;
    }

    /**
     * Obtiene el precio de un producto.
     * @return double
     */
    public double getPrice() {
        return price;
    }

    /**
     * Modifica el precio de un producto.
     * @param price precio de un producto en dólares.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Obtiene el detalle de un producto.
     * @return Detail
     */
    public Detail getProductDetail() {
        return productDetail;
    }

    /**
     * Detalle de un producto.
     * @param productDetail detalle.
     */
    public void setProductDetail(Detail productDetail) {
        this.productDetail = productDetail;
    }

    /**
     * La representación en String del objeto Product (producto).
     * @return String
     */
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
