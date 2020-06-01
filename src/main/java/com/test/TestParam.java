package com.test;

import com.ucar.anno.ApiParam;
import com.ucar.anno.ApiProperty;

/**
 * Description:
 *
 * @author 李自豪（zihao.li01@ucarinc.com）
 * @since 2020/5/31
 */
@ApiParam
public class TestParam {
    @ApiProperty(value = "sdaadad", desc = "ssssssss", required = true, example = "qeijiwew")
    private String ss;
    private Short aShort;
    private long ll;
}
