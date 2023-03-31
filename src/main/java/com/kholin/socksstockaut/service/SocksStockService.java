package com.kholin.socksstockaut.service;

import com.kholin.socksstockaut.constant.StockOperation;
import com.kholin.socksstockaut.dto.SocksStockDto;

public interface SocksStockService {
    int getQuantityOfSocksBy(String color, StockOperation stockOperation, Integer cottonPart);

    void addSocks(SocksStockDto socksStockDto);

    void removeSocks(SocksStockDto socksStockDto);
}
