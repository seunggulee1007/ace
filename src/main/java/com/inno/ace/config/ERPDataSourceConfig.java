package com.inno.ace.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @apiNote rws 데이터 베이스 설정
 * @author es-seungglee
 *
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.inno.ace.model.dao.erp", sqlSessionFactoryRef = "aceSqlSessionFactory")
public class ERPDataSourceConfig extends HikariConfig {
    
    @Bean(name = "erpHikariDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.erp")
    public DataSource dataSourceCreator() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean(name="erpDataSource")
    public DataSource dataSource(@Qualifier("erpHikariDataSource") DataSource dataSource) {
        return new LazyConnectionDataSourceProxy(dataSource);
    }

    @Bean(name = "erpSqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(
            @Qualifier("erpDataSource") DataSource dataSource,
            ApplicationContext context) throws Exception {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        
        sqlSessionFactory.setDataSource(dataSource);
        sqlSessionFactory.setMapperLocations(context.getResources("classpath:mybatis/mapper/erp/**/*.xml"));
        sqlSessionFactory.setConfigLocation(context.getResource("classpath:mybatis/Mybatis-config.xml"));
        
        return sqlSessionFactory.getObject();
    }
    
    @Bean(name = "erpSqlSession")
    public SqlSessionTemplate sqlSession(@Qualifier("erpSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
    
    @Bean(name = "erpTransactionManager")
    public PlatformTransactionManager aceTransactionManager(@Autowired @Qualifier("aceDataSource") DataSource secondaryDataSource) {
        return new DataSourceTransactionManager(secondaryDataSource);
    }
    
}
