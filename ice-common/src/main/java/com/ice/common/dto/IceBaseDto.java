package com.ice.common.dto;

import lombok.Data;

/**
 * @author waitmoon
 */
@Data
public final class IceBaseDto {

    private Long id;

    private String scenes;

    private Long confId;

    private Byte timeType;

    private Long start;

    private Long end;

    private Byte debug;

    private Long priority;

    private Integer app;

    private String name;
}
