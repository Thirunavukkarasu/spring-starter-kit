package com.sb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TriggerFilter {
    String column;
    String comparator;
    String value;
    Integer order;
}
