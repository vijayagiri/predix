package in.vishwavijay.example.spring.boot.main;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
public class ConfigureService {
	private static final Logger logger = LoggerFactory.getLogger(ConfigureService.class);

	@Bean
	public Cloud cloud() {
		logger.info("Getting cloud bean from cloud factory.");
		return new CloudFactory().getCloud();
	}

	@Bean
	//@ConfigurationProperties(DataSourceProperties.PREFIX)
	public DataSource dataSource() {
		return cloud().getSingletonServiceConnector(DataSource.class, null);
	}

}
