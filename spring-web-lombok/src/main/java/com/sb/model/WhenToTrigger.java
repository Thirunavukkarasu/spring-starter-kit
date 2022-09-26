package com.sb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class WhenToTrigger {
    String workflowType;
    String dayDifference;
    String dayDifferenceType;
    String time;
    String executionCycle;
    String cronExpression;
}
