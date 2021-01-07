package com.github.shuaidd.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.shuaidd.dto.MomentDetail;

import java.util.List;

/**
 * 描述
 *
 * @author ddshuai
 * @date 2021-01-05 21:35
 **/
public class MomentListResponse extends AbstractBaseResponse {
    @JsonProperty("next_cursor")
    private String nextCursor;
    @JsonProperty("moment_list")
    private List<MomentDetail> momentDetails;

    public String getNextCursor() {
        return nextCursor;
    }

    public void setNextCursor(String nextCursor) {
        this.nextCursor = nextCursor;
    }

    public List<MomentDetail> getMomentDetails() {
        return momentDetails;
    }

    public void setMomentDetails(List<MomentDetail> momentDetails) {
        this.momentDetails = momentDetails;
    }
}