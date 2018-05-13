package com.qsy.service.impl;

import com.qsy.pojo.Product;
import com.qsy.common.ServerResponse;
import com.qsy.dao.ProductMapper;
import com.qsy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @created jiangxj
 * @date 2018-05-09
 */
@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private ProductMapper productMapper;
    @Override
    public Integer insertProduct(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public ServerResponse getProductList() {
        //不好吃的 真的吗
        return ServerResponse.createBySuccess(productMapper.selectByPrimaryKey("1"));
    }
}
