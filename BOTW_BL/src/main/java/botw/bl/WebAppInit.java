package botw.bl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "botw" })
public class WebAppInit extends WebMvcConfigurerAdapter {
	
	/**
	 * Configure and customize a Spring RestTemplate for use in the application. Add message converters and the request
	 * factory which disables the hostname verification.
	 * 
	 * @return a fully configured RestTemplate
	 */
	@Bean
	public RestTemplate getRestTemplate() {
		RestTemplate template = new RestTemplate();
		return template;
	}
}
