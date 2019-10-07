package com.nisum.stomas.demo.digitalproduct.util;

import com.nisum.stomas.demo.digitalproduct.analytics.AnalyticsJSON;
import com.nisum.stomas.demo.digitalproduct.analytics.DataJSON;
import com.nisum.stomas.demo.digitalproduct.entity.Detail;
import com.nisum.stomas.demo.digitalproduct.entity.Product;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AnalyticsUtil {

    public AnalyticsJSON buildAnalyticsData(Product product) {
        AnalyticsJSON analytics = new AnalyticsJSON();
        analytics.setData(getDataJSON(product));
        return analytics;
    }

    private DataJSON getDataJSON(Product product) {
        DataJSON dataJSON = new DataJSON();
        Detail detail = product.getProductDetail();


        //Product Id
        getProductId(product)
                .ifPresent(id -> dataJSON.setProductId(new String[]{id}));

        //Product Name
        getProductName(detail)
                .ifPresent(productName -> dataJSON.setProductName(new String[]{productName}));

        //Product category Id
        getProductCategoryId(product)
                .ifPresent(topLevelCategoryId -> dataJSON.setCategoryId(new String[]{topLevelCategoryId}));

        //Product category name
        getProductCategoryName(product)
                .ifPresent(productCategoryName -> dataJSON.setCategoryName(new String[]{productCategoryName}));

        //Product price
        getProductPrice(product)
                .ifPresent(price -> dataJSON.setProductPrice(new String[]{price}));

        //Upc number
        getUpcNumber(detail)
                .ifPresent(upc -> dataJSON.setProductUpc(new String[]{upc}));

        //Product video
        getProductVideo(detail)
                .ifPresent(hasVideo -> dataJSON.setProductVideo(new String[]{hasVideo}));

        //Product reviews
        getProductReviews(detail)
                .ifPresent(reviews -> dataJSON.setProductReviews(new String[]{reviews}));

        return dataJSON;

    }

    private Optional<String> getProductId(Product product) {
        return Optional.ofNullable(product)
                .map(Product::getId)
                .map(Object::toString);
    }

    private Optional<String> getProductCategoryId(Product product) {
        return Optional.ofNullable(product)
                .map(Product::getTopLevelCategoryId)
                .map(Object::toString);
    }

    private Optional<String> getProductCategoryName(Product product) {
        return Optional.ofNullable(product)
                .map(Product::getTopLevelCategoryName)
                .map(Object::toString);
    }

    private Optional<String> getProductPrice(Product product) {
        return Optional.ofNullable(product)
                .map(Product::getPrice)
                .map(Object::toString);
    }

    private Optional<String> getProductName(Detail detail) {
        return Optional.ofNullable(detail)
                .map(Detail::getName)
                .map(Object::toString);
    }

    private Optional<String> getUpcNumber(Detail detail) {
        return Optional.ofNullable(detail)
                .map(Detail::getUpcNumber)
                .map(Object::toString);
    }

    private Optional<String> getProductVideo(Detail detail) {
        return Optional.ofNullable(detail)
                .map(Detail::hasVideo)
                .map(Object::toString);
    }

    private Optional<String> getProductReviews(Detail detail) {
        return Optional.ofNullable(detail)
                .map(Detail::getReviewStatistics)
                .map(Object::toString);
    }
}
