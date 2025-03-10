package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ioc.Service;
import com.example.demo.util.Calculadora;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	Service srv;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("arrancado");
		srv.save();
		ejemplosPruebas();

	}
	private void ejemplosPruebas(){
		var calc = new Calculadora();
		System.err.println("suma: " + calc.sumar(2, 3));
	}

}
