package io.bhex.api.client.domain.market;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.bhex.api.client.constant.BHexConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.IOException;

/**
 * An order book entry consisting of price and quantity.
 */
@JsonDeserialize(using = OrderBookDeserializer.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBookEntry {

    private String price;
    private String qty;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BHexConstants.TO_STRING_BUILDER_STYLE)
                .append("price", price)
                .append("qty", qty)
                .toString();
    }


    public static void main(String[] args) {

        String abc = "[\"3.90000000\", \"431.00000000\"]";
        ObjectMapper mapper = new ObjectMapper();
        try {
            OrderBookEntry o = mapper.readValue(abc,OrderBookEntry.class);
            System.out.println(o);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
