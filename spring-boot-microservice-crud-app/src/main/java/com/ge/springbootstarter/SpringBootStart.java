/*
 * Copyright (c) 2017 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package com.ge.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author predix -
 */
//@Configuration
//@EnableJpaRepositories
//@Import(RepositoryRestMvcAutoConfiguration.class)
//@EnableAutoConfiguration
@Import(SpringAppConfig.class)
@SpringBootApplication(scanBasePackages={"com.ge.springbootstarter"})
public class SpringBootStart 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringBootStart.class, args);
	}
}
