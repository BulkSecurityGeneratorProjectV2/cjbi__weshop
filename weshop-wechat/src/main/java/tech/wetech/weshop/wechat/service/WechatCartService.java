package tech.wetech.weshop.wechat.service;

import tech.wetech.weshop.wechat.vo.CartCheckedVO;
import tech.wetech.weshop.wechat.vo.CartCheckoutVO;
import tech.wetech.weshop.wechat.vo.CartParamVO;
import tech.wetech.weshop.wechat.vo.CartResultVO;

public interface WechatCartService {

    CartResultVO getCart();

    void checkedCartGoods(CartCheckedVO cartCheckedVO);

    void addGoodsToCart(CartParamVO cartParamDTO);

    void updateGoods(CartParamVO cartParamDTO);

    CartCheckoutVO checkoutCart(Integer addressId, Integer couponId);

}