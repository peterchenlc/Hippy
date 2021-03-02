package com.tencent.mtt.hippy.adapter.dt;

import com.tencent.mtt.hippy.common.HippyMap;

public interface HippyDtAdapter {
  /**
   * 设置页面及相关参数
   *
   * @param page   Page对象，支持View/Fragment/Activity
   * @param params Page参数
   */
  void setDtPageParams(Object page, HippyMap params);

  /**
   * 设置元素及其相关参数
   *
   * @param element 元素对象，支持View
   * @param params  元素参数
   */
  void setDtElementParams(Object element, HippyMap params);
}
