package com.template.activity.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "client", url = "https://nenayebalovo.com")
public class ApiClient {
}
