package com.itchain.samplemsa.samplemsa.customer.domain;

import com.itchain.samplemsa.samplemsa.customer.domain.dto.TradeInfoDTO;

import java.util.List;

public interface CustomerPriceService {
    int getPriceOfSignedTrades(String customerID);
}