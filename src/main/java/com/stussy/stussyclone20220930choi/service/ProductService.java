package com.stussy.stussyclone20220930choi.service;

import com.stussy.stussyclone20220930choi.dto.CollectionListRespDto;
import com.stussy.stussyclone20220930choi.dto.ProductRespDto;

import java.util.Collection;
import java.util.List;

public interface ProductService {
    public List<CollectionListRespDto> getProductList(String category, int page) throws Exception;
    public ProductRespDto getProduct(int pdtId) throws Exception;
}
