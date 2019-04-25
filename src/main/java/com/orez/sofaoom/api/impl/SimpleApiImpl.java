package com.orez.sofaoom.api.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.orez.sofaoom.api.SimpleApi;
import org.springframework.stereotype.Component;

@Component
@SofaService(interfaceType = SimpleApi.class, bindings = @SofaServiceBinding(bindingType = "rest"))
public class SimpleApiImpl implements SimpleApi {
  @Override
  public String post(String requestBody) {
    return requestBody;
  }
}
