package com.hedian.service_es.entity;

import lombok.Data;

/**
 * Created by 和电科技 on 2019/3/15 14:08
 */
@Data
public class LogEntity {
    private static final long serialVersionUID = -763638353551774166L;

    public static final String INDEX_NAME = "index_entity";

    public static final String TYPE = "tstype";

    private Long id;

    private String name;

}
