package demo.dao;

import demo.entity.TFModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
  * @Date 2018/6/26 下午3:13
  */
public interface TFModelDao extends JpaRepository<TFModel, Integer> {

    @Query(value = "select * from tf_model where mid=?1", nativeQuery = true)
    List<TFModel> getTFModelListByMID(Integer mid);

    @Query(value = "select id from tf_model where mid=?1 and cid=?2", nativeQuery = true)
    int getIdByMIDAndCid(int mid, int cid);

    @Query(value = "select * from tf_model where mid=?1 and cid=?2", nativeQuery = true)
    List<TFModel> getTFModelListByMIDAndCid(int mid,int cid);

    @Query(value = "select * from tf_model where cid=?1 and subject=?2", nativeQuery = true)
    List<TFModel> getTFModelListByCidAndSubject(Integer cid,String subject);

    @Query(value = "select * from tf_model where subject=?1", nativeQuery = true)
    List<TFModel> getTFModelListBySubject(String subject);

    @Query(value = "select fragment from tf_model where subject=?1 and mid=?2 and cid=?3", nativeQuery = true)
    String getTFBySubjectAndMidAndCid(String subject,int mid,int cid);
//
//    List<TFModel> searchTFModelListByParameter(int cid1, int cid2, int mid);
}
