package com.info;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.info.entity.Student;
import com.info.repository.StudentRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{
	private PasswordEncoder passwordEncoder;

	public StudentManagementApplication(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	}


	@Bean
	public ModelMapper modelMapper(){

		return new ModelMapper();
	}


	@Override
	public void run(String... args) throws Exception {
System.out.println(this.passwordEncoder.encode("xyz"));
		System.out.println(this.passwordEncoder.encode("1234"));
	}
}
