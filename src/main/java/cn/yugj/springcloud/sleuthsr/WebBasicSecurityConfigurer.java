package cn.yugj.springcloud.sleuthsr;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * security boot 2.0 配置方式
 *
 * @author yugj
 * @date 2019/1/29 上午11:10.
 */
@Configuration
public class WebBasicSecurityConfigurer extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/sys/**").hasRole("sys")
                .anyRequest().permitAll()
                .and().httpBasic();
    }
}
