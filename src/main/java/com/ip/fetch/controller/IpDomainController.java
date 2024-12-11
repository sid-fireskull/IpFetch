package com.ip.fetch.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Utils.CommonUtils;

@RestController
public class IpDomainController {
	
	@GetMapping("/ips")
	public String getIps()
	{
		List<String> ips = CommonUtils.generateDemoIps();
		StringBuilder str = new StringBuilder();
		for (String ip : ips) {
			str.append(ip);
			str.append("\n");
		}
		return str.toString();
	}
	
	@GetMapping("/domains")
	public String getDomains()
	{
		List<String> domains = CommonUtils.generateDemoIps();
		StringBuilder str = new StringBuilder();
		for (String domain : domains) {
			str.append(domain);
			str.append("\n");
		}
		return str.toString();
	}
}
