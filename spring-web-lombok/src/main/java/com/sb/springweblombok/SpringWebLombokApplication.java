package com.sb.springweblombok;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sb.repository.PbTemplateRepository;
import com.sb.model.DeliveryChannel;
import com.sb.model.MetaData;
import com.sb.model.PbTemplate;
import com.sb.model.Placeholder;
import com.sb.model.TriggerDetail;
import com.sb.model.TriggerFilter;
import com.sb.model.WhenToTrigger;

@SpringBootApplication
public class SpringWebLombokApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringWebLombokApplication.class, args);
	}
}
