package com.hmdp.dto;

import lombok.Data;

import java.util.List;

@Data
public class ScrollResult {
    private List<?> list;
    private Long minTime;
    private Integer offset;

    public void setList(List<?> list) {
        this.list = list;
    }

    public void setMinTime(Long minTime) {
        this.minTime = minTime;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
}
