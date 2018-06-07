package cn.lancel0t.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lancel0t.seckill.domain.CodeMsg;
import cn.lancel0t.seckill.domain.Result;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
    @ResponseBody
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/helloOK")
    @ResponseBody
	public Result<String> helloOK() {
		return Result.success("hello,OK");
	}

	@RequestMapping("/helloError")
    @ResponseBody
	public Result<String> helloError() {
		return Result.error(CodeMsg.SERVER_ERROR);
	}

	@RequestMapping("/thymeleaf")
	public String thymeleaf(Model model) {
		model.addAttribute("name", "lancel0t");
		return "hello";
	}
}
