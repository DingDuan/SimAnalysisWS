package demo.dao;

import demo.entity.MUTModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MUTModelDao extends JpaRepository<MUTModel, Integer> {

    @Query(value = "select * from mut_model", nativeQuery = true)
    List<MUTModel> getMUTModelList();

    @Query(value = "select method_name from mut_model where method_id=?1", nativeQuery = true)
    String getMethodNameByMID(int mid);

    @Query(value = "select * from mut_model where subject=?1", nativeQuery = true)
    List<MUTModel> getALLBySubejct(String subject);

    @Query(value = "select * from mut_model where subject=?1 and cid1=?2 and cid2=?3", nativeQuery = true)
    List<MUTModel> getAllBySubjectAndCids(String subject,int cid1,int cid2);

//    List<Integer> getAllMUTIDList();

}
