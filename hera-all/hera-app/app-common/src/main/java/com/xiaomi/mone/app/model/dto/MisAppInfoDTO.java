package com.xiaomi.mone.app.model.dto;

import lombok.Data;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author wtt
 * @version 1.0
 * @description
 * @date 2021/10/13 15:34
 */
@Data
public class MisAppInfoDTO {
    private Long service_id;
    private String service;
    private String service_cn;
    private String ker_namespace;
    private String group;
    private String team_cn;
    private String user;
    private LinkedHashMap<String, List<String>> cluster_info;
    private List<Integer> tree_id;
    private List<String> managers;

}
