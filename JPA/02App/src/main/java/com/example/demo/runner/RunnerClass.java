package com.example.demo.runner;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Productt;
import com.example.demo.repo.Productrepo;

@Component
public class RunnerClass implements CommandLineRunner {

	@Autowired
	public Productrepo repo;

	@Override
	public void run(String... args) throws Exception {

		Productt p = new Productt();

		p.setpId(101);
		p.setpCode("p101");

		List<String> asList = Arrays.asList("Blue", "Red", "Green");
		p.setColors(asList);

		Set<String> asList2 = new LinkedHashSet<>();
		asList2.add("SF");
		asList2.add("LA");
		asList2.add("M1");

		p.setModels(asList2);

		Map<String, String> m = new LinkedHashMap<>();

		m.put("D1", "ABC");
		m.put("D2", "XYZ");

		p.setDetails(m);
		repo.save(p);

	}

}
