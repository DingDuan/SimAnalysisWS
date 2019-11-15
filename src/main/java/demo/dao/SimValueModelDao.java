package demo.dao;

import demo.entity.SimValueModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
  * @Date 2018/6/26 下午7:18
  */
@Repository
public interface SimValueModelDao extends JpaRepository<SimValueModel, Integer> {

    @Query(value = "select * from sim_value_model where cid1=?1 and cid2=?2 and subject=?3", nativeQuery = true)
    List<SimValueModel> searchSimValueAllContentByPair(int cid1, int cid2, String subject);

    @Query(value = "select sim_value from sim_value_model where (cid1=?1 and cid2=?2) or (cid1=?2 and cid2=?1) and subject=?3", nativeQuery = true)
    List<Double> searchSimValueByPair(int cid1, int cid2, String subject);
//
//    List<SimValueModel> searchSimValueByParameterByCategory(int cid1, int cid2, int category);
//
//    List<SimValueModel> searchSimValueByParameter(int cid1, int cid2, int minSV, int maxSV);
//
//    double searchSimValueByParameterByMID(int mid, int cid1, int cid2);
//
//    int searchMIDByParametersByMaxSimValue(int cid1, int cid2, double maxSimValue);
}
