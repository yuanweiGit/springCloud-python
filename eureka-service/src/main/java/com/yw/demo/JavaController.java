package com.yw.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述:
 *
 * @param:
 * @return:
 * @auther: YW
 * @date: 2019/2/18 16:48
 */
@RestController
public class JavaController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getUser")
    public String getUser() {

        return "{'username': 'zhangsan', 'age': '18'}";
    }

    @RequestMapping("/msg")
    public String msg() {
        return restTemplate.getForEntity("http://sidecar-py/getMsg", String.class).getBody();
    }

}
