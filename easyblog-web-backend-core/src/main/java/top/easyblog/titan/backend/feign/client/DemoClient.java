package top.easyblog.titan.backend.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import top.easyblog.titan.backend.bean.UserDetailsBean;
import top.easyblog.titan.backend.feign.config.CommonFeignConfiguration;
import top.easyblog.titan.backend.feign.internal.BaseClientResponse;
import top.easyblog.titan.backend.feign.internal.Verify;
import top.easyblog.titan.backend.request.QueryUserRequest;

/**
 * @author: frank.huang
 * @date: 2021-11-14 20:29
 */
@FeignClient(name = "demo",url = "${urls.demo}",configuration = CommonFeignConfiguration.class)
public interface DemoClient extends Verify {

    @GetMapping(value = "/v1/demo/objects")
    BaseClientResponse<UserDetailsBean> getUserDetailBean(@SpringQueryMap QueryUserRequest request);


}
