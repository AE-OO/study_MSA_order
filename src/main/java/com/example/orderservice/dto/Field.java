package com.example.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 데이터를 저장하기 위해서 어떤 필드가 사용되는지 지정하기 위한 클래스
 * - Kafka의 source connect에서 sink connect로 데이터를 보낼 때 어떤 정보가 저장될 것인지 필드로 저장하고 있어야 함
 */

@Data
@AllArgsConstructor
public class Field {
    private String type;
    private boolean optional;
    private String field;
}
