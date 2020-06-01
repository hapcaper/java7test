package com.test;

import com.ucar.anno.ApiProperty;
import com.ucar.anno.ApiResult;

import java.util.List;

/**
 * Description:
 *
 * @author 李自豪（zihao.li01@ucarinc.com）
 * @since 2020/5/31
 */
@ApiResult
public class TestResult extends TestParam {

    @ApiProperty(value = "resultStr", example = "resurrrrr")
    private String resultStr;
    private byte aByte;

    private List<Item> items;
}
