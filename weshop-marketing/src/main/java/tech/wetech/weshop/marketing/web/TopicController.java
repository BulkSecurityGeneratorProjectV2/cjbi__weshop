package tech.wetech.weshop.marketing.web;

import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.api.BaseApi;
import tech.wetech.weshop.marketing.api.TopicApi;
import tech.wetech.weshop.marketing.po.Topic;

@RestController
public class TopicController extends BaseApi<Topic> implements TopicApi {
}
