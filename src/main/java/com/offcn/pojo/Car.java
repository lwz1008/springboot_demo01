package com.offcn.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: lhq
 * @Date: 2020/9/3 10:16
 * @Description: 实体类
 */
@Data  //setter  getter
@AllArgsConstructor  //全参数的构造方法
@NoArgsConstructor //无参构造方法
public class Car implements Serializable {

    private Long id;
    private String name;
    private double price;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;

}
