package com.spring.sec.jwt.security.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
  private Boolean status;
  private Integer statusCode;
  private String message;
  private String token;
}
