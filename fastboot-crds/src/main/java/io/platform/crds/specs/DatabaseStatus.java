package io.platform.crds.specs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DatabaseStatus {
    private String host;
    private Integer port;
    private String database;
    private String secretName;
}