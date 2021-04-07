package com.yyp.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * springBoot项目启动入口，由于内嵌tomcat所以直接启动此类即可
 *
 * SpringBootApplication：用于标记此类为springboot启动类
 * 启动类需要放到所有需要扫描进spring容器中类的父目录中
 * 因为默认将启动类所在的路径当作包扫面的基础路径
 *   SpringBoot的启动类（入口）
 *   @Configuration spring.xml 也是配置类
 *   @ComponentScan = <context:component-scan basePackages="cn.tulingxueyuan"></context:component-scan>
 *      Spring底层在解析配置类， 回去解析@ComponentScan,读取basePackages，
 *       如果没有读取到，会将当前配置类所在的包当做扫描包
 *
 *  位置： 最好放在需要扫描包的根目录、或者说放在所有Bean的顶层目录中
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public Integer idInteger(){
        Integer id = new Integer(1);
        return id;
    }
}
