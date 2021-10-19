package com.ciskow.ecommerce.checkout.listener;

import com.ciskow.ecommerce.checkout.streaming.PaymentPaidSink;
import com.ciskow.ecommerce.checkout.entity.CheckoutEntity;
import com.ciskow.ecommerce.checkout.service.CheckoutService;
import com.hatanaka.ecommerce.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}
