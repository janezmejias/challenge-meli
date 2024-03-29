package com.challenge.health.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import lombok.Builder;

/**
 * @author janezmejias.09
 * @version V1
 * @see <https://api.mercadolibre.com/items/MLU460998489>
 */
@Data
@Builder
public class Health implements Serializable {

    private static final long serialVersionUID = 1L;

    private Timestamp date;
    private Long avg_response_time;
    private Long total_request;
    private Long avg_response_time_api_calls;
    private Long total_count_api_calls;
    private List<InfoRequest> info_requests;
}
