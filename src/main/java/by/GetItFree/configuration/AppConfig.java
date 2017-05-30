package by.GetItFree.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.ui.velocity.VelocityEngineFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.Properties;

@Configuration
@EnableWebMvc
@PropertySource(value = "classpath:util.properties")
@ComponentScan(basePackages = "by.GetItFree")
public class AppConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        return messageSource;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    /**
     *  Java Mail Configuration
     */
    @Value("${java.mail.username}") String mailUsername;
    @Value("${java.mail.password}") String mailPassword;
    @Value("${java.mail.host}") String mailHost;

    /**
     *  <bean id="mailSender" class="org.springframework.mail.javamail.JavaMailSenderImpl">
     */
    @Bean(name = "mailSender")
    public JavaMailSenderImpl getJavaMailSender() {
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setUsername("popondosina13@gmail.com");
        javaMailSender.setPassword("l2zloppc");
        javaMailSender.setPort(465);

        Properties javaMailProperties = new Properties();
        javaMailProperties.put("mail.smtp.auth", true);
        javaMailProperties.put("mail.smtp.starttls.enable", true);
        javaMailProperties.put("mail.smtp.starttls.required", true);
        javaMailProperties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        javaMailProperties.put("mail.smtp.host", "smtp.gmail.com");

        javaMailSender.setJavaMailProperties(javaMailProperties);
        return javaMailSender;
    }

    /**
     * <bean id="velocityEngine" class="org.springframework.ui.velocity.VelocityEngineFactoryBean">
     */
    @Bean(name = "velocityEngine")
    public VelocityEngineFactoryBean getVelocityEngineFactoryBean() {
        VelocityEngineFactoryBean bean = new VelocityEngineFactoryBean();
        bean.setResourceLoaderPath("/WEB-INF/email-templates/");
        return bean;
    }
}

