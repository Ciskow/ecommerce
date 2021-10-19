package com.ciskow.checkout.service;

import com.ciskow.checkout.entity.CheckoutEntity;
import com.ciskow.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
