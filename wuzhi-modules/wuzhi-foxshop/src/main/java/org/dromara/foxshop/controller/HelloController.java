package org.dromara.foxshop.controller;

import org.dromara.common.core.domain.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author wuzhi 1289782699@qq.com
 * @className HelloController
 * @description 
 * @date 2023年12月11日 18:46:35
 */
@RestController
@RequestMapping("/foxshop")
public class HelloController {

    /**
     * 功能描述: hello
     *
     * @return R<String>
     * @date 2023年12月11日 18:43:36
     */
    @GetMapping("/hello")
    public R<String> hello() {
        return R.ok("hello");
    }
}
