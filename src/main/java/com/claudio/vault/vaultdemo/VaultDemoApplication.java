package com.claudio.vault.vaultdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VaultDemoApplication {

	@Value("${username}")
	private String username;

	@Value("${password}")
	private String password;

	@GetMapping("vault-demo/")
	public String vaultDemo(){
		return "Vault demo application, username: " + username + " and password: " + password;
	}

	public static void main(String[] args) {
		SpringApplication.run(VaultDemoApplication.class, args);
	}
}
