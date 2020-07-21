package com.gsomogyi.currencyconversionservice.web;

import com.gsomogyi.currencyconversionservice.model.CurrencyConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
        CurrencyConversion currencyConversion = new CurrencyConversion();
        currencyConversion.setId(1L);
        currencyConversion.setFrom(from);
        currencyConversion.setTo(to);
        currencyConversion.setConversionMultiple(BigDecimal.ONE);
        currencyConversion.setQuantity(quantity);
        currencyConversion.setCalculatedAmount(BigDecimal.ONE);
        return currencyConversion;
    }
}
