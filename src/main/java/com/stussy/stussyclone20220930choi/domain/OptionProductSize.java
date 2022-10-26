package com.stussy.stussyclone20220930choi.domain;

import com.stussy.stussyclone20220930choi.dto.admin.ProductSizeOptionResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OptionProductSize {
    private int size_id;
    private String size_name;

    public ProductSizeOptionResponseDto toDto() {
        return ProductSizeOptionResponseDto.builder()
                .sizeId(size_id)
                .sizeName(size_name)
                .build();
    }
}
