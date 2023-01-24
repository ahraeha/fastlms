package com.zerobase.fastlms.member.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Member {

  @Id
  private String userId;

  private String userName;
  private String phone;
  private String password;
  private LocalDateTime regDt;
}
