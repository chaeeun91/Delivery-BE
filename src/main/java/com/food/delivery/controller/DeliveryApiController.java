package com.food.delivery.controller; // ★ 여기 패키지 이름이 중요합니다!

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DeliveryApiController {

    // 1. 주문 생성 API
    @PostMapping("/orders")
    public Map<String, Object> createOrder(@RequestBody Map<String, Object> orderData) {
        System.out.println("=== 주문 요청 도착 ===");
        System.out.println("주문 정보: " + orderData);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "주문이 정상적으로 접수되었습니다.");
        response.put("timestamp", LocalDateTime.now());

        return response;
    }

    // 2. 실시간 위치 전송 API (라이더용)
    @PostMapping("/delivery/location")
    public Map<String, Object> updateLocation(@RequestBody Map<String, Object> locationData) {
        System.out.println("=== 라이더 위치 수신 ===");
        System.out.println("위도: " + locationData.get("lat"));
        System.out.println("경도: " + locationData.get("lng"));

        Map<String, Object> response = new HashMap<>();
        response.put("status", "received");

        return response;
    }
}