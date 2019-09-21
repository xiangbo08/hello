package com.xiangbo.web;

import com.xiangbo.domain.Product;
import com.xiangbo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService service;

    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv = new ModelAndView();
        System.out.println("我被访问了" );
        List<Product> all = service.findAll();
        mv.addObject("productList" ,all);
        mv.setViewName("product-list");
      return mv;
    }


}
