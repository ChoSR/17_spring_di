package com.spring.di.tobe;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class ToBeServiceImpl implements ToBeService {
	
	@Inject		// @Autowired
	private ToBeDao tobeDao;
	
}
