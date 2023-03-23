package com.apigateway.jwt;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.apigateway.model.Model;
import com.apigateway.security.SecurityDetails;
import com.apigateway.security.SecurityService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class SecurityUtils implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final  String  key="9z$C&F)J@NcQfTjWnZr4u7x!A%D*G-KaPdSgUkXp2s5v8y/B?E(H+MbQeThWmYq3";
    final  long exptime= 1000*60*60*24;
	
	public String generatetoken(SecurityDetails details) {
		Map<String, Object> claims=new HashMap<>();
		
		return Jwts.builder().setClaims(claims)
				.setSubject(details.getUsername())
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+exptime))
				.signWith(SignatureAlgorithm.HS512, key)
				.compact();
	}
	
	
	public String getUsername(String token) {
		return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody().getSubject();
	}
	
	
	public Boolean ValidToken(String token, SecurityDetails details) {
		Boolean validation=Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody()
				.getExpiration().before(new Date());
	
		return ((details.getUsername()).equals(getUsername(token))
				&& !validation);
	}
	
	
}
