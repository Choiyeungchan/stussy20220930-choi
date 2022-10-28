package com.stussy.stussyclone20220930choi.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Builder
public class ProductRespDto {

    private int pdtId;
    private String pdtName;
    private int pdtPrice;
    private String pdtSimpleInfo;
    private String pdtDetailInfo;
    private String pdtOptionInfo;
    private String pdtManagementInfo;
    private String pdtShippingInfo;
    private Map<String, List<Map<String, Object>>> pdtColors;
    private List<String> pdtImgs;
}
