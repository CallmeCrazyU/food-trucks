package www.coisini.xyz.service;

import com.alibaba.fastjson2.JSONObject;
import com.github.pagehelper.PageInfo;
import www.coisini.xyz.entity.MobileFoodFacilityPermit;

import java.util.List;

public interface IMobileFoodFacilityPermitService {
    PageInfo<MobileFoodFacilityPermit> queryByPage(int page, int size);

    PageInfo<MobileFoodFacilityPermit> queryByPage(JSONObject reqMap);
}
