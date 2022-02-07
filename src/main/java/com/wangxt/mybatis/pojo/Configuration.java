package com.wangxt.mybatis.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Configuration {

    // 数据源对象
    private DataSource dataSource;

    // key: statementId  value:封装好的mappedStatement对象
    Map<String,MappedStatement> mappedStatementMap = new HashMap<>();
}
