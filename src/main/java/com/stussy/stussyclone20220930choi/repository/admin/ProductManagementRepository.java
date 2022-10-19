package com.stussy.stussyclone20220930choi.repository.admin;

import com.stussy.stussyclone20220930choi.domain.ProductCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductManagementRepository {
    public List<ProductCategory> getCategoryList() throws Exception;
}
