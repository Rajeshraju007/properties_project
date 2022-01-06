package com.torryharris.Freshworldgrocery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

	@SpringBootApplication
	public class FreshworldGroceryApplication {

		private static final Logger LOG = LoggerFactory.getLogger(FreshworldGroceryApplication.class);

		public static void main(String[] args) {
			LOG.info("Start");
			SpringApplication.run(FreshworldGroceryApplication.class, args);
			LOG.info("End");
		}
	}
