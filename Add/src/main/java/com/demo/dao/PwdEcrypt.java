package com.demo.dao;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class PwdEcrypt 
{
	public static void main(String[] args) 
	{
	String pwd="12345";
	
	 BCryptPasswordEncoder passwordEncoder=new BCryptPasswordEncoder(); 
     String password=passwordEncoder.encode(pwd);

          System.out.println("\n");
	      System.out.println("Password  : "+ password+"\n");
	 
	      System.out.println("Compare 1 : "+ passwordEncoder.matches("123",password));
	      System.out.println("Compare 2 : "+ passwordEncoder.matches("12345",password));
	}
}

/*   Use this dependency in pom file 
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-crypto</artifactId>
    <version>5.4.1</version>
</dependency>

*/