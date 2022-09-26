package com.sb.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeliveryChannel {
    String name;
    String template;
    List<Placeholder> placeholders;
}
