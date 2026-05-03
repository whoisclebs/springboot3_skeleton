package com.whoisclebs.api.http;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ExampleHttpClient {

	@GetExchange("/")
	String home();

}
