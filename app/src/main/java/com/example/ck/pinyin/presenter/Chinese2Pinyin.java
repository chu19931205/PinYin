package com.example.ck.pinyin.presenter;

import com.github.stuxuhai.jpinyin.PinyinException;
import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;

/**
 * Created by CY-ChuKuang on 2018/3/23.
 */

public class Chinese2Pinyin {
    public static String toPinyin(String str) {
        try {
            String pinyin = PinyinHelper.convertToPinyinString(str, " ", PinyinFormat.WITH_TONE_MARK);
            return pinyin;
        } catch (PinyinException e) {
            e.printStackTrace();
        }
        return "";
    }
}
