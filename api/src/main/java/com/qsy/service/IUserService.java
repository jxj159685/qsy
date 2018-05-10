package com.qsy.service;

import com.qsy.pojo.Product;
import com.qsy.common.ServerResponse;

/**
 * @version 1.0
 * @created jiangxj
 * @date 2018-05-09
 */
public interface IUserService {
    Integer insertProduct(Product product);

    ServerResponse getProductList();
}
