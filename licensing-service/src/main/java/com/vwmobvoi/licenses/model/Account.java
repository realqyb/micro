package com.vwmobvoi.licenses.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author ybqi, ybqi@vw-mobvoi.com
 * 18/12/2017
 */

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Account {
  private String vmid;
  private String nickname;
  private String truename;
  private String mobilePhone;
  private String password;
  private int gender;
  private String imgUrl;
  private String origin;
  private String email;

  private Date birthday;
  private int height;
  private int weight;
  private int homeAddrID;
  private int workAddrID;
}
