package com.sb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.model.DeliveryChannel;
import com.sb.model.MetaData;
import com.sb.model.PbTemplate;
import com.sb.model.Placeholder;
import com.sb.model.TriggerDetail;
import com.sb.model.TriggerFilter;
import com.sb.model.WhenToTrigger;
import com.sb.repository.PbTemplateRepository;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class PbTemplateController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PbTemplateRepository repository;

    @RequestMapping(value = "getTemplates", method = RequestMethod.POST)
    public List<PbTemplate> getTemplates() {
        // Set Metadata
        MetaData metaData = new MetaData();
        metaData.setDescription("");
        metaData.setType("");
        metaData.setModuleName("");
        metaData.setModuleFormattedName("");

        // Set When To Trigger
        WhenToTrigger whenToTrigger = new WhenToTrigger();
        whenToTrigger.setWorkflowType("");
        whenToTrigger.setExecutionCycle("daily");
        whenToTrigger.setDayDifference("2");
        whenToTrigger.setDayDifferenceType("date_based");
        whenToTrigger.setTime("00:00");
        whenToTrigger.setCronExpression("* * * * */2");

        // Set Trigger Detail
        TriggerDetail triggerDetail = new TriggerDetail();
        TriggerFilter triggerFilter = new TriggerFilter();

        triggerFilter.setOrder(1);
        triggerFilter.setColumn("");
        triggerFilter.setComparator("");
        triggerFilter.setValue("");
        List<TriggerFilter> triggerFilters = new ArrayList<>();
        triggerFilters.add(triggerFilter);

        triggerDetail.setExpression("(1 AND 2)");
        triggerDetail.setTriggerFilters(triggerFilters);

        // Set Delivery Channels
        Placeholder placeholder = new Placeholder();
        placeholder.setName("customer_name");
        placeholder.setEntity("customer");

        List<Placeholder> placeholders = new ArrayList<>();
        placeholders.add(placeholder);

        DeliveryChannel deliveryChannel = new DeliveryChannel();
        deliveryChannel.setName("sms");
        deliveryChannel.setTemplate(
                "Hello <customer_name>, You loan EMI is pending on <emi_date>. Please be ready with the payment");

        deliveryChannel.setPlaceholders(placeholders);

        List<DeliveryChannel> deliveryChannels = new ArrayList<>();
        deliveryChannels.add(deliveryChannel);

        // Set the final playbook template
        PbTemplate pbTemplate = new PbTemplate();

        pbTemplate.setPbTitle("Email Reminder Template");
        pbTemplate.setPbType("doc");
        pbTemplate.setStatus("active");
        pbTemplate.setCreatedAt(new Date());
        pbTemplate.setUpdatedAt(new Date());
        pbTemplate.setCreatedBy("system");
        pbTemplate.setUpdatedBy("system");
        pbTemplate.setMetaData(metaData);
        pbTemplate.setWhenToTrigger(whenToTrigger);
        pbTemplate.setTriggerDetail(triggerDetail);
        pbTemplate.setDeliveryChannels(deliveryChannels);

        List<PbTemplate> pbTemplates = new ArrayList<>();
        pbTemplates.add(pbTemplate);

        return pbTemplates;
    }

    @RequestMapping(value = "healthcheck", method = RequestMethod.GET)
    public String requestMethodName() {
        logger.info("Entering Healthcheck!");
        String responseContent = "<html>\n" + "<header><title>Welcome</title></header>\n" +
                "<body><h1>\n" + "Hello Sleuth!\n"
                + "</h1><p>Spring Cloud Sleuth allows you to aggregate and track log entries as requests move through a distributed software system. In a monolithic system, it’s relatively easy to track requests as they move through the codebase because all requests can easily be logged to the same log file. You can generally just filter the log by the thread ID. But in a distributed system, a single client request may sprawl across any number of discrete cloud services. Any given service may have multiple instances handling different parts of the request. There is no single log file, with a request spread across multiple server instances. How do you use logs in this situation? How do you trace a request flow across a service mesh?</p></body>\n"
                + "</html>";
        logger.info("Leaving Healthcheck!");
        return responseContent;
    }
}
