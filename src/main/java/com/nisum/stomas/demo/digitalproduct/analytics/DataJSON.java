package com.nisum.stomas.demo.digitalproduct.analytics;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representa la Data de un JSON
 * @author L.J. Zúñiga
 * @version 1.0
 */
public class DataJSON {

    @JsonProperty("product_id")
    private String[] productId;
    @JsonProperty("category_id")
    private String[] categoryId;
    @JsonProperty("category_name")
    private String[] categoryName;
    @JsonProperty("product_upc")
    private String[] productUpc;
    @JsonProperty("product_availability_message")
    private String[] productAvailabilityMessage;
    @JsonProperty("product_name")
    private String[] productName;
    @JsonProperty("product_price")
    private String[] productPrice;
    @JsonProperty("product_video")
    private String[] productVideo;
    @JsonProperty("product_reviews")
    private String[] productReviews;

    /**
     * Obtiene el Id de la categoría del producto
     * @return String[]
     */
    public String[] getCategoryId() {
        return categoryId;
    }

    /**
     * Modifica el Id de la categoría del producto
     * @param categoryId
     */
    public void setCategoryId(String[] categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * Obtiene el nombre de la categoría del producto
     * @return String[]
     */
    public String[] getCategoryName() {
        return categoryName;
    }

    /**
     * Modifica el nombre de la categoría del producto
     * @param categoryName
     */
    public void setCategoryName(String[] categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * Obtiene el id del producto
     * @return String[]
     */
    public String[] getProductId() {
        return productId;
    }

    /**
     * Modifica el id del producto
     * @param productId
     */
    public void setProductId(String[] productId) {
        this.productId = productId;
    }

    /**
     * Obtiene el número upc del producto
     * @return String[]
     */
    public String[] getProductUpc() {
        return productUpc;
    }

    /**
     * Modifica el número upc del producto
     * @param productUpc
     */
    public void setProductUpc(String[] productUpc) {
        this.productUpc = productUpc;
    }

    /**
     * Obtiene el mensaje de disponibilidad del producto
     * @return String[]
     */
    public String[] getProductAvailabilityMessage() {
        return productAvailabilityMessage;
    }

    /**
     * Modifica el mensaje de disponibilidad del producto
     * @param productAvailabilityMessage
     */
    public void setProductAvailabilityMessage(String[] productAvailabilityMessage) {
        this.productAvailabilityMessage = productAvailabilityMessage;
    }

    /**
     * Obtiene el nombre del producto
     * @return String[]
     */
    public String[] getProductName() {
        return productName;
    }

    /**
     * Modifica el nombre del producto
     * @param productName
     */
    public void setProductName(String[] productName) {
        this.productName = productName;
    }

    /**
     * Obtiene el precio del producto
     * @return String[]
     */
    public String[] getProductPrice() {
        return productPrice;
    }

    /**
     * Modifica el precio del producto
     * @param productPrice
     */
    public void setProductPrice(String[] productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * Indica si el producto tiene video
     * @return String[]
     */
    public String[] getProductVideo() {
        return productVideo;
    }

    /**
     * Modifica si el producto tiene video
     * @param productVideo
     */
    public void setProductVideo(String[] productVideo) {
        this.productVideo = productVideo;
    }

    /**
     * Obtiene los reviews (votaciones) del producto
     * @return String[]
     */
    public String[] getProductReviews() {
        return productReviews;
    }

    /**
     * Modifica los reviews del producto
     * @param productReviews
     */
    public void setProductReviews(String[] productReviews) {
        this.productReviews = productReviews;
    }
}
