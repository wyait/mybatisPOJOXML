package com.wupao.analysis.mapper;

import com.wupao.analysis.pojo.ErrorLog;

public interface ErrorLogMapper {
    int insert(ErrorLog record);

    int insertSelective(ErrorLog record);
}