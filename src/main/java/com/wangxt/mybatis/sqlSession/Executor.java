package com.wangxt.mybatis.sqlSession;

import com.wangxt.mybatis.pojo.Configuration;
import com.wangxt.mybatis.pojo.MappedStatement;

import java.util.List;

public interface Executor {

    public <E> List<E> query(Configuration configuration, MappedStatement mappedStatement, Object... params) throws Exception;

}
