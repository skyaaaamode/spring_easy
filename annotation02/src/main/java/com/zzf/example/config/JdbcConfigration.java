package com.zzf.example.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 该类是一个配置类
 */
@Configuration
@ComponentScan(value = "com.zzf.example")
public class JdbcConfigration {

    @Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${user}")
    private String user;
    @Value("${password}")
    private String password;
    @Bean("runner")
    public QueryRunner createQueryRunner(@Qualifier("ds01") DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    /**
     * 创建数据源对象
     */
    @Bean("ds01")
    public DataSource createDataSource(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        try {
            comboPooledDataSource.setDriverClass(driver);
            comboPooledDataSource.setJdbcUrl(url);
            comboPooledDataSource.setUser(user);
            comboPooledDataSource.setPassword(password);
            return comboPooledDataSource;
        } catch (Exception e) {
           return null;
        }

    }
    @Bean("ds02")
    public DataSource createDataSource02(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        try {
            comboPooledDataSource.setDriverClass(driver);
            comboPooledDataSource.setJdbcUrl(url);
            comboPooledDataSource.setUser(user);
            comboPooledDataSource.setPassword(password);
            return comboPooledDataSource;
        } catch (Exception e) {
            return null;
        }

    }
}
