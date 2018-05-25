/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HelloContorller
 * Author:   DM-admin
 * Date:     2018/5/25 17:22
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dm.dmspringbootmybatis.contorller;

import com.baomidou.mybatisplus.activerecord.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author DM-admin
 * @create 2018/5/25
 * @since 1.0.0
 */
@Controller
public class HelloContorller {
//    private Logger logger = LoggerFactory.getLogger(HelloController.class);
    /**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(org.springframework.ui.Model model) {
        model.addAttribute("name", "Dear DM");
        return "index";
    }
}