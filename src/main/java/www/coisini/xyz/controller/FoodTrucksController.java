package www.coisini.xyz.controller;

import com.alibaba.fastjson2.JSONObject;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import www.coisini.xyz.entity.MobileFoodFacilityPermit;
import www.coisini.xyz.service.IMobileFoodFacilityPermitService;
import www.coisini.xyz.utils.ResultDt;

import java.util.List;

@RestController
@RequestMapping("api")
public class FoodTrucksController {
    Logger log = LoggerFactory.getLogger(FoodTrucksController.class);

    @Autowired
    IMobileFoodFacilityPermitService mobileFoodFacilityPermitService;

    @RequestMapping("trucks")
    public ResultDt trucks(@RequestBody JSONObject reqMap) {
        PageInfo<MobileFoodFacilityPermit> rows = mobileFoodFacilityPermitService.queryByPage(reqMap);
        return ResultDt.success(rows);
    }
}
