package com.gsomogyi.currencyexchangeservice.repository;

import com.gsomogyi.currencyexchangeservice.model.ExchangeValue;
import org.springframework.data.repository.CrudRepository;

public interface ExchangeValueRepository extends CrudRepository<ExchangeValue, Long> {

    ExchangeValue findByCurrencyFromAndCurrencyTo(String from, String to);
}



