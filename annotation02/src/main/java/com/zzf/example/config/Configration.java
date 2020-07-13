package com.zzf.example.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * 该类是一个配置类
 */
@Configuration
@ComponentScan(value = "com.zzf.example")
@Import(JdbcConfigration.class)
@PropertySource("classpath:jdbc.properties")
public class Configration {
}
