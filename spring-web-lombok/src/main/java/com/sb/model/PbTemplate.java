package com.sb.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PbTemplate {
    @Id
    public String id;

    String pbTitle;
    String pbType;
    String status;
    Date createdAt;
    Date updatedAt;
    String createdBy;
    String updatedBy;
    MetaData metaData;
    WhenToTrigger whenToTrigger;
    TriggerDetail triggerDetail;
    List<DeliveryChannel> deliveryChannels;
}
