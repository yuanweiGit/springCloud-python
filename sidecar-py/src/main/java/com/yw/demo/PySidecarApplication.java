package com.yw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
/**
 *
 * 功能描述:
 *
 * @param:
 * @param:
 * @param:
 * @return:
 * @auther: YW
 * @date: 2019/2/18 16:53
 */
@EnableSidecar
@SpringBootApplication
public class PySidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(PySidecarApplication.class, args);
	}
}
