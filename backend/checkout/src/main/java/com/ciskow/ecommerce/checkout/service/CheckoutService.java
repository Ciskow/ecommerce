package com.ciskow.ecommerce.checkout.service;

import com.ciskow.ecommerce.checkout.resource.checkout.CheckoutRequest;
import com.ciskow.ecommerce.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
