package com.renren.kylin.api;

import com.renren.kylin.bean.message.WxOpXmlMessage;
import com.renren.kylin.bean.message.WxOpXmlOutMessage;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;

import java.util.Map;

/**
 * 处理微信推送消息的处理器接口
 *
 * @author Daniel Qian
 */
public interface WxOpMessageHandler {

  /**
   * @param wxMessage
   * @param context        上下文，如果handler或interceptor之间有信息要传递，可以用这个
   * @param wxOpService
   * @param sessionManager
   * @return xml格式的消息，如果在异步规则里处理的话，可以返回null
   */
  WxOpXmlOutMessage handle(WxOpXmlMessage wxMessage,
                           Map<String, Object> context,
                           WxOpService wxOpService,
                           WxSessionManager sessionManager) throws WxErrorException;

}
