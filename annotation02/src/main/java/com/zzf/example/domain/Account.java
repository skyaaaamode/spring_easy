package com.zzf.example.domain;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/11 22:51
 * @description
 */
@Data
public class Account {
    private Integer id;
    private String name;
    private Float money;
}
