package com.ciskow.ecommerce.checkout.config;

import com.ciskow.ecommerce.checkout.streaming.CheckoutCreatedSource;
import com.ciskow.ecommerce.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}