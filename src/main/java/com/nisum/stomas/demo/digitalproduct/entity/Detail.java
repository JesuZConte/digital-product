package com.nisum.stomas.demo.digitalproduct.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Representa el Detalle de un Producto.
 * @author L.J. Zúñiga
 * @version 1.0
 */
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

    /**
     * Constructor sin parámetros, crea una instancia de Detail (detalle).
     */
    public Detail() {
    }

    /**
     * Constructor con parámetros, crea una instancia de Detail (detalle).
     * @param name nombre del producto.
     * @param description descripción del producto.
     * @param hasVideo si producto cuenta con video.
     * @param reviewStatistics promedio de estadísticas de un producto.
     * @param brand marca del producto.
     * @param upcNumber número de UPC del producto.
     * @param available si está disponible el producto.
     * @param availabilityMessage mensaje de disponibilidad del producto.
     */
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

    /**
     * Obtiene id del detalle.
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica id del detalle.
     * @param id identificador del detalle.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene nombre del detalle.
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Modifica nombre del detalle.
     * @param name nombre del detalle.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene descripción del detalle.
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * Modifica descripción del detalle.
     * @param description descripción del detalle.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Confirma si producto tiene video.
     * @return boolean
     */
    public boolean hasVideo() {
        return hasVideo;
    }

    /**
     * Modifica si producto tiene video.
     * @param hasVideo si producto tiene video, método retorna true. Si no cuenta con video, retorna false.
     */
    public void setHasVideo(boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    /**
     * Obtiene el promedio de las estadísticas de un producto.
     * @return double
     */
    public double getReviewStatistics() {
        return reviewStatistics;
    }

    /**
     * Modifica el valor promedio de las estadísticas de un producto.
     * @param reviewStatistics nota promedio de las estadísticas de un producto.
     */
    public void setReviewStatistics(double reviewStatistics) {
        this.reviewStatistics = reviewStatistics;
    }

    /**
     * Obtiene marca de un producto.
     * @return String
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Modifica la marca de un producto.
     * @param brand marca de un producto.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Obtiene el número upc de un producto.
     * @return String
     */
    public String getUpcNumber() {
        return upcNumber;
    }

    /**
     * Modifica el número upc.
     * @param upcNumber Universal Product Code es un barcode para escaneo de items. Está conformado por 12 dígitos.
     */
    public void setUpcNumber(String upcNumber) {
        this.upcNumber = upcNumber;
    }

    /**
     * Si el producto está disponible.
     * @return boolean
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Modifica la disponibilidad de un producto.
     * @param available Si el producto está disponible, retorna true. De lo contrario, retorna false.
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Obtiene el mensaje de disponibilidad de un producto.
     * @return String
     */
    public String getAvailabilityMessage() {
        return availabilityMessage;
    }

    /**
     * Modifica el mensaje de disponibilidad de un producto.
     * @param availabilityMessage mensaje de disponibilidad de un producto.
     */
    public void setAvailabilityMessage(String availabilityMessage) {
        this.availabilityMessage = availabilityMessage;
    }

    /**
     * Obtiene el producto asociado al detalle.
     * @return Product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Modifica el producto asociado al detalle.
     * @param product Producto
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * La representación en String del objeto Detail (detalle).
     * @return String
     */
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
