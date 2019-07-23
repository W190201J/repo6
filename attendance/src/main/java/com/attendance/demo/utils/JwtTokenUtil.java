package com.attendance.demo.utils;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.DefaultClock;

/**
 * @author GRC
 * @version 2019年7月16日 下午6:22:28 
 * 生成Token,验证Token
 */

@Component
public class JwtTokenUtil {

	// 定义计时器Clock
	private Clock clock = DefaultClock.INSTANCE;

	// 秘钥，从application.properties配置文件中读取
	@Value("${jwt.secret}")
	private String secret;

	// jwt失效时间--->单位为秒
	@Value("${jwt.expiration}")
	private long expiration = 1800L;

	// 创建JWT Token
	public String createToken(String id, String password) {
		Date time = clock.now();

		// 添加JWT的包含部分,有三部分：头部（header）、载荷（payload）、签证（signature）
		JwtBuilder jwtBuilder = Jwts.builder().setHeaderParam("typ", "JWT").setIssuedAt(time)// 设置jwt创建时间
				.setIssuer(id)// 设置当前用户信息
				.setExpiration(expirationDate(time))// 设置失效时间
				.setSubject(id)
				.claim("id", id)// 通过claim()方法可添加若干属性，也可以添加一个对象
				.claim("pass", password)
				.signWith(SignatureAlgorithm.HS256, secret);// 设置加密算法、指定密钥
		return jwtBuilder.compact();
	}

	// 验证JWT Token
	public Claims parseToken(String token) {
		// 根据密钥解析Token,解析成功返回Claims;解析不成功会抛出异常
		Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		return claims;
	}

	// 获得失效时间
	private Date expirationDate(Date createDate) {
		return new Date(createDate.getTime() + expiration * 1000);
	}
}
