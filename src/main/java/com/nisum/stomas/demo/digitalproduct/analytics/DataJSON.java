package com.nisum.stomas.demo.digitalproduct.analytics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataJSON {

    @JsonProperty("page_type")
    private String pageType;
    @JsonProperty("category_id")
    private String[] categoryId;
    @JsonProperty("category_name")
    private String[] cateogryName;
    @JsonProperty("product_id")
    private String[] productId;
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

    public String getPageType() {
        return pageType;
    }

    public void setPageType(String pageType) {
        this.pageType = pageType;
    }

    public String[] getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String[] categoryId) {
        this.categoryId = categoryId;
    }

    public String[] getCateogryName() {
        return cateogryName;
    }

    public void setCateogryName(String[] cateogryName) {
        this.cateogryName = cateogryName;
    }

    public String[] getProductId() {
        return productId;
    }

    public void setProductId(String[] productId) {
        this.productId = productId;
    }

    public String[] getProductUpc() {
        return productUpc;
    }

    public void setProductUpc(String[] productUpc) {
        this.productUpc = productUpc;
    }

    public String[] getProductAvailabilityMessage() {
        return productAvailabilityMessage;
    }

    public void setProductAvailabilityMessage(String[] productAvailabilityMessage) {
        this.productAvailabilityMessage = productAvailabilityMessage;
    }

    public String[] getProductName() {
        return productName;
    }

    public void setProductName(String[] productName) {
        this.productName = productName;
    }

    public String[] getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String[] productPrice) {
        this.productPrice = productPrice;
    }

    public String[] getProductVideo() {
        return productVideo;
    }

    public void setProductVideo(String[] productVideo) {
        this.productVideo = productVideo;
    }

    public String[] getProductReviews() {
        return productReviews;
    }

    public void setProductReviews(String[] productReviews) {
        this.productReviews = productReviews;
    }
}
