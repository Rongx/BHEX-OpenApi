package io.bhex.api.client.domain.market;

import io.bhex.api.client.constant.BHexConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 24 hour price change statistics for a ticker.
 */
public class TickerStatistics {

    private Long exchangeId;
    /**
     * Ticker symbol.
     */
    private String symbol;

    /**
     * Last price.
     */
    private String lastPrice;


    /**
     * Open price 24 hours ago.
     */
    private String openPrice;

    /**
     * Highest price during the past 24 hours.
     */
    private String highPrice;

    /**
     * Lowest price during the past 24 hours.
     */
    private String lowPrice;

    /**
     * Total volume during the past 24 hours.
     */
    private String volume;

    /**
     * Open time.
     */
    private long time;

    public Long getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Long exchangeId) {
        this.exchangeId = exchangeId;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(String lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(String openPrice) {
        this.openPrice = openPrice;
    }

    public String getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(String highPrice) {
        this.highPrice = highPrice;
    }

    public String getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(String lowPrice) {
        this.lowPrice = lowPrice;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BHexConstants.TO_STRING_BUILDER_STYLE)
                .append("exchangeId", exchangeId)
                .append("symbol", symbol)
                .append("lastPrice", lastPrice)
                .append("openPrice", openPrice)
                .append("highPrice", highPrice)
                .append("lowPrice", lowPrice)
                .append("volume", volume)
                .append("time", time)
                .toString();
    }
}
