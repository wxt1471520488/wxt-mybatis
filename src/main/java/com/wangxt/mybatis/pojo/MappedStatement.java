package com.wangxt.mybatis.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MappedStatement {
    //id标识
    private String id;
    //返回值类型
    private String resultType;
    //参数值类型
    private String paramType;
    //sql语句
    private String sql;
}
