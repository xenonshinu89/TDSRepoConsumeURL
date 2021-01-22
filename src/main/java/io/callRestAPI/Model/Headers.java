package io.callRestAPI.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Headers {
	@JsonProperty("x-forwarded-proto")
	private String x_forwarded_proto;
	
	@JsonProperty("x-forwarded-port")
	private String x_forwarded_port;

	private String host;
	
	@JsonProperty("x-amzn-trace-id")
	private String x_amzn_trace_id;
	
	@JsonProperty("user-agent")
	private String user_agent;
	
	@JsonProperty("cache-control")
	private String cache_control;
	
	private String authorization;
	
	@JsonProperty("postman-token")
	private String postman_token;
	

	private String accept;
	
	@JsonProperty("accept-encoding")
	private String accept_encoding;
	
	
	@JsonProperty("accept-language")
	private String accept_language;
	
	public String getX_forwarded_proto() {
		return x_forwarded_proto;
	}
	public void setX_forwarded_proto(String x_forwarded_proto) {
		this.x_forwarded_proto = x_forwarded_proto;
	}
	public String getX_forwarded_port() {
		return x_forwarded_port;
	}
	public void setX_forwarded_port(String x_forwarded_port) {
		this.x_forwarded_port = x_forwarded_port;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getX_amzn_trace_id() {
		return x_amzn_trace_id;
	}
	public void setX_amzn_trace_id(String x_amzn_trace_id) {
		this.x_amzn_trace_id = x_amzn_trace_id;
	}
	public String getUser_agent() {
		return user_agent;
	}
	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}
	public String getCache_control() {
		return cache_control;
	}
	public void setCache_control(String cache_control) {
		this.cache_control = cache_control;
	}
	public String getAuthorization() {
		return authorization;
	}
	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}
	public String getPostman_token() {
		return postman_token;
	}
	public void setPostman_token(String postman_token) {
		this.postman_token = postman_token;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getAccept_encoding() {
		return accept_encoding;
	}
	public void setAccept_encoding(String accept_encoding) {
		this.accept_encoding = accept_encoding;
	}
	public String getAccept_language() {
		return accept_language;
	}
	public void setAccept_language(String accept_language) {
		this.accept_language = accept_language;
	}
	public Headers(String x_forwarded_proto, String x_forwarded_port, String host, String x_amzn_trace_id,
			String user_agent, String cache_control, String authorization, String postman_token, String accept,
			String accept_encoding, String accept_language) {
		
		this.x_forwarded_proto = x_forwarded_proto;
		this.x_forwarded_port = x_forwarded_port;
		this.host = host;
		this.x_amzn_trace_id = x_amzn_trace_id;
		this.user_agent = user_agent;
		this.cache_control = cache_control;
		this.authorization = authorization;
		this.postman_token = postman_token;
		this.accept = accept;
		this.accept_encoding = accept_encoding;
		this.accept_language = accept_language;
	}
	public Headers() {
		
	}
	
	
	

}
