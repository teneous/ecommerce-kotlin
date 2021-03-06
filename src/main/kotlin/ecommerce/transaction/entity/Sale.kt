package ecommerce.transaction.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Sale(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(name = "carton_no")
    var cartonNo: String? = null,
    @Column(name = "sale_times")
    var saleTimes: LocalDateTime? = null,
    @Column(name = "money")
    var money: Int? = 0,
    @Column(name = "number")
    var discount: Int? = 0,
    @Column(name ="refund_sale_id")
    var refundSaleId :Long?=null

)