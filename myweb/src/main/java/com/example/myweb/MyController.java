package com.example.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/")			// 주소창에 localhost:8081 / 입력하면
	public String indexPage() {
		return "index";			// index.html 파일을 열어라
	}
	
	@GetMapping("oper")		//localhost:8081/oper
	public String oper(Model model, @RequestParam("num1") String num) {
		String msg = "숫자를 입력하세요";
		int 나이 = Integer.parseInt(num);
		if(나이 >= 20) {
			msg = "성인 입니다.";
		}else if(나이 >= 14) {
			msg = "미성년자 입니다.";
		}else {
			msg="어린이입니다.";
		}
		model.addAttribute("result",msg); //result 라는 키워드로 화면에 보내기
		return "oper";				//oper.html 열어라
	}
}
