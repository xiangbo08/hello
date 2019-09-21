package com.xiangbo.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Product implements Serializable {

    private String id;// 主键
    private String productNum;// 编号 唯一
    private String productName;// 名称
    private String cityName;// 出发城市
    private Date departureTime;//  出发时间
    private String departureTimeStr;
    private double productPrice;//产品价格
    private String productDesc;//产品描述
    private Integer productStatus;//状态 0关闭 1开启
    private String productStatusStr;


}
