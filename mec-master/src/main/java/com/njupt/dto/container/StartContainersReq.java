package com.njupt.dto.container;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class StartContainersReq {

    @ApiModelProperty("容器id")
    private String containerId;

}
