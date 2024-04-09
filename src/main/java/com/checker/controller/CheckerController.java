package com.checker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckerController {
	@GetMapping(value = "/check")
	public String getHello() {
		return "Working.....";
	}
}