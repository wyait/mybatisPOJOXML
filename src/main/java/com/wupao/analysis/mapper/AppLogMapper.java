package com.wupao.analysis.mapper;

import com.wupao.analysis.pojo.AppLog;

public interface AppLogMapper {
    int insert(AppLog record);

    int insertSelective(AppLog record);
}