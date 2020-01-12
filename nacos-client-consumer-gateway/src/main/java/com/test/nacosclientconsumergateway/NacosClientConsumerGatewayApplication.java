package com.test.nacosclientconsumergateway;

import config.HostAddrKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class NacosClientConsumerGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosClientConsumerGatewayApplication.class, args);
    }

//    /**
//     * gateway 路由功能
//     * @param builder
//     * @return
//     */
//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                // 凡是请求了/gateway/get 路径的请求，都转发到http://localhost:8001//gateway/get
//                .route(p -> p
//                        .path("/gateway/get")
//                        .filters(f -> f.addRequestHeader("Hello", "World"))
//                        .uri("http://localhost:8001/"))
//                .build();
//    }
//
//    /**
//     * 限流功能
//     * @return
//     */
//    @Bean
//    public HostAddrKeyResolver hostAddrKeyResolver() {
//        return new HostAddrKeyResolver();
//    }
}
