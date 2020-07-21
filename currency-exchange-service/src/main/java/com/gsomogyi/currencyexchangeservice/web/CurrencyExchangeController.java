package com.gsomogyi.currencyexchangeservice.web;

import com.gsomogyi.currencyexchangeservice.model.ExchangeValue;
import com.gsomogyi.currencyexchangeservice.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    Environment environment;

    private final ExchangeValueRepository exchangeValueRepository;

    public CurrencyExchangeController(ExchangeValueRepository exchangeValueRepository) {
        this.exchangeValueRepository = exchangeValueRepository;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to) {
        return exchangeValueRepository.findByCurrencyFromAndCurrencyTo(from, to);
    }
}
