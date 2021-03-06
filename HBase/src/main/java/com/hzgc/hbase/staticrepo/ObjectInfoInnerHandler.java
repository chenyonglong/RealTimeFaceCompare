package com.hzgc.hbase.staticrepo;

import com.hzgc.dubbo.staticrepo.ObjectInfo;

import java.util.List;
import java.util.Map;

public interface ObjectInfoInnerHandler {
    /**
     * 根据人员类型keys 进行查询，返回rowkeys 和features ，
     * 返回rowkeys 和特征值列表 （内-----To刘善斌） （李第亮）
     * @param pkeys
     * @return
     */
    public List<Map<String, ObjectInfo>> searchByPkeys(List<String> pkeys);
}
