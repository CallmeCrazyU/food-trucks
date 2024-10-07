package www.coisini.xyz.service.impl;

import com.alibaba.fastjson2.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import www.coisini.xyz.dao.IMobileFoodFacilityPermitDao;
import www.coisini.xyz.entity.MobileFoodFacilityPermit;
import www.coisini.xyz.service.IMobileFoodFacilityPermitService;

import java.util.List;

@Service
public class MobileFoodFacilityPermitServiceImpl implements IMobileFoodFacilityPermitService {

    @Autowired
    IMobileFoodFacilityPermitDao mobileFoodFacilityPermitDao;

    @Override
    public PageInfo<MobileFoodFacilityPermit> queryByPage(int page, int size) {
        PageHelper.startPage(page, size);
        Example example = new Example(MobileFoodFacilityPermit.class);

        List<MobileFoodFacilityPermit> postings = mobileFoodFacilityPermitDao.selectByExample(example);
        return new PageInfo<>(postings);
    }

    @Override
    public PageInfo<MobileFoodFacilityPermit> queryByPage(JSONObject reqMap) {
        int page = (int)reqMap.getOrDefault("page", 1);
        int size = (int)reqMap.getOrDefault("size", 10);
        String facilityType = (String) reqMap.get("facilityType");

        PageHelper.startPage(page, size);
        Example example = new Example(MobileFoodFacilityPermit.class);
        if (facilityType != null){
            example.and().andEqualTo("facilityType",facilityType);
        }
        List<MobileFoodFacilityPermit> postings = mobileFoodFacilityPermitDao.selectByExample(example);
        return new PageInfo<>(postings);
    }
}
