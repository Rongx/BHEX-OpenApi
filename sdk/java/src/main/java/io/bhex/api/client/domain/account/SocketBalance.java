package io.bhex.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocketBalance {

    @JsonProperty("a")
    private String asset;

    @JsonProperty("f")
    private String free;

    @JsonProperty("l")
    private String locked;

}
