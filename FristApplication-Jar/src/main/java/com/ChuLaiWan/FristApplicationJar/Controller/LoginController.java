package com.ChuLaiWan.FristApplicationJar.Controller;

import com.ChuLaiWan.FristApplicationJar.Entity.User;
import com.ChuLaiWan.FristApplicationJar.Result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;
/*
* 这里我们设定账号是 admin，密码是 123456，分别与接收到的 User 类的 username 和 password 进行比较，
* 根据结果返回不同的 Result，即不同的响应码。前端如果接收到成功的响应码（200），则跳转到 /index 页面。
* */
@Controller
public class LoginController {
    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
