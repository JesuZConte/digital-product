package com.nisum.stomas.demo.digitalproduct.dao;

import com.nisum.stomas.demo.digitalproduct.entity.Detail;

public interface DetailDAO {

    Detail getDetail(int id);

    void save(Detail detail);

    void delete(int id);

}
