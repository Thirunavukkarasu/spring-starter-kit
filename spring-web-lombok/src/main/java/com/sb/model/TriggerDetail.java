package com.sb.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TriggerDetail {
    List<TriggerFilter> triggerFilters;
    String expression;
}
