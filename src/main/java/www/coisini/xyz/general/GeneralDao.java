package www.coisini.xyz.general;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface GeneralDao<T> extends Mapper<T>, MySqlMapper<T> {
}
