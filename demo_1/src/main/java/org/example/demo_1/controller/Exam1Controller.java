package org.example.demo_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller //  IoC
//@RestController // new 로 객체를 메모리에 올리는게 아니라 IoC 제어의 역전
public class Exam1Controller {

    // http://localhost:8080/example/test1
    @GetMapping("/example/test1")
    public String test1(Model model) { // Model 이라는 가방에 담아서 보내자

        model.addAttribute("stringValue", "안녕 머스태치야~");
        model.addAttribute("intValue", 1234);
        model.addAttribute("hasData", false);
        model.addAttribute("data", "비밀글");

        /** 리스트 */
        List<String> items = new ArrayList<>();
        items.add("사과");
        items.add("바나나");
        items.add("오렌지");

        model.addAttribute("items", items);

        /** Map */
        Map<String, String> map = new HashMap<>();
        map.put("key1", "1234");
        map.put("key2", "5678");

        model.addAttribute("map", map);

        // /templates/test1.mustache 라고 했어야 했음. yml 안하면
        return "test1";
    }

    // http://localhost:8080/example/test1
    @GetMapping("/example/test2")
    public String test2(Model model) {

        model.addAttribute("stringValue", "안녕 머스태치야~");
        model.addAttribute("intValue", 1234);
        model.addAttribute("hasData", false);
        model.addAttribute("data", "비밀글");

        /** 리스트 - 키 값 없음 */
        List<String> items = new ArrayList<>();
        items.add("사과");
        items.add("바나나");
        items.add("오렌지");

        model.addAttribute("items", items);

        /** Map 키 값으로 전송*/
        Map<String, String> map = new HashMap<>();
        map.put("key1", "1234");
        map.put("key2", "5678");

        model.addAttribute("map", map);

        // /templates/test2.mustache
        return "test2";
    }
}
