package com.spring.toyproject.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorResponse {

    // 에러 발생 시간
    private LocalDateTime timestamp;

    // http status code
    private int status;  // ex: 404, 400, 403, 500...

    // 에러 코드 이름
    private String error; // ex: bad request, not found...

    // 상세 에러 정보
    private String detail;

    // 에러가 난 URL path
    private String path;

    // 유효성 검증 에러 목록



}
