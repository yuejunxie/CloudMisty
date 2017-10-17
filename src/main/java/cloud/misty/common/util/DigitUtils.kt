package cloud.misty.common.util

import java.math.BigDecimal

/**
 * @author xieyuejun
 * @created 2017/10/12
 * 小数位数保留工具类
 */
class DigitUtils {
    companion object {

        /**
         * 四舍五入保留整数
         */
        @JvmStatic
        fun toInteger(value: Double) = BigDecimal(value).setScale(0, BigDecimal.ROUND_HALF_UP).toDouble()

        /**
         * 四舍五入保留一位小数
         */
        @JvmStatic
        fun toOneDigits(value: Double) = BigDecimal(value).setScale(1, BigDecimal.ROUND_HALF_UP).toDouble()

        /**
         * 四舍五入保留两位小数
         */
        @JvmStatic
        fun toTwoDigits(value: Double) = BigDecimal(value).setScale(2, BigDecimal.ROUND_HALF_UP).toDouble()

        /**
         * 四舍五入保留三位小数
         */
        @JvmStatic
        fun toThreeDigits(value: Double) = BigDecimal(value).setScale(3, BigDecimal.ROUND_HALF_UP).toDouble()




    }
}