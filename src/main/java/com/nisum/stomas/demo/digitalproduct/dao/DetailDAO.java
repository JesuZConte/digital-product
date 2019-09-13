package com.nisum.stomas.demo.digitalproduct.dao;

import com.nisum.stomas.demo.digitalproduct.entity.Detail;

/**
 * Provee acceso a la base de datos de Detalle de un Producto (Data Access Object)
 * @author L. J. Zúñiga
 * @version 1.0
 */
public interface DetailDAO {

    /**
     * Obtiene Detalle de un producto por id
     * @param id identificador de Detalle de un Producto
     * @return Detail
     */
    Detail getDetail(int id);

    /**
     * Guarda o Actualiza Detalle
     * @param detail Detalle
     */
    void save(Detail detail);

    /**
     * Elimina Detalle por id
     * @param id identificador de Detalle de un Producto
     */
    void delete(int id);

}
