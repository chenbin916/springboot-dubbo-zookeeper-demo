package com.cb.dubbo.demo.provider;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
 
@MapperScan("com.cb.dubbo.demo.provider.mapper")
@ImportResource(locations={"provider.xml"})
@SpringBootApplication
public class ProviderApp { 
   /* @Autowired  
    private Environment env;  */
    private static volatile boolean running = true;
	@Bean  
	@ConfigurationProperties(prefix="spring.datasource") 
    public DataSource dataSource() {  
        return new com.alibaba.druid.pool.DruidDataSource();  
    }     
  //提供SqlSeesion  
    @Bean  
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {  
   
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();  
        sqlSessionFactoryBean.setDataSource(dataSource());  
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();  
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));  //最重要的是读取sql语句的xml文件
        return sqlSessionFactoryBean.getObject();  
    } 
    @Bean  
    public PlatformTransactionManager transactionManager() {  
        return new DataSourceTransactionManager(dataSource());  
    }  
    public static void main( String[] args )
    {
    	SpringApplication.run(ProviderApp.class, args);  
        System.out.println( "服务提供者注册成功" );
    }
    
}
