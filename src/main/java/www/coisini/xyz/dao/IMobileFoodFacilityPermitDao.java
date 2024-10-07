package www.coisini.xyz.dao;

import www.coisini.xyz.entity.MobileFoodFacilityPermit;
import www.coisini.xyz.general.GeneralDao;

import java.util.List;

public interface IMobileFoodFacilityPermitDao extends GeneralDao<MobileFoodFacilityPermit> {

    List<MobileFoodFacilityPermit> selectByAll();
}
