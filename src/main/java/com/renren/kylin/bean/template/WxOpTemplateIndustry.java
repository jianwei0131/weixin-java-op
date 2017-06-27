package com.renren.kylin.bean.template;


import com.renren.kylin.util.json.WxOpGsonBuilder;
import me.chanjar.weixin.common.util.ToStringUtils;

import java.io.Serializable;

/**
 * @author miller
 */
public class WxOpTemplateIndustry implements Serializable {
  private static final long serialVersionUID = -7700398224795914722L;
  private Industry primaryIndustry;
  private Industry secondIndustry;

  public WxOpTemplateIndustry() {
  }

  public WxOpTemplateIndustry(Industry primaryIndustry, Industry secondIndustry) {
    this.primaryIndustry = primaryIndustry;
    this.secondIndustry = secondIndustry;
  }

  /**
   * @author miller
   *         官方文档中，创建和获取的数据结构不一样。所以采用冗余字段的方式，实现相应的接口
   */
  public static class Industry implements Serializable {
    private static final long serialVersionUID = -1707184885588012142L;
    private String id;
    private String firstClass;
    private String secondClass;

    public Industry() {
    }

    public Industry(String id) {
      this.id = id;
    }

    public Industry(String id, String firstClass, String secondClass) {
      this.id = id;
      this.firstClass = firstClass;
      this.secondClass = secondClass;
    }

    @Override
    public String toString() {
      return ToStringUtils.toSimpleString(this);
    }

    public String getId() {
      return this.id;
    }

    public void setId(String id) {
      this.id = id;
    }

    public String getFirstClass() {
      return this.firstClass;
    }

    public void setFirstClass(String firstClass) {
      this.firstClass = firstClass;
    }

    public String getSecondClass() {
      return this.secondClass;
    }

    public void setSecondClass(String secondClass) {
      this.secondClass = secondClass;
    }
  }

  @Override
  public String toString() {
    return ToStringUtils.toSimpleString(this);
  }

  public static WxOpTemplateIndustry fromJson(String json) {
    return WxOpGsonBuilder.create().fromJson(json, WxOpTemplateIndustry.class);
  }

  public String toJson() {
    return WxOpGsonBuilder.create().toJson(this);
  }

  public Industry getPrimaryIndustry() {
    return this.primaryIndustry;
  }

  public void setPrimaryIndustry(Industry primaryIndustry) {
    this.primaryIndustry = primaryIndustry;
  }

  public Industry getSecondIndustry() {
    return this.secondIndustry;
  }

  public void setSecondIndustry(Industry secondIndustry) {
    this.secondIndustry = secondIndustry;
  }
}
