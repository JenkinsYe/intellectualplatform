package cn.zjcj.intellectualplatform.util;

/**
 * @author YJJ
 * @Date: Created in 15:35 2019-11-04
 */
public class ParamCheckUtils {

    public static boolean isValidYear(Integer year) {
        return year >= 1950 && year <= 2050;
    }
}
