package tech.wetech.weshop.wechat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.wetech.weshop.marketing.po.Topic;
import tech.wetech.weshop.marketing.service.TopicService;
import tech.wetech.weshop.query.PageQuery;
import tech.wetech.weshop.utils.Result;
import tech.wetech.weshop.web.BaseCrudController;

import java.util.List;

@RequestMapping("/wechat/topic")
@RestController
public class WechatTopicController extends BaseCrudController<Topic> {

    @Autowired
    private TopicService topicService;

    @GetMapping("/related")
    public Result<List<Topic>> relatedTopic() {
        return Result.success(topicService.queryPageList(null, new PageQuery().setPageNum(1).setPageSize(4)));
    }
}