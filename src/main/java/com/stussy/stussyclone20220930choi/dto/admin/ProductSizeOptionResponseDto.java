package com.stussy.stussyclone20220930choi.dto.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductSizeOptionResponseDto {
    private int sizeId;
    private String sizeName;
}
