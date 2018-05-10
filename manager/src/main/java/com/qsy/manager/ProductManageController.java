package com.qsy.manager;

import com.qsy.common.ServerResponse;
import com.qsy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @version 1.0
 * @created jiangxj
 * @date 2018-05-09
 */
@Controller
@RequestMapping("/manage/product")
public class ProductManageController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/list.do")
    @ResponseBody
    public ServerResponse productSave(HttpSession session){
        return iUserService.getProductList();
    }







}
