package com.skc.mybatis.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Student {

	private Long id;
	private String name;
	private String email;
	private Integer age;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
<<<<<<< HEAD
=======
//	private LocalDateTime created_at;
//	private LocalDateTime updated_at;
>>>>>>> 9376e3ce26371b7d3a5688b083db5312df2dfaa9

}
