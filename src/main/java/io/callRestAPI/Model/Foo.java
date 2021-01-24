package io.callRestAPI.Model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown=true)
public class Foo {
	
	private Args args;
	private Headers headers;
	private String url;
	
	public Foo() {
		
	}

	public Foo(Args args, Headers headers, String url) {
		
		this.args = args;
		this.headers = headers;
		this.url = url;
	}

	public Headers getHeaders() {
		return headers;
	}

	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Args getArgs() {
		return args;
	}

	public void setArgs(Args args) {
		this.args = args;
	}

	
	
	

}
