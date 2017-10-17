package cloud.misty.common.util

import java.util.regex.Pattern

/**
 * @author xieyuejun
 * @created 2017/10/13
 *
 * 格式匹配工具
 */
class PatternUtils {
    companion object {
        @JvmField
        val emailPattern = Pattern.compile("")

        @JvmStatic
        fun isEmail(email: String) = emailPattern.matcher(email).matches()

    }
}