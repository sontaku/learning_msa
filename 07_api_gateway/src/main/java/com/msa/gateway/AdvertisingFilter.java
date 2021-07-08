package com.msa.gateway;

import com.msa.gateway.AdvertisingFilter.Config;
import lombok.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class AdvertisingFilter extends AbstractGatewayFilterFactory<Config> {
  private static final Logger logger = LogManager.getLogger(AdvertisingFilter.class);
  public AdvertisingFilter() {
    super(Config.class);
  }

  @Override
  public GatewayFilter apply(Config config) {
    return ((exchange, chain) -> {
      logger.info("AdvertisingFilter baseMessage>>>>>>" + config.getBaseMessage());
      if (config.isPreLogger()) {
        logger.info("AdvertisingFilter Start>>>>>>" + exchange.getRequest());
      }
      return chain.filter(exchange).then(Mono.fromRunnable(()->{
        if (config.isPostLogger()) {
          logger.info("AdvertisingFilter End>>>>>>" + exchange.getResponse());
        }
      }));
    });
  }

  @Data
  public static class Config {
    private String baseMessage;
    private boolean preLogger;
    private boolean postLogger;
  }
}
