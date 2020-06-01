package com.test;

import com.ucar.anno.ApiAdapter;

/**
 * Description:
 *
 * @author 李自豪（zihao.li01@ucarinc.com）
 * @since 2020/5/31
 */
@ApiAdapter(value = "/testUrl", desc = "自动倒入测试", apiParam = TestParam.class, apiResult = TestResult.class, name = "自动倒入测试", method = "POST")
public class TestAdapter {

    public Object invoke(TestParam param) {
        return new TestResult();
    }

}
