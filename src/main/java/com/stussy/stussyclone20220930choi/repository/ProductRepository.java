package com.stussy.stussyclone20220930choi.repository;

import com.stussy.stussyclone20220930choi.domain.CollectionsProduct;
import com.stussy.stussyclone20220930choi.domain.PaymentProduct;
import com.stussy.stussyclone20220930choi.domain.Product;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

@Mapper
public interface ProductRepository {
    public List<CollectionsProduct> getProductList(Map<String, Object> map) throws Exception;

    public Product getProduct(int pdtId) throws Exception;
    public PaymentProduct getPaymentProduct(int pdtDtlId) throws Exception;
}
