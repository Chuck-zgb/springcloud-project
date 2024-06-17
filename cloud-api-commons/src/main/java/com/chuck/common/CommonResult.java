package com.chuck.common;

/**
 * @Auther: kejizhentan
 * @Date 2022/5/8 18:11
 * @Description: 返回给前端的数据类型实体
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    /**
     * @descrition：创建一个只有两个参数的构造方法
     * @auther: kejizhentan
     * @date: 2022/5/8 18:11
     */
    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

