package cn.lancel0t.seckill.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lancel0t.seckill.domain.CodeMsg;
import cn.lancel0t.seckill.domain.Result;
import cn.lancel0t.seckill.domain.User;
import cn.lancel0t.seckill.service.UserService;

@Controller
public class SampleWorldController {

	@Autowired
	UserService userService;

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

	@RequestMapping("/getUserById")
	@ResponseBody
	public Result<User> getUserById() {
		return Result.success(userService.getById(1));
	}

	@RequestMapping("/addUser")
	@ResponseBody
	public Result<Integer> addUser() {
		User user = new User();
		user.setId(1);
		user.setName("name" + new Random().nextInt(100));
		return Result.success(userService.addUser(user));
	}

	@RequestMapping("/transaction")
	@ResponseBody
	public Result<Boolean> transaction() {
		return Result.success(userService.transaction());
	}
}
