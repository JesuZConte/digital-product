# digital-product
Proyecto Demo para informe de práctica IP Santo Tomas

* Maven version 3.6.0
* Java 8

### To access the documentation (javadoc), clone the project, open index.html in the browser.

### To run (port 9000) by command line:

a)
BUILD -> mvn clean install

b)
RUN -> mvn spring-boot:run

c)
To stop the server -> ctrl+c

### To check the Health status:

http://localhost:9000/digital-product/actuator/health

### Info of the app:

http://localhost:9000/digital-product/actuator/info

## Use in POSTMAN

### Listar productos / List products
http://localhost:9000/digital-product/api/products

### Encontrar producto por id / Find products by id
http://localhost:9000/digital-product/api/products/1310  (localhost:9000/digital-product/api/products/{productId}

### Guardar un nuevo producto / Save a new product
http://localhost:9000/digital-product/api/products 

Ejemplo de Body / Body sample:
{
    "productUrl": "/shop/product/presto-07030-griddle-jumbo-cool-touch?ID=136866",
    "topLevelCategoryId": "4567",
    "topLevelCategoryName": "Kitchen",
    "price": 37.99,
    "productDetail": {
        "name": "Griddle Jumbo Cool Touch",
        "description": "A sleek, convenient griddle that can do it all.",
        "hasVideo": false,
        "reviewStatistics": 4.79,
        "brand": "Presto",
        "upcNumber": "83759281733",
        "available": true,
        "availabilityMessage": "In Stock"
    }
}

### Borrar un producto / Delete a product by id
http://localhost:9000/digital-product/api/products/1315 localhost:9000/digital-product/api/products/{productId}

