package com.ycw.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ychw
 * @Description:
 * @Date: 2020/12/10 13:59
 */
@Data
public class User implements Serializable {

    private int id;
    private String username;
    private String password;

}
