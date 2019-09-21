package com.xiangbo.dao;

import com.xiangbo.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductDao {

    //查询所有信息
    @Select("select * from product")
    public List<Product> findAll()throws  Exception;



}
