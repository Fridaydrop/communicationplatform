package com.markerhub.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2022-09-30 10:41
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
}
