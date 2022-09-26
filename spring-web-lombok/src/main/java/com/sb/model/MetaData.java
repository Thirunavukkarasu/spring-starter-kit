package com.sb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MetaData {
    String type;
    String description;
    String moduleName;
    String moduleFormattedName;
}
