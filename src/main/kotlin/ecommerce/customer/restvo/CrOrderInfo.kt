package ecommerce.customer.restvo

import ecommerce.common.databean.ShopInfo

/**
 * Created by syoka on 2018/6/25.
 */
data class CrOrderInfo(
        var sequence_no:String? = null,
        var shop_info: ShopInfo? = null,
        var product_basical_list:List<CrBasicalVo>? = null,
        var pay_money:Int? = null,
        var pay_type:Short? = null

)
