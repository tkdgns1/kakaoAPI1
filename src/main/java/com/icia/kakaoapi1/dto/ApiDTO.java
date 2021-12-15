package com.icia.kakaoapi1.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;


@Data
@Alias("api")
public class ApiDTO {
    // 지도의 위치를 저장하고 불러오기
    // ex)인천일보 아카데미 주소를 어떻게 찾는가?
    // 우리가 저장한 위치의 이름을 설정, 길찾기 기능 추가
    // 배달거리
    String storeName;
    double lat;
    double lng;
}
