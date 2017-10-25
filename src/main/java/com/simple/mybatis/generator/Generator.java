package com.simple.mybatis.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
/**
 * 
 * @项目名称：mybatisPOJOXML
 * @类名称：Generator
 * @类描述：mybatis根据数据表结构自动生成POJO实体类和对应的.xml文件
 * </br>启动线程
 * @创建人：wyait
 * @创建时间：2017年10月9日 下午5:44:26 
 * @version：
 */
public class Generator {
    
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //加载src/main/resources目录下的配置文件
        File configFile = Resources.getResourceAsFile("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

}
